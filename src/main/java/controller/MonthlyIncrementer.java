package controller;

import model.*;
import model.CentresTypes.CentreType;
import view.InputHandler;
import java.util.ArrayList;

public class MonthlyIncrementer {

    public static void incrementMonth(int currentMonth) {
        if (currentMonth % 2 == 0) {
            createCentre();
        }
        //set monthly capacity for all centres
        setCentreMonthlyCapacity();

        //add new trainees to waiting list
        TraineeManager.addRandomNumberOfTrainees();

        if (currentMonth > 1) {
            addTraineesToCentres(TraineeManager.getWaitingList());
        }

        if (currentMonth >= 3) {
            addTraineesToCentres(TraineeGenerator.getTraineesFromArray(CentreManager.attemptCloseCentres()));
        }
    }

    private static void createCentre() {
        CentreGenerator.getTypeOfCentre(RandomNumberGenerator.getRandomInt(1,3));
    }

    private static void setCentreMonthlyCapacity() {
        // pass through array list of available centres
        for (CentreType centre: CentreManager.getAvailableCentres()) {

            centre.setMonthlyCapacity(RandomNumberGenerator.getRandomInt(InputHandler.getTraineeLowerBound(),InputHandler.getTraineeUpperBound()));

            

        }
    }

    private static void addTraineesToCentres(ArrayList trainees) { //pass in array list of trainees
        /*

         */
    }
}
