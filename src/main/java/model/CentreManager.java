package model;

import java.util.ArrayList;

public class CentreManager {
    private ArrayList<Centre> availableCentres = new ArrayList<>();
    private int fullCentres;
    private int traineesCurrentlyTraining;

    public ArrayList<Centre> getAvailableCentres() {
        return availableCentres;
    }

    public int getFullCentres() {
        return fullCentres;
    }

    public int getTraineesCurrentlyTraining() {
        return traineesCurrentlyTraining;
    }

    public void addCentre(){
        availableCentres.add(new Centre());
    }


}
