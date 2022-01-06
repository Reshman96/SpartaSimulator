package model.CentresTypes;

public abstract class CentreType {
    private int numberOfTrainees;
    private int monthlyCapacity;
    private int maxSize;
    private String courseType;

    public CentreType(String courseType) {
        this.numberOfTrainees = 0;
        this.monthlyCapacity = 0;
        this.maxSize = getMaxSize();
        this.courseType = courseType;
    }


    public String setCourseType(){return courseType;}

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

    /*
        private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public abstract String eat();
    public abstract String sound();

    public int getLegs() {
        return legs;
    }

    public void sleep(){
        System.out.println("I'm asleep");
    }
     */
}
