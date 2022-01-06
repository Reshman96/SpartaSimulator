package model.CentresTypes;

import model.CourseType;

public class TechCentre extends CentreType{

    public TechCentre(CourseType courseType) {
        super(courseType, 1);
    }

    @Override
    public int getMaxSize() {
        return 200;
    }

}
