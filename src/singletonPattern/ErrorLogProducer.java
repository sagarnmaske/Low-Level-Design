package singletonPattern;

public class ErrorLogProducer implements LogProducer {
    LogsAccumulator logsAccumulator;

    public ErrorLogProducer(LogsAccumulator logs) {
        this.logsAccumulator = logs;
    }

    @Override
    public void produceLogs(String t) {
        logsAccumulator.logs.add("Error Logs by :" + t);
    }
}
