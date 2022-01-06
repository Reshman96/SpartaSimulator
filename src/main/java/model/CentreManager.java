package model;

import model.CentresTypes.CentreType;

import java.util.ArrayList;

public class CentreManager {
    private static ArrayList<CentreType> availableCentres = new ArrayList<>();
    private int fullCentres;
    private int traineesCurrentlyTraining;

    public ArrayList<CentreType> getAvailableCentres() {
        return availableCentres;
    }

    public int getFullCentres() {
        return fullCentres;
    }

    public int getTraineesCurrentlyTraining() {
        return traineesCurrentlyTraining;
    }

    public static void addCentre(CentreType currentCentre){
        availableCentres.add(currentCentre);
    }


}
