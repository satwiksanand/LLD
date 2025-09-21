package behavioralDesignPatterns.chainOfResponsibilityDesignPattern.loggerExample;

public class Client {
    private static Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger debugLogger = new DebugLogger(Logger.DEBUG);
        Logger infoLogger = new InfoLogger(Logger.INFO);

        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(Logger.INFO, "This is an info message.");
        loggerChain.logMessage(Logger.DEBUG, "This is a debug message.");
        loggerChain.logMessage(Logger.ERROR, "This is an error message.");
    }
}
