package controller;

import model.Centre;
import model.CentreManager;
import view.InputHandler;
import view.OutputManager;

import java.util.ArrayList;

public class SpartaSimulator {
    private MonthlyIncrementer monthlyIncrementor;
    private CentreManager centreManager = new CentreManager();

    private int months ;
    private int numOfOpenCentres;
    private int numOfFullCentres;
    private int numOfTraineesTraining;
    //change from integer to trainee
    private ArrayList<Integer> waitingList = new ArrayList<>();

    public SpartaSimulator() {
        this.months = InputHandler.getMonthsOfSimulation();
    }

    public void simulator(){

        for (int i = 0; i < months; i++) {
            MonthlyIncrementer.incrementMonths(i);
        }
        this.numOfOpenCentres = centreManager.getAvailableCentres().size();
        this.numOfFullCentres = centreManager.getFullCentres();
        this.numOfTraineesTraining = centreManager.getTraineesCurrentlyTraining();
        //this.waitingList = ;

        OutputManager.outputFinalMonth(months, numOfFullCentres, numOfOpenCentres, numOfTraineesTraining, waitingList.size());

    }
}
