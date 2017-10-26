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
	private int lfrKills;
    private long lfrTimestamp;
    private int normalKills;
    private long normalTimestamp;
    private int heroicKills;
    private long heroicTimestamp;
    private int mythicKills;
    private long mythicTimestamp;

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
	
	public int getLfrKills() {
		return lfrKills;
	}
	public void setLfrKills(int lfrKills) {
		this.lfrKills = lfrKills;
	}
	public long getLfrTimestamp() {
		return lfrTimestamp;
	}
	public void setLfrTimestamp(long lfrTimestamp) {
		this.lfrTimestamp = lfrTimestamp;
	}
	public int getNormalKills() {
		return normalKills;
	}
	public void setNormalKills(int normalKills) {
		this.normalKills = normalKills;
	}
	public long getNormalTimestamp() {
		return normalTimestamp;
	}
	public void setNormalTimestamp(long normalTimestamp) {
		this.normalTimestamp = normalTimestamp;
	}
	public int getHeroicKills() {
		return heroicKills;
	}
	public void setHeroicKills(int heroicKills) {
		this.heroicKills = heroicKills;
	}
	public long getHeroicTimestamp() {
		return heroicTimestamp;
	}
	public void setHeroicTimestamp(long heroicTimestamp) {
		this.heroicTimestamp = heroicTimestamp;
	}
	public int getMythicKills() {
		return mythicKills;
	}
	public void setMythicKills(int mythicKills) {
		this.mythicKills = mythicKills;
	}
	public long getMythicTimestamp() {
		return mythicTimestamp;
	}
	public void setMythicTimestamp(long mythicTimestamp) {
		this.mythicTimestamp = mythicTimestamp;
	}
	@Override
	public String toString() {
		Gson gson = new GsonBuilder().setPrettyPrinting()
			    .disableHtmlEscaping().create();
		return gson.toJson(this);
	}
	
}
