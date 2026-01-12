package chainOfResponsibilityPattern;

public class DebugLevel implements LogLevel {
    LogLevel nextLevel;

    public DebugLevel(LogLevel level){
        this.nextLevel = level;
    }

    @Override
    public void handle(String level) {
        if (level.equalsIgnoreCase("Debug")) {
            System.out.println("Log Handled By Debug Level");
            return;
        }
        if (this.nextLevel != null) {
            nextLevel.handle(level);
        } else {
            System.out.println("No Handler Found");
        }
    }
}
