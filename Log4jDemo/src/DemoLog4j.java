import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class DemoLog4j {

	public static void main(String[] args) {
		Logger myLogger = Logger.getLogger(DemoLog4j.class.getName());
		PropertyConfigurator.configure("resources/log4j.properties");
		int a=1;
		boolean flag=false;
		myLogger.info("Logging information for DemoLog4j");
		myLogger.debug("Code debugging started");
		if(a<0) {
			myLogger.warn("This is last time warning");
		}
		if (flag==false) {
			myLogger.error("Error occured due to false value");
		}

	}

}
