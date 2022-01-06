package controller;

import model.CentreGenerator;
import model.RandomNumberGenerator;
import model.Trainee;
import model.TraineeGenerator;
import java.util.ArrayList;

public class MonthlyIncrementer {

    public static void incrementMonth(int currentMonth) {
        if (currentMonth % 2 == 0) {
            createCentre();
        }
        //set monthly capacity for all centres
        setCentreMonthlyCapacity();

        //add new trainees to waiting list
        //waitingList add(getNewTrainees());

        addTraineesToCentres(); //pass waiting list
        if (currentMonth >= 3) {
            checkCentreClosure();
        }

    }

    private static void createCentre() {
        CentreGenerator.getTypeOfCentre(RandomNumberGenerator.getRandomInt(1,3));
    }

    private static void setCentreMonthlyCapacity() {

    }

    private static ArrayList<Trainee> getNewTrainees() {
        return TraineeGenerator.getRandomNumOfTrainees();
    }

    private static void addTraineesToCentres() { //pass in arraylist of trainees
        //
        /*
        CentreManager availableCentres
        for(Trainee trainee : arrayList) {
            generate random number to select the centre
            check if the centre isn't full, isn't at monthly capacity, and if tech centre it's the same course type as the trainee
                centreTrainees.add(trainee);
                remove trainee from arrayList
            else
                add trainee to waitingList
        }
        */
    }

    private static void checkCentreClosure() {
        //check centres for closure
        /*
        for(CentreType centre : CentreManager availableCentres) {
            if(numberOfTrainees < 25) {
                centre safetyNet--;
            }
            if(centre safetyNet == 0) {
                get arraylist of trainees
                close centre
                addTraineesToCentres(arraylist of trainees);
            }
        }
        */
    }

}
