package com.wow.entity;

public class Npc {
	
	private int id;
	private String name;
	private String urlSlug;
	private int creatureDisplayId;

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
	public int getCreatureDisplayId() {
		return creatureDisplayId;
	}
	public void setCreatureDisplayId(int creatureDisplayId) {
		this.creatureDisplayId = creatureDisplayId;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Npc [id=");
		builder.append(id);
		builder.append(", \nname=");
		builder.append(name);
		builder.append(", \nurlSlug=");
		builder.append(urlSlug);
		builder.append(", \ncreatureDisplayId=");
		builder.append(creatureDisplayId);
		builder.append("]");
		return builder.toString();
	}
	
}
