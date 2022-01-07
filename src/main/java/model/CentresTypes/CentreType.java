package model.CentresTypes;

import model.Trainee;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class CentreType {
    private ArrayList<Trainee> traineeList;
    private int monthlyCapacity;
    private int maxSize;

    public CentreType() {
        traineeList = new ArrayList<>();
        this.monthlyCapacity = 0;
        this.maxSize = getMaxSize();
    }

    public int getNumberOfTrainees() {
        return traineeList.size();
    }

    public int[] getTypesOfTrainees(){
        int[] typeCount = {0, 0, 0, 0, 0};

        for (Trainee trainee : traineeList) {
            switch (trainee.getCourse()) {
                case JAVA:
                    typeCount[0]++;
                case CSHARP:
                    typeCount[1]++;
                case DATA:
                    typeCount[2]++;
                case DEVOPS:
                    typeCount[3]++;
                case BUSINESS:
                    typeCount[4]++;
            }
        }

        return typeCount;
    }

    public abstract int getMaxSize();

    public void setTraineeList(ArrayList<Trainee> traineeList) {
        this.traineeList = traineeList;
    }

    public ArrayList<Trainee> getTraineeList(){
        return traineeList;
    }

    public int getMonthlyCapacity() {
        return monthlyCapacity;
    }

    public void setMonthlyCapacity(int monthlyCapacity) {
        this.monthlyCapacity = monthlyCapacity;
    }

    public boolean isFull(){
        return maxSize == getNumberOfTrainees();
    }

    public abstract boolean attemptShutCentreDown();
}
