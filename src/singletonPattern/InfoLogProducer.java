package singletonPattern;

public class InfoLogProducer implements LogProducer {
    LogsAccumulator logsAccumulator;

    public InfoLogProducer(LogsAccumulator logs) {
        this.logsAccumulator = logs;
    }

    @Override
    public void produceLogs(String t) {
        logsAccumulator.logs.add("Info Logs by :" + t);
    }
}
