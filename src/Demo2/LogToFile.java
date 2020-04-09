package Demo2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogToFile {
	
	private static final Logger logmsg = LogManager.getLogger(LogToFile.class.getName());
	
    public static void main(String[] args){
    	
    	logmsg.error("I am an Error message");
		logmsg.debug("I am a debug msg");
		logmsg.warn("I am a warning");
    	
    }
}
