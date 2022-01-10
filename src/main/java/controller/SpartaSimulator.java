package controller;

import logging.MyLogger;
import model.CentreManager;
import model.Trainee;
import model.TraineeManager;
import view.InputHandler;
import view.OutputManager;

import java.util.ArrayList;
import java.util.logging.Level;

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
            MyLogger.writeLog(Level.FINE, "Simulating month: " + i);
            MonthlyIncrementer.incrementMonth(i);

            if (displayEveryMonth) {
                getInformation();
                OutputManager.outputData(i+1, fullCenters, openCenters, closedCenter, traineesTraining, waitingList );
            }
        }

        //final results
        if(!displayEveryMonth) {
            getInformation();
            OutputManager.outputData(months, fullCenters, openCenters, closedCenter, traineesTraining, waitingList);
        }

        MyLogger.writeLog(Level.INFO, "Program Finished");
    }
    private void getInformation(){
        //change this with getter from model
        this.openCenters = CentreManager.countOpenCentres();
        this.fullCenters = CentreManager.getFullCentres();
        this.closedCenter = CentreManager.getClosedCentres();
        this.traineesTraining = CentreManager.getFullTrainees();
        this.waitingList = formatTrainees(TraineeManager.getWaitingList());
    }

    private int[] formatTrainees(ArrayList<Trainee> trainees){
        int[] formattedTrainees = {0,0,0,0,0};
        for (Trainee trainee: trainees) {
            switch (trainee.getCourse()){
                case JAVA:
                    formattedTrainees[0] ++;
                    break;
                case DATA:
                    formattedTrainees[1] ++;
                    break;
                case DEVOPS:
                    formattedTrainees[2] ++;
                    break;
                case CSHARP:
                    formattedTrainees[3] ++;
                    break;
                case BUSINESS:
                    formattedTrainees[4] ++;
                    break;
            }

        }
        return formattedTrainees;
    }
}
