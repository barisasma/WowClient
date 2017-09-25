package com.wow.entity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BlizzardError {
	
	private String status;
	private String reason;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	@Override
	public String toString() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(this);
	}

}
