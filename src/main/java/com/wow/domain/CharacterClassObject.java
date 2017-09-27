package com.wow.domain;

import java.util.HashMap;
import java.util.Map;

import com.wow.dao.CharacterDao;
import com.wow.entity.CharacterClass;
import com.wow.exception.WowException;

public class CharacterClassObject {

	private CharacterClassObject() {
		throw new IllegalAccessError("Static class");
	}

	private static Map<Integer, CharacterClass> map;

	static {
		if(map==null) {
			map = new HashMap<>();
			CharacterDao dao = new CharacterDao();
			dao.getCharacterClasses(null).stream().forEach(wowclass -> map.put(wowclass.getId(), wowclass));
		}
	}


	public static CharacterClass get(Integer key) {
		if (key == null) {
			throw new WowException("Null key.");
		}
		CharacterClass object = map.get(key);
		if (object == null) {
			throw new WowException("Character class object not found not found.");
		}
		return object;
	}

}
