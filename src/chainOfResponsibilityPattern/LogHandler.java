package chainOfResponsibilityPattern;

public class LogHandler {

    public void handleLog(String message) {
        LogLevel errorLevel = new ErrorLevel(null);
        LogLevel infoLevel = new InfoLevel(errorLevel);
        LogLevel traceLevel = new TraceLevel(infoLevel);
        LogLevel baseLevel = new DebugLevel(traceLevel);
        baseLevel.handle(message);
    }
}
