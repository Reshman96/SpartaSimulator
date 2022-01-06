package model.CentresTypes;

public class TechCentre extends CentreType{

    public TechCentre(String courseType) {
        super(courseType, 1);
    }

    @Override
    public int getMaxSize() {
        return 200;
    }

}
