package simplefactory;

import simplefactory.Logger.ILogger;
import simplefactory.Logger.LoggerFactory;
import simplefactory.Logger.Loglevel;

public class Main{
    public static void main(String[] args) {
        ILogger logger=LoggerFactory.creatILogger(Loglevel.Info);
        logger.log();
    }
}