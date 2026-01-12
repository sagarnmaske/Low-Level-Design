package chainOfResponsibilityPattern;

public class ErrorLevel implements LogLevel {
    LogLevel nextLevel;

    public ErrorLevel(LogLevel nextLevel){
        this.nextLevel = nextLevel;
    }

    @Override
    public void handle(String level) {
        if (level.equalsIgnoreCase("Error")) {
            System.out.println("Log Handled By Error Level");
            return;
        }
        if (this.nextLevel != null) {
            nextLevel.handle(level);
        } else {
            System.out.println("No Handler Found");
        }
    }
}
