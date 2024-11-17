package simplefactory.Logger;

public class InfoLogger implements ILogger {

    @Override
    public void log() {
        System.out.println("InfoLogger");
    }
    
}
