package logging;

import App.Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

    public class MyLogger {
        private static final String fileLocation = "../src/main/resources/myLog.log";
        private static String loggerFilePath;

        static {
            try {
                File jarFile = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
                loggerFilePath = jarFile.getParent() + File.separator + fileLocation;
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }

        public static void createLogger(){
            Logger logger = Logger.getLogger("myLogger");
            logger.setUseParentHandlers(false);
            try {
                Handler fileHandler = new FileHandler(loggerFilePath, true);
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
