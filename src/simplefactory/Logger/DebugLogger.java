package simplefactory.Logger;

public class DebugLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("Debug Logger");
    }
}
