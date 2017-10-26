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
		String url = String.format("%s%s&%s", Util.ADDRESS,param,String.format(Util.APIKEY, Util.getKey()));
		HttpURLConnection urlConnection = null;
		String ret = "";
		try {
			urlConnection = (HttpURLConnection) new URL(url).openConnection(); 
			BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line;
			StringBuilder sb = new StringBuilder();
			while ((line = reader.readLine()) != null) {
				sb.append(line).append('\n');
			}
			ret = sb.toString();
			reader.close();
		}catch(IOException e) {
			ret = Util.URLRETURN;
		}
		return ret;
	}

}
