package model.CentresTypes;

import view.InputHandler;

public class Bootcamp extends CentreType{

    private int failCount;
    private final int FAILS_ALLOWED = InputHandler.getBootcampConsecutiveMonthsOfInadequateTrainees();
    private final int BOOTCAMP_MINIMUM_ACCEPTABLE_LIMIT = InputHandler.getBootcampMinimumTrainees();
    private final int BOOTCAMP_MAXIMUM_ACCEPTABLE_LIMIT = InputHandler.getBootcampMaximumTrainees();

    public Bootcamp(){
        super();
        failCount = 0;
    }

    @Override
    public int getMaxSize() {
        return BOOTCAMP_MAXIMUM_ACCEPTABLE_LIMIT;
    }

    @Override
    public boolean attemptShutCentreDown() {
        if (getNumberOfTrainees() >= BOOTCAMP_MINIMUM_ACCEPTABLE_LIMIT) {
            failCount = 0;
            return false;
        } else {
            failCount++;
            if(!(failCount < FAILS_ALLOWED)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
