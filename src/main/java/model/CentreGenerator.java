package model;

import model.CentresTypes.Bootcamp;
import model.CentresTypes.TechCentre;
import model.CentresTypes.TrainingHub;

import static model.RandomNumberGenerator.getRandomInt;

public class CentreGenerator {

        public static void getTypeOfCentre(int randomChoice) {
            switch(randomChoice) {
                case 1:
                   CentreManager.addCentre(new TrainingHub());
                   CentreManager.addCentre(new TrainingHub());
                   CentreManager.addCentre(new TrainingHub());
                   break;
                case 3:
                    CentreManager.addCentre(new Bootcamp());
                    break;
                case 2:
                    CentreManager.addCentre(new TechCentre(RandomNumberGenerator.getRandomCourse()));
                    break;
            }
        }
    }

