package com.evt.demo.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Logfile {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public void logLevel(DexLogger dexLogger, String sourcefile, String txt) {
		switch (dexLogger) {
		case INFO:
			logger.info(sourcefile + " : " + txt);
			break;
		case DEBUG:
			logger.debug(sourcefile + " : " + txt);
			break;
		case WARN:
			logger.warn(sourcefile + " : " + txt);
			break;
		case TRACE:
			logger.trace(sourcefile + " : " + txt);
			break;
		case ERROR:
			logger.error(sourcefile + " : " + txt);
			break;
		}
	}

	public void logLevel(DexLogger dexLogger, Class<?> class1, String txt) {
		switch (dexLogger) {
		case INFO:
			logger.info(class1.toString() + " : " + txt);
			break;
		case DEBUG:
			logger.debug(class1.toString()  + " : " + txt);
			break;
		case WARN:
			logger.warn(class1.toString()  + " : " + txt);
			break;
		case TRACE:
			logger.trace(class1.toString()  + " : " + txt);
			break;
		case ERROR:
			logger.error(class1.toString()  + " : " + txt);
			break;
		}
		
	}

}
