package model.CentresTypes;

public class TrainingHub extends CentreType {

    public TrainingHub(String courseType) {
        super(courseType);
    }

    @Override
    public int getMaxSize() {
        return 0;
    }
}
