package com.evt.demo.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Logfile {
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());
	 @Autowired
		private Loglevel log_level;
	 public void logLevel(String loglevel, String sourcefile, String txt)
	 {
		 if(loglevel.equalsIgnoreCase(log_level.INFO))  logger.info(sourcefile +" : "+ txt);
		 else if(loglevel.equalsIgnoreCase(log_level.DEBUG))  logger.debug(sourcefile +" : "+ txt);
		 else if(loglevel.equalsIgnoreCase(log_level.WARN))  logger.warn(sourcefile +" : "+ txt);
		 else if(loglevel.equalsIgnoreCase(log_level.TRACE))  logger.trace(sourcefile +" : "+ txt);
		 else if(loglevel.equalsIgnoreCase(log_level.ERROR))  logger.error(sourcefile +" : "+ txt);
		
	 }
	
}
