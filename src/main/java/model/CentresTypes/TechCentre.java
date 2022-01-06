package model.CentresTypes;

public class TechCentre extends CentreType{


    public TechCentre(String courseType) {
        super(courseType);
    }

    @Override
    public int getMaxSize() {
        return 200;
    }

}
