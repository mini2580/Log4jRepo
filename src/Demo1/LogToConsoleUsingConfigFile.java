package Demo1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogToConsoleUsingConfigFile {

	private static final Logger logmsg = LogManager.getLogger(LogToConsoleUsingConfigFile.class.getName());
	
	public static void main(String[] args) {
		
		logmsg.error("I am an Error message");
		logmsg.debug("I am a debug msg");
	}

}
