package controller;

import model.Centre;
import model.CentreManager;
import model.Trainee;
import view.InputHandler;
import view.OutputManager;

import java.util.ArrayList;

public class SpartaSimulator {
    private MonthlyIncrementer monthlyIncrementor;
    private CentreManager centreManager = new CentreManager();

    private int months ;
    private boolean displayEveryMonth;
    private int[] openCenters;
    private int[] fullCenters;
    private int[] closedCenter;
    private int[] traineesTraining;
    //change from integer to trainee
    private int[] waitingList;

    public SpartaSimulator() {
        this.months = InputHandler.getMonthsOfSimulation();
        this.displayEveryMonth = InputHandler.getDisplayEveryMonth();
    }

    public void simulator(){
        for (int i = 0; i < months; i++) {
            MonthlyIncrementer.incrementMonth(i);

            if (displayEveryMonth) {
                getInformation();
                OutputManager.outputData(i+1, fullCenters, openCenters, closedCenter, traineesTraining,  waitingList);
            }
        }

        //final results
        if(!displayEveryMonth) {
            getInformation();
            OutputManager.outputData(months, fullCenters, openCenters, closedCenter, traineesTraining, waitingList);
        }

    }
    private void getInformation(){
        //change this with getter from model
        this.openCenters = new int[] {1,2,3,4,5,6,7};
        this.fullCenters = new int[] {1,2,3,4,5,6,7};
        this.closedCenter = new int[] {1,2,3,4,5,6,7};
        this.traineesTraining = new int[] {1,2,3,4,5};
        this.traineesTraining = new int[] {1,2,3,4,5};
        this.waitingList = new int[] {1,2,3,4,5};
        ;
    }
}
