package com.wow.entity;

public class CharacterFeed {

	private String type;
	private long timestamp;
	private Achievement achievement;
	private boolean featOfStrength;
	private int quantity;
	private String name;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public Achievement getAchievement() {
		return achievement;
	}
	public void setAchievement(Achievement achievement) {
		this.achievement = achievement;
	}
	public boolean isFeatOfStrength() {
		return featOfStrength;
	}
	public void setFeatOfStrength(boolean featOfStrength) {
		this.featOfStrength = featOfStrength;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
