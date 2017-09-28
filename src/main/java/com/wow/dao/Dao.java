package com.wow.dao;

import com.google.gson.Gson;
import com.wow.domain.Region;
import com.wow.entity.BlizzardError;

public class Dao {

	protected Region region;
	
	public boolean checkWowException(String jsonString) {
		BlizzardError error = new Gson().fromJson(jsonString, BlizzardError.class);
		return error.getStatus()!=null;
	}
	
	public Region checkRegion(Region region) {
		return region == null ? this.region : region;
	}
	
}
