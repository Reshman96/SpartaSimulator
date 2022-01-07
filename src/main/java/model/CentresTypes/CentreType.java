package model.CentresTypes;

public abstract class CentreType {
    private int numberOfTrainees;
    private int monthlyCapacity;
    private int maxSize;

    public CentreType() {
        this.numberOfTrainees = 0;
        this.monthlyCapacity = 0;
        this.maxSize = getMaxSize();
    }


    //public CourseType setCourseType(){return courseType;}

    public int getNumberOfTrainees() {
        return numberOfTrainees;
    }

    public abstract int getMaxSize();

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

    public abstract boolean attemptShutCentreDown();
}
