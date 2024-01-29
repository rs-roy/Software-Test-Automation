package DemoPaymentCode;

import org.apache.logging.log4j.*;

public class samplePayment {

	private static Logger log = LogManager.getLogger(samplePayment.class.getName());
	
	public static void main(String[] args) {
		log.debug("A debug message"); 
		log.info("An info message");
		log.warn("A warning message");
		log.error("An error in Sample Payment"); 
		log.fatal("A fatal error");
		log.debug("A debug message"); 
		log.info("An info message");
		log.warn("A warning message");
		log.error("An error in Sample Payment"); 
		log.fatal("A fatal error");
	}
}
