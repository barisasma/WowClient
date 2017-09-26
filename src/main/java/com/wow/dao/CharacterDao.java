package com.wow.dao;

import java.lang.reflect.Type;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wow.domain.CharacterClassObject;
import com.wow.domain.Region;
import com.wow.entity.Character;
import com.wow.entity.CharacterClass;
import com.wow.exception.CharacterNotFoundException;
import com.wow.util.Util;
import com.wow.util.WowConnection;

public class CharacterDao extends Dao{
	
	private Region region;
	
	public CharacterDao() {
		this.region = Region.EN_US;
	}
	
	
	private String dataCharacter = "data/character/";
	private String wowCharacter = "character/%s/%s";
	private String classes = "classes";
	
	public Character getCharacter(String realm,String characterName,Region region) {
		StringBuilder param = new StringBuilder();
		param.append(String.format(wowCharacter, realm,characterName)).append(String.format(Util.LOCALE,region==null?this.region:region.toString()));
		String jsonString = WowConnection.getJsonString(param.toString());
		if(checkWowException(jsonString))
			throw new CharacterNotFoundException("Character Not Found");
		Character myCharacter = new Gson().fromJson(jsonString, Character.class);
		myCharacter.setCharacterClass(new CharacterClassObject().get(myCharacter.getClassId()));
		return myCharacter;
	}
	
	public List<CharacterClass> getCharacterClasses(Region region) {
		StringBuilder param = new StringBuilder();
		param.append(dataCharacter).append(classes).append(String.format(Util.LOCALE,region==null?this.region:region.toString()));
		String jsonString = WowConnection.getJsonString(param.toString());
		JSONObject jsonObj = new JSONObject(jsonString);
		JSONArray jsonArray = jsonObj.getJSONArray("classes");
		Type reflectType = new TypeToken<List<CharacterClass>>(){}.getType();
		return new Gson().fromJson(String.valueOf(jsonArray), reflectType);
	}
	
	
}
