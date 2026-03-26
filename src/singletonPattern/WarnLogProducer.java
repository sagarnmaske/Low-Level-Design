package singletonPattern;

public class WarnLogProducer implements LogProducer {
    LogsAccumulator logsAccumulator;

    public WarnLogProducer(LogsAccumulator logs) {
        this.logsAccumulator = logs;
    }

    @Override
    public void produceLogs(String t) {
        logsAccumulator.logs.add("Warn Logs by :" + t);
    }
}
