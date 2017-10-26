package com.wow.entity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CharacterClass {

	private int id;
	private int mask;
	private String powerType;
	private String name;
	
	public CharacterClass(int id,int mask, String powerType, String name) {
		this.id=id;
		this.mask=mask;
		this.powerType=powerType;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMask() {
		return mask;
	}
	public void setMask(int mask) {
		this.mask = mask;
	}
	public String getPowerType() {
		return powerType;
	}
	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		Gson gson = new GsonBuilder().setPrettyPrinting()
			    .disableHtmlEscaping().create();
		return gson.toJson(this);
	}
}
