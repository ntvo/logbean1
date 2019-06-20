package com.evt.demo.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DexLogger  {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());



	public void dexlogger(LogLevel dexLoggerlevel, Class<?> class1, String txt) {
		switch (dexLoggerlevel) {
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
