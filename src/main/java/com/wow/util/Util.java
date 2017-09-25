package com.wow.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class Util {

	static ClassLoader loader = Util.class.getClassLoader();
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

}
