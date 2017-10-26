package com.wow.dao;

import com.google.gson.Gson;
import com.wow.domain.LogType;
import com.wow.domain.Region;
import com.wow.entity.BlizzardError;
import com.wow.util.WowLog;

public class Dao {

	protected Region region;
	protected static WowLog exceptionLogger = new WowLog(Dao.class.getName(), false,LogType.EXCEPTION);
	protected static WowLog jsonLogger = new WowLog(Dao.class.getName(), false,LogType.DAO);
	
	public boolean checkWowException(String jsonString) {
		BlizzardError error = new Gson().fromJson(jsonString, BlizzardError.class);
		return error.getStatus() != null;
	}
	
	public Region checkRegion(Region region) {
		return region == null ? this.region : region;
	}
	
}
