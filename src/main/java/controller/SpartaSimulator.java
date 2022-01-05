package controller;

public class SpartaSimulator {
    //private MonthlyIncrementor monthlyIncrementor = new MonthlyIncrementor();
    //private CentreManager centreManager = new CentreManager();

    private int months;
    private int numOfOpenCentres;
    private int numOfFullCentres;
    private int numOfTraineesTraining;
    private int numOfTraineesWaiting;

    public SpartaSimulator(int months, int numOfOpenCentres, int numOfFullCentres, int numOfTraineesTraining, int numOfTraineesWaiting) {
        this.months = months;
        this.numOfOpenCentres = numOfOpenCentres;
        this.numOfFullCentres = numOfFullCentres;
        this.numOfTraineesTraining = numOfTraineesTraining;
        this.numOfTraineesWaiting = numOfTraineesWaiting;
    }

    public SpartaSimulator(int months) {
        this.months = months;
        this.numOfOpenCentres = 0;
        this.numOfFullCentres = 0;
        this.numOfTraineesTraining = 0;
        this.numOfTraineesWaiting = 0;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getNumOfOpenCentres() {
        return numOfOpenCentres;
    }

    public void setNumOfOpenCentres(int numOfOpenCentres) {
        this.numOfOpenCentres = numOfOpenCentres;
    }

    public int getNumOfFullCentres() {

        return numOfFullCentres;
    }

    public void setNumOfFullCentres(int numOfFullCentres) {
        this.numOfFullCentres = numOfFullCentres;
    }

    public int getNumOfTraineesTraining() {
        return numOfTraineesTraining;
    }

    public void setNumOfTraineesTraining(int numOfTraineesTraining) {
        this.numOfTraineesTraining = numOfTraineesTraining;
    }

    public int getNumOfTraineesWaiting() {
        return numOfTraineesWaiting;
    }

    public void setNumOfTraineesWaiting(int numOfTraineesWaiting) {
        this.numOfTraineesWaiting = numOfTraineesWaiting;
    }

    public void incrementMonth(){

    }
}
