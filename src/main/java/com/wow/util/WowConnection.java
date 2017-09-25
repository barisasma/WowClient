package com.wow.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WowConnection {


	private WowConnection() {
		throw new IllegalStateException("Utility class");
	}

	public static String getJsonString(String param) {
		String apiKey = "apikey=%s";

		String adress = "https://eu.api.battle.net/wow/";
		String url = String.format("%s%s&%s", adress,param,String.format(apiKey, Util.getKey()));
		HttpURLConnection urlConnection;
		String ret = "";
		BufferedReader reader = null;
		try {
			urlConnection = (HttpURLConnection) new URL(url).openConnection(); 
			String line;
			StringBuilder sb = new StringBuilder();
			int responseCode = urlConnection.getResponseCode();
			if((responseCode == 404) || (responseCode == 500)) {
				reader = new BufferedReader(new InputStreamReader(urlConnection.getErrorStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			}
			while ((line = reader.readLine()) != null) {
				sb.append(line).append('\n');
			}
			ret = sb.toString();
		} catch (IOException e1) {
			ret = "{\"status\":\"nok\", \"reason\":\"URL Connection Error\"}";
		}
		finally {
			if (reader != null) try {
				reader.close();
			} catch (IOException ignored) {
			}

		}

		return ret;
	}

}
