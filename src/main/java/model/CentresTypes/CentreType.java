package model.CentresTypes;

import java.util.Arrays;

public abstract class CentreType {
    private int[] numberOfTrainees;
    private int monthlyCapacity;
    private int maxSize;

    public CentreType() {
        this.numberOfTrainees = new int[]{0, 0, 0, 0, 0};
        this.monthlyCapacity = 0;
        this.maxSize = getMaxSize();
    }

    public int getNumberOfTrainees() {
        return Arrays.stream(numberOfTrainees).sum();
    }

    public int[] getTypesOfTrainees(){ return numberOfTrainees;}

    public abstract int getMaxSize();

    public void setNumberOfTrainees(int[] numberOfTrainees) {
        this.numberOfTrainees = numberOfTrainees;
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
