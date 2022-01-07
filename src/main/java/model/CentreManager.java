package model;

import model.CentresTypes.Bootcamp;
import model.CentresTypes.CentreType;
import model.CentresTypes.TechCentre;
import model.CentresTypes.TrainingHub;

import java.util.ArrayList;

public class CentreManager {
    private static ArrayList<CentreType> availableCentres = new ArrayList<>();
    private static int[] fullCentres = {0,0,0};
    private int traineesCurrentlyTraining;

    public ArrayList<CentreType> getAvailableCentres() {
        return availableCentres;
    }

    public int[] getFullCentres() {
        return fullCentres;
    }

    public int getTraineesCurrentlyTraining() {
        return traineesCurrentlyTraining;
    }

    public static void addCentre(CentreType currentCentre){
        availableCentres.add(currentCentre);
    }

    public static int[] countOpenCentres(){
        // assumes closed centres will be removed from our list
        int[] centreTypes = {0,0,0};
        for (CentreType openCentre : availableCentres){
            if (openCentre.getClass() == TrainingHub.class){
                centreTypes[0] ++;
            }
            if (openCentre.getClass() == Bootcamp.class){
                centreTypes[1] ++;
            }
            if (openCentre.getClass() == TechCentre.class){
                centreTypes[2] ++;
            }
        }
        return centreTypes;
    }

    public static void addFullCentre(int typeOfCentre){
        if (typeOfCentre == 0){
            fullCentres[0] ++;
        }
        if (typeOfCentre == 1){
            fullCentres[1] ++;
        }
        if (typeOfCentre == 2){
            fullCentres[2] ++;
        }
    }

    public static void resetCentreArray(){
        availableCentres.clear();
    }

}
