package simplefactory.Logger;

public class LoggerFactory {
    public static ILogger creatILogger(Loglevel log){
        switch (log) {
            case Debug:
                return new DebugLogger();
            case Info:
                return new InfoLogger();
            case Error:
                return new ErrorLogger();
            default:
                return null;
        }
    }
}
