package com.wow.domain;

public enum LogType {

	EXCEPTION("exception%u.%g.log"),
	DAO("daolog%u.%g.log");

	private String text;

	LogType(String text){
		this.text = text;
	}

	@Override
	public String toString() {

		return text;
	}

}
