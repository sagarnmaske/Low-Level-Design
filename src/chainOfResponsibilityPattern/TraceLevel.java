package chainOfResponsibilityPattern;

public class TraceLevel implements LogLevel {
    LogLevel nextLevel;

    public TraceLevel(LogLevel level) {
        this.nextLevel = level;
    }

    @Override
    public void handle(String level) {
        if (level.equalsIgnoreCase("Trace")) {
            System.out.println("Log Handled By Trace Level");
            return;
        }
        if (this.nextLevel != null) {
            nextLevel.handle(level);
        } else {
            System.out.println("No Handler Found");
        }
    }
}
