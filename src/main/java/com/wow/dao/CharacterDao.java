package com.wow.dao;

import java.lang.reflect.Type;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wow.domain.CharacterClassObject;
import com.wow.domain.Field;
import com.wow.domain.Region;
import com.wow.entity.Character;
import com.wow.entity.CharacterClass;
import com.wow.exception.CharacterNotFoundException;
import com.wow.util.ParamBuilder;
import com.wow.util.WowConnection;

public class CharacterDao extends Dao{
	
	
	public CharacterDao() {
		this.region = Region.EN_US;
	}
	
	private String wowCharacter = "character";
	private String classes = "data/character/classes";
	
	public Character getCharacter(String realm,String characterName,Region region) {
		ParamBuilder param = new ParamBuilder();
		param.addParam(wowCharacter,realm,characterName).addFields(checkRegion(region));
		String jsonString = WowConnection.getJsonString(param.toString());
		if(checkWowException(jsonString))
			throw new CharacterNotFoundException("Character Not Found");
		Character myCharacter = new Gson().fromJson(jsonString, Character.class);
		myCharacter.setCharacterClass(CharacterClassObject.get(myCharacter.getClassId()));
		return myCharacter;
	}
	
	public List<CharacterClass> getCharacterClasses(Region region) {
		ParamBuilder param = new ParamBuilder();
		param.addParam(classes).addFields(checkRegion(region));
		String jsonString = WowConnection.getJsonString(param.toString());
		JSONObject jsonObj = new JSONObject(jsonString);
		JSONArray jsonArray = jsonObj.getJSONArray("classes");
		Type reflectType = new TypeToken<List<CharacterClass>>(){}.getType();
		return new Gson().fromJson(String.valueOf(jsonArray), reflectType);
	}
	
	
	public Character getCharacterAchi(String realm,String characterName,Region region) {
		ParamBuilder param = new ParamBuilder();
		param.addParam(wowCharacter, realm,characterName).addFields(checkRegion(region), Field.ACHIEVEMENTS.toString());
		String jsonString = WowConnection.getJsonString(param.toString());
		JSONObject jsonObj = new JSONObject(jsonString);
		JSONArray achiCompleted= jsonObj.getJSONObject(Field.ACHIEVEMENTS.toString()).getJSONArray("achievementsCompleted");
		int[] achievements = new int[achiCompleted.length()];
		for (int i = 0; i < achiCompleted.length(); ++i) {
		    achievements[i] = achiCompleted.optInt(i);
		}
		if(checkWowException(jsonString))
			throw new CharacterNotFoundException("Character Not Found");
		Character myCharacter = new Gson().fromJson(jsonString, Character.class);
		myCharacter.setCharacterClass(CharacterClassObject.get(myCharacter.getClassId()));
		myCharacter.setAchievementsCompleted(achievements);
		return myCharacter;
	}
	
}
