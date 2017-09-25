package com.wow.entity;

import com.google.gson.annotations.SerializedName;

public class Character {
	
	/*{
	    "lastModified": 1506289253000,
	    "name": "Polon",
	    "realm": "Outland",
	    "battlegroup": "Misery",
	    "class": 2,
	    "race": 3,
	    "gender": 0,
	    "level": 110,
	    "achievementPoints": 5520,
	    "thumbnail": "outland/210/89571794-avatar.jpg",
	    "calcClass": "b",
	    "faction": 0,
	    "totalHonorableKills": 1130
	}*/
	private long lastModified;
	private String name;
	private String realm;
	private String battlegroup;
	@SerializedName("class")
	private int classID;
	private int race;
	private String level;
	private String achievementPoints;
	private String thumbnail;
	private String calcClass; 
	private int faction;
	private long totalHonorableKills;
	public long getLastModified() {
		return lastModified;
	}
	public void setLastModified(long lastModified) {
		this.lastModified = lastModified;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRealm() {
		return realm;
	}
	public void setRealm(String realm) {
		this.realm = realm;
	}
	public String getBattlegroup() {
		return battlegroup;
	}
	public void setBattlegroup(String battlegroup) {
		this.battlegroup = battlegroup;
	}
	public int getClassID() {
		return classID;
	}
	public void setClassID(int classID) {
		this.classID = classID;
	}
	public int getRace() {
		return race;
	}
	public void setRace(int race) {
		this.race = race;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getAchievementPoints() {
		return achievementPoints;
	}
	public void setAchievementPoints(String achievementPoints) {
		this.achievementPoints = achievementPoints;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getCalcClass() {
		return calcClass;
	}
	public void setCalcClass(String calcClass) {
		this.calcClass = calcClass;
	}
	public int getFaction() {
		return faction;
	}
	public void setFaction(int faction) {
		this.faction = faction;
	}
	public long getTotalHonorableKills() {
		return totalHonorableKills;
	}
	public void setTotalHonorableKills(long totalHonorableKills) {
		this.totalHonorableKills = totalHonorableKills;
	}
	
}
