package chainOfResponsibilityPattern;

public class InfoLevel implements LogLevel {
    LogLevel nextLevel;

    public InfoLevel(LogLevel level) {
        this.nextLevel = level;
    }

    @Override
    public void handle(String level) {
        if (level.equalsIgnoreCase("Info")) {
            System.out.println("Log Handled by Info Level");
            return;
        }
        if (this.nextLevel != null) {
            nextLevel.handle(level);
        } else {
            System.out.println("No Handler Found");
        }
    }
}
