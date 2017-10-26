package com.wow.util;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.wow.domain.LogType;

public class WowLog {
	
	private Logger logger;
	private FileHandler fh;
	
	
	public WowLog(String className,boolean overWrite,LogType type) {
		try {
			logger = Logger.getLogger(className);
			fh = new FileHandler(type.toString(),overWrite);
	        fh.setFormatter(new SimpleFormatter());  
			logger.addHandler(fh);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void log(Level level, String msg) {
		logger.log(level,msg);
	}
	public void log(Level level, Exception e) {
		logger.log(level, "Logged Exception", e);
	}
	

}
