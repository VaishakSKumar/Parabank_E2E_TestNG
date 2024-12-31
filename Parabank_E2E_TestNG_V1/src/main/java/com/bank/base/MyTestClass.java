package com.bank.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyTestClass {
	private static final Logger logger = LogManager.getLogger(MyTestClass.class);

    public static void logTest() {
        logger.debug("This is a DEBUG message");
        logger.info("This is an INFO message");
        logger.error("This is an ERROR message");
    }
    
    public static void main(String[] args) {
    	logTest();
	}
}
