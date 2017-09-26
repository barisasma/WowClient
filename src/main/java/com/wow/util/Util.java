package com.wow.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;
import com.wow.entity.BlizzardError;

public class Util {

	public static final ClassLoader loader = Util.class.getClassLoader();
	public static final  String URLRETURN = "{\"status\":\"nok\", \"reason\":\"URL Connection Error\"}";
	public static final String APIKEY = "apikey=%s";
	public static final String ADDRESS = "https://eu.api.battle.net/wow/";
	public static final String LOCALE = "?locale=%s";
	private Util() {
		throw new IllegalStateException("Utility class");
	}

	public static <T> T checkNotNull(T reference) {
		if (reference == null) {
			throw new NullPointerException();
		}
		return reference;
	}

	public static String getKey() {
		URL resource = loader.getResource("key.txt");
		File f = new File(resource.getPath());
		try {
			return FileUtils.readFileToString(f, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean checkWowException(String jsonString) {
		BlizzardError error = new Gson().fromJson(jsonString, BlizzardError.class);
		return error.getStatus()!=null;
	}

}
