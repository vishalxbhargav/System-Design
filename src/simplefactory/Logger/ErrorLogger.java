package simplefactory.Logger;

public class ErrorLogger implements ILogger {

    @Override
    public void log() {
        System.out.println("Error Logger");
    }
    
}
