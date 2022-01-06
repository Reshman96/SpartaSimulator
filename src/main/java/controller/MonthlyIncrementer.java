package controller;

public class MonthlyIncrementer {

    public MonthlyIncrementer(int monthCount) {
        incrementMonths(monthCount);
    }

//    private int getNewTraineeWaitingList() {
//        return TraineeGenerator.getRandomNumOfTrainees();
//    }

    private void addTraineesToCentres() {

    }

    private void incrementMonths(int monthCount) {
        for (int i = 1; i < monthCount; i++) {
            if (i % 2 == 0) {
                //CentreGenerator.createCentre();
            }
            //how to add new trainees to waiting list
            //numOfTraineesWaiting += TraineeGenerator.getRandomNumOfTrainees();
            addTraineesToCentres();
        }
    }

}
