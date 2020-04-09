package Demo1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogToConsoleDefaultConfigFile {
	//This program will use the default configuraion file as we have not defined one yet , so 
	//only the messages from Error level and up will be displayed :
	
	// The different level of messages are
	// All
	// trace
	//debug
	//info
	//warning
	//error
	//fatal
	
	
	public static final Logger logmsg = LogManager.getLogger(LogToConsoleDefaultConfigFile.class.getName());
	
	public static void main(String[] args) {
		logmsg.error("An Error occured");
		logmsg.debug("A Debug Message Displayed");
		logmsg.fatal("A F A T A L MESSAGE !!!!");
				

	}

}
