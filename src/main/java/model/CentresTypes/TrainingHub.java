package model.CentresTypes;

public class TrainingHub extends CentreType {

    public TrainingHub() {
        super();
    }

    @Override
    public int getMaxSize() {
        return 100;
    }

    @Override
    public boolean attemptShutCentreDown() {
        return getNumberOfTrainees() < 25;
    }
}
