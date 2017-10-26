package com.wow.entity;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class Character {

	private long lastModified;
	private String name;
	private String realm;
	private String battlegroup;
	private CharacterClass characterClass;
	@SerializedName("class")
	private int classId;
	private int race;
	private String level;
	private String achievementPoints;
	private String thumbnail;
	private String calcClass; 
	private int faction;
	private long totalHonorableKills;
	private CharacterAchievements achievements;
	private List<CharacterFeed> feed;
	private CharacterProgression progression;
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
	public CharacterClass getCharacterClass() {
		return characterClass;
	}
	public void setCharacterClass(CharacterClass characterClass) {
		this.characterClass = characterClass;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
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

	public CharacterAchievements getAchievements() {
		return achievements;
	}
	
	public void setAchievements(CharacterAchievements achievements) {
		this.achievements = achievements;
	}
	
	public List<CharacterFeed> getFeed() {
		return feed;
	}
	public void setFeed(List<CharacterFeed> feed) {
		this.feed = feed;
	}
	public CharacterProgression getProgression() {
		return progression;
	}
	public void setProgression(CharacterProgression progression) {
		this.progression = progression;
	}
	@Override
	public String toString() {
		Gson gson = new GsonBuilder().setPrettyPrinting()
			    .disableHtmlEscaping().create();
		return gson.toJson(this);
	}

}
