package DemoCode;

import org.apache.logging.log4j.*;

public class Log4jInLogFile {

	private static Logger log = LogManager.getLogger(Log4jInLogFile.class.getName());
	
	public static void main(String[] args) {
		log.debug("A debug message"); //log level is changed at log4j2.xml file
		log.info("An info message");
		log.warn("A warning message");
		log.error("An error in Log4jInLogFile"); 
		log.fatal("A fatal error");
	}

}
