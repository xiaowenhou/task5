package com.putaoteng.task5.utils;

import org.apache.log4j.Logger;

public class Log {
	private static Logger logger = Logger.getLogger(Log.class);

	public static void loggerCreate(LogLevel logLevel, String message) {
		switch (logLevel) {
		case DEBUG:
			logger.debug(message);
			break;
		case INFO:
			logger.info(message);
			break;
		case WARN:
			logger.warn(message);
			break;
		case ERROR:
			logger.error(message);
			break;
		default:
			break;
		}
	}
}
