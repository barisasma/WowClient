package com.wow.dao;

import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Nonnull;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wow.domain.Region;
import com.wow.entity.Boss;
import com.wow.exception.BossNotFoundException;
import com.wow.util.WowConnection;
import com.wow.util.Util;

public class BossDao extends Dao{

	
	public BossDao() {
		this.region = Region.EN_US;
	}
	
	private String boss="boss/";

	public List<Boss> getBosses(@Nonnull Region region) {
		StringBuilder param = new StringBuilder();
		param.append(boss).append(String.format(Util.LOCALE,region==null?this.region:region.toString()));
		String jsonString = WowConnection.getJsonString(param.toString());
		JSONObject jsonObj = new JSONObject(jsonString);
		JSONArray jsonArray = jsonObj.getJSONArray("bosses");
		Type reflectType = new TypeToken<List<Boss>>(){}.getType();
		return new Gson().fromJson(String.valueOf(jsonArray), reflectType);
	}

	public Boss getBoss(@Nonnull String id,Region region) {
		Util.checkNotNull(id);
		StringBuilder param = new StringBuilder();
		param.append(boss).append(id).append(String.format(Util.LOCALE, region==null?this.region:region.toString()));
		String jsonString = WowConnection.getJsonString(param.toString());
		if(checkWowException(jsonString))
			throw new BossNotFoundException("Boss Not Found");
		return new Gson().fromJson(jsonString, Boss.class);
	}
	
	public Boss getBoss(@Nonnull String id) {
		try {
			Util.checkNotNull(id);
			return getBoss(id, this.region);
		} catch (BossNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Boss> getBosses() {
		return getBosses(this.region);
	}

}
