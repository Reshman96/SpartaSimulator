package logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

    public class MyLogger {

        public static void createLogger(){
            Logger logger = Logger.getLogger("myLogger");
            logger.setUseParentHandlers(false);
            try {
                Handler fileHandler = new FileHandler("src/main/resources/myLog.log", true);
                logger.addHandler(fileHandler);
                fileHandler.setFormatter(new LogFormat());
                logger.log(Level.INFO, "Logger Created");
            } catch (
                    IOException e) {
                e.printStackTrace();
            }
        }

        public static void writeLog(Level level, String message){
            Logger logger = Logger.getLogger("myLogger");

            logger.setLevel(level);
            logger.log(level, message);
        }
    }
