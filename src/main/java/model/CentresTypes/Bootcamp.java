package model.CentresTypes;

public class Bootcamp extends CentreType{

    private int failCount;
    private int failsAllowed;

    public Bootcamp(int failsAllowed) {
        super();
        failCount = 0;
        this.failsAllowed = failsAllowed;
    }

    public Bootcamp(){
        super();
        failCount = 0;
        this.failsAllowed = 3;
    }

    @Override
    public int getMaxSize() {
        return 500;
    }

    @Override
    public boolean attemptShutCentreDown() {
        if (getNumberOfTrainees() >= 25) {
            failCount = 0;
            return false;
        } else {
            if(!(failCount < failsAllowed)) {
                return true;
            } else {
                failCount++;
                return false;
            }
        }
    }
}
