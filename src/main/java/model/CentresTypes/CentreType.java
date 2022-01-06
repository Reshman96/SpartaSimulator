package model.CentresTypes;

import model.CourseType;

public abstract class CentreType {
    private int numberOfTrainees;
    private int monthlyCapacity;
    private int maxSize;
    private CourseType courseType;
    private int failuresAllowed;

    public CentreType(CourseType courseType, int failiuresAllowed) {
        this.numberOfTrainees = 0;
        this.monthlyCapacity = 0;
        this.maxSize = getMaxSize();
        this.courseType = courseType;
        this.failuresAllowed = failiuresAllowed;
    }

    public CourseType setCourseType(){return courseType;}

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

    public CourseType getCourseType() {
        return courseType;
    }

    public int getFailuresAllowed() {
        return failuresAllowed;
    }

    public boolean attemptShutCentreDown(){
        // returns true if the centre should be shut down, false if it still has one or more "strikes" left
        failuresAllowed --;
        return failuresAllowed <= 0;
    }
}
