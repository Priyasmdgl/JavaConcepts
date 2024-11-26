package Java2;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class log4j_propertyconfigurator {

	static Logger logger = Logger.getLogger(log4j_propertyconfigurator.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("Debug");
        logger.info("Info");
        logger.warn("Warning");
        logger.error("Error");
        logger.fatal("Fatal");

	}

}
