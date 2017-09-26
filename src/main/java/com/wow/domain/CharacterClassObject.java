package com.wow.domain;

import java.util.HashMap;
import java.util.Map;

import com.wow.dao.CharacterDao;
import com.wow.entity.CharacterClass;
import com.wow.exception.WowException;

public class CharacterClassObject {

	private static final Map<Integer, CharacterClass> map;
	
	static {
		map = new HashMap<>();
		CharacterDao dao = new CharacterDao();
		dao.getCharacterClasses(null).stream().forEach(wowclass -> map.put(wowclass.getId(), wowclass));
	}

	
    public CharacterClass get(Integer key) {
        if (key == null) {
            throw new WowException("Null key.");
        }
        CharacterClass object = opt(key);
        if (object == null) {
            throw new WowException("Character class object not found not found.");
        }
        return object;
    }
	
    private CharacterClass opt(Integer key) {
        return key == null ? null : map.get(key);
    }
    
    
}
