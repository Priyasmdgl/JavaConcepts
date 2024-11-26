package Java2;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class log4j_basicconfigurator {
	static Logger logger = Logger.getLogger(log4j_basicconfigurator.class);

	public static void main(String[] args) {
	
        BasicConfigurator.configure();
        logger.debug("Debug");
        logger.info("Info");
        logger.warn("Warning");
        logger.error("Error");
        logger.fatal("Fatal");
	}

}
