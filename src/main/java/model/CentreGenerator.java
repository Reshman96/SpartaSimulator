package model;

import logging.MyLogger;
import model.CentresTypes.Bootcamp;
import model.CentresTypes.TechCentre;
import model.CentresTypes.TrainingHub;

import java.util.logging.Level;
import static model.RandomNumberGenerator.getRandomInt;

public class CentreGenerator {

        public static void getTypeOfCentre(int randomChoice) {
            switch(randomChoice) {
                case 1:
                   CentreManager.addCentre(new TrainingHub());
                   CentreManager.addCentre(new TrainingHub());
                   CentreManager.addCentre(new TrainingHub());
                    MyLogger.writeLog(Level.FINER, "Created 3 Training Hubs");
                   break;
                case 3:
                    CentreManager.addCentre(new Bootcamp());
                    MyLogger.writeLog(Level.FINER, "Created a Bootcamp");
                    break;
                case 2:
                    CentreManager.addCentre(new TechCentre(RandomNumberGenerator.getRandomCourse()));
                    MyLogger.writeLog(Level.FINER, "Created a Tech Centre");
                    break;
            }
        }
    }

