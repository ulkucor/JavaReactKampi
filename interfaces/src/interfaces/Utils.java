package interfaces;

public class Utils { //java da bu class static olmaz.

	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger: loggers) {
			logger.log(message);
		}
	}
}
