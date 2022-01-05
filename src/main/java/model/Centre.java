package model;

public class Centre {
    private int numberOfTrainees = 0;
    private int monthlyCapacity = 0;
    private int maxSize;

    public Centre() {
        this.maxSize = 100;
    }

    public Centre(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getNumberOfTrainees() {
        return numberOfTrainees;
    }

    public void setNumberOfTrainees(int numberOfTrainees) {
        this.numberOfTrainees = numberOfTrainees;
    }

    public int getMonthlyCapacity() {
        return monthlyCapacity;
    }

    public void setMonthlyCapacity(int monthlyCapacity) {
        this.monthlyCapacity = monthlyCapacity;
    }

    public boolean isFull(){
        return maxSize == numberOfTrainees;
    }
}
