package controller;

import model.*;
import model.CentresTypes.CentreType;
import model.CentresTypes.TechCentre;
import view.InputHandler;
import java.util.ArrayList;
import java.util.Iterator;

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
        CentreManager.moveFullCentres();
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

    private static void addTraineesToCentres(ArrayList<Trainee> trainees) {
        ArrayList<Trainee> tempTrainees = new ArrayList<>();
        Iterator<Trainee> it = trainees.iterator();
        int e = 0;
        while (it.hasNext()){
            Trainee trainee = it.next();
            boolean notPlaced = true;
            int count = 0;
            ArrayList<CentreType> availableCentres = CentreManager.getAvailableCentres();
            while (count < 5 && notPlaced && availableCentres.size() > 0) {
                CentreType centre = availableCentres.get(RandomNumberGenerator.getRandomInt(0, availableCentres.size() - 1));
                if (centre.getClass() == TechCentre.class) {
                    TechCentre techCentre = (TechCentre) centre;
                    if (trainee.getCourse() == techCentre.getCourseType() && !centre.isFull() && centre.getMonthlyCapacity() != 0) {
                        centre.addTrainee(trainee);
                        notPlaced = false;
                    } else {
                        count++;
                    }
                } else if (!centre.isFull() && centre.getMonthlyCapacity() != 0) {
                    centre.addTrainee(trainee);
                    notPlaced = false;
                } else {
                    count++;
                }
            }
            it.remove();
            if (notPlaced){
                tempTrainees.add(trainee);
            }
        }
        TraineeManager.addTraineesFromArrayList(tempTrainees);
    }
}
