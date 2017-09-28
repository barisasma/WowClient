package com.wow.domain;

public enum Field {
	ACHIEVEMENTS("achievements"),
	FEED("feed");

	private final String text;

	private Field(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
}
