package Java2;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class log4j_xmlconfigurator {

	static Logger logger = Logger.getLogger(log4j_xmlconfigurator.class);
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");

		logger.debug("Debug");
        logger.info("Info");
        logger.warn("Warning");
        logger.error("Error");
        logger.fatal("Fatal");
	}

}
