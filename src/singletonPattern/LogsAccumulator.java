package singletonPattern;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LogsAccumulator {
    BlockingQueue<String> logs;

    LogsAccumulator() {
        logs = new LinkedBlockingQueue<>();
    }
}
