package com.wow.dao;

import java.lang.reflect.Type;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wow.domain.Region;
import com.wow.entity.BlizzardError;
import com.wow.entity.Boss;
import com.wow.exception.BossNotFoundException;
import com.wow.util.WowConnection;
import com.wow.util.Util;

public class BossDao {

	private String boss="boss/";
	private String locale = "?locale=%s";
	private Region region;

	public BossDao() {
		this.region = Region.EN_US;
	}

	public List<Boss> getBosses(Region region) {
		Util.checkNotNull(region);
		StringBuilder param = new StringBuilder();
		param.append(boss);
		param.append(boss).append(String.format(locale, region.toString()));
		String jsonString = WowConnection.getJsonString(param.toString());
		JSONObject jsonObj = new JSONObject(jsonString);
		JSONArray jsonArray = jsonObj.getJSONArray("bosses");
		Type reflectType = new TypeToken<List<Boss>>(){}.getType();
		return new Gson().fromJson(String.valueOf(jsonArray), reflectType);
	}

	public Boss getBoss(String id,Region region) throws BossNotFoundException {
		Util.checkNotNull(id);
		StringBuilder param = new StringBuilder();
		param.append(boss).append(id).append(String.format(locale, region.toString()));
		String jsonString = WowConnection.getJsonString(param.toString());
		BlizzardError error = new Gson().fromJson(jsonString, BlizzardError.class);
		if(error.getStatus()!=null)
			throw new BossNotFoundException();
		return new Gson().fromJson(jsonString, Boss.class);
	}
	
	public Boss getBoss(String id) {
		Util.checkNotNull(id);
		try {
			return getBoss(id, this.region);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Boss> getBosses() {
		return getBosses(this.region);
	}

}
