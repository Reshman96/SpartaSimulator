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

        addWaitingListToCentres();
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

    private static void addTraineeToCentre(Trainee trainee, CentreType centre){
        /*
        if(!centre.isFull() && !centre.getMonthlyCapacity() == 0) {
            centreTrainees.add(trainee);
            remove trainee from arrayList
        }else {
            add trainee to waitingList
        }
        */
    }

    private static void addWaitingListToCentres() {
        /*
        iterator
        for(Trainee trainee : waitingList) {
        boolean false
        int count = 0;
        loop
            //generate random number to select the centre
            CentreType centre = availableCentres.get(RandomNumberGenerator.getRandomInt(0, availableCentres.size()));
            //check if the centre isn't full, isn't at monthly capacity, and if tech centre it's the same course type as the trainee
            if(centre.getClass == TechCentre.Class) {
                TechCentre techCentre = centre;
                if(trainee.getCourse() == techCentre.getCourse()) {
                    addTraineeToCentre(trainee, techCentre);
                    boolean true
                } else {
                    count++;
                }
            }else {
                addTraineeToCentre(trainee, centre);
            }
        }
        */
    }

    private static void addTraineesToCentres(ArrayList trainees) { //pass in array list of trainees
        /*

         */
    }
}
