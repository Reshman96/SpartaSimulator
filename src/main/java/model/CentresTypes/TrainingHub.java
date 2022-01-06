package model.CentresTypes;

public class TrainingHub extends CentreType {

    public TrainingHub() {
        super(null, 1);
    }

    @Override
    public int getMaxSize() {
        return 100;
    }
}
