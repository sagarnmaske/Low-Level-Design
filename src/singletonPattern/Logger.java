package singletonPattern;

public class Logger {

    private Logger() {

    }

    private static volatile Logger logger = null;

    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }

        return logger;
    }

}
