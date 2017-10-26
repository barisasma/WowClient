package com.wow.dao;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wow.domain.Field;
import com.wow.domain.Region;
import com.wow.entity.Achievement;
import com.wow.util.ParamBuilder;
import com.wow.util.WowConnection;

public class DataSourcesDao extends Dao{

	private String characterAchi = "data/character/achievements";

	public DataSourcesDao() {
		this.region = Region.EN_US;
	}


	public List<Achievement> getCharacterAchievements(Region region){
		ParamBuilder param = new ParamBuilder();
		param.addParam(characterAchi).addFields(checkRegion(region));
		String jsonString = WowConnection.getJsonString(param.toString());
		JSONObject jsonObject = new JSONObject(jsonString);
		JSONArray jsonArray = jsonObject.getJSONArray(Field.ACHIEVEMENTS.toString());
		List<Achievement> achiList = new ArrayList<>();
		Type reflectType = new TypeToken<List<Achievement>>(){}.getType();
		Gson gson= new Gson();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject object = jsonArray.getJSONObject(i);
			JSONArray array2 = object.getJSONArray(Field.ACHIEVEMENTS.toString());
			achiList.addAll(gson.fromJson(String.valueOf(array2), reflectType));
			try {
				JSONArray categories = object.getJSONArray("categories");
				for (int j = 0; j < categories.length(); j++) {
					achiList.addAll(gson.fromJson(String.valueOf(categories.getJSONObject(j)
							.getJSONArray(Field.ACHIEVEMENTS.toString())), 
							reflectType)); 
				}
			} catch (JSONException e) {
				exceptionLogger.log(Level.SEVERE, e);
			}
		}
		return achiList;
	}

}
