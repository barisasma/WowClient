package com.wow.entity;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Boss {
	
	private int id;
	private String name;
	private String urlSlug;
	private String description;
	private int zoneId;
	private boolean availableInNormalMode;
	private boolean availableInHeroicMode;
	private long health;
	private long heroicHealth;
	private long level;
	private long heroicLevel;
	private long journalId;
	private List<Npc> npcs;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrlSlug() {
		return urlSlug;
	}
	public void setUrlSlug(String urlSlug) {
		this.urlSlug = urlSlug;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getZoneId() {
		return zoneId;
	}
	public void setZoneId(int zoneId) {
		this.zoneId = zoneId;
	}
	public boolean isAvailableInNormalMode() {
		return availableInNormalMode;
	}
	public void setAvailableInNormalMode(boolean availableInNormalMode) {
		this.availableInNormalMode = availableInNormalMode;
	}
	public boolean isAvailableInHeroicMode() {
		return availableInHeroicMode;
	}
	public void setAvailableInHeroicMode(boolean availableInHeroicMode) {
		this.availableInHeroicMode = availableInHeroicMode;
	}
	public long getHealth() {
		return health;
	}
	public void setHealth(long health) {
		this.health = health;
	}
	public long getHeroicHealth() {
		return heroicHealth;
	}
	public void setHeroicHealth(long heroicHealth) {
		this.heroicHealth = heroicHealth;
	}
	public long getLevel() {
		return level;
	}
	public void setLevel(long level) {
		this.level = level;
	}
	public long getHeroicLevel() {
		return heroicLevel;
	}
	public void setHeroicLevel(long heroicLevel) {
		this.heroicLevel = heroicLevel;
	}
	public long getJournalId() {
		return journalId;
	}
	public void setJournalId(long journalId) {
		this.journalId = journalId;
	}
	public List<Npc> getNpcs() {
		return npcs;
	}
	public void setNpcs(List<Npc> npcs) {
		this.npcs = npcs;
	}
	
	@Override
	public String toString() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(this);
	}
	
}
