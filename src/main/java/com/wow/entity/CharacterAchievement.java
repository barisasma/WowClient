package com.wow.entity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CharacterAchievement {
	private int id;
	private String title;
	private double points;
	private String description;
	//private List<Item> rewardItems;
	private String icon;
	private boolean accountWide;
	private int factionId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPoints() {
		return points;
	}
	public void setPoints(double points) {
		this.points = points;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public boolean isAccountWide() {
		return accountWide;
	}
	public void setAccountWide(boolean accountWide) {
		this.accountWide = accountWide;
	}
	public int getFactionId() {
		return factionId;
	}
	public void setFactionId(int factionId) {
		this.factionId = factionId;
	}
	
	@Override
	public String toString() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(this);
	}
	
	
}
