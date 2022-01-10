import controller.SpartaSimulator;
import logging.MyLogger;
import view.InputHandler;
import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {

        MyLogger.createLogger();

        MyLogger.writeLog(Level.INFO, "Program Started");

        MyLogger.writeLog(Level.INFO, "Setting starting parameters");
        InputHandler.setStartingParameters();

        MyLogger.writeLog(Level.INFO, "Running simulation");
        SpartaSimulator spartaSimulator = new SpartaSimulator();
        spartaSimulator.simulator();
    }
}
