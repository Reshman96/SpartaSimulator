package model.CentresTypes;

import model.CourseType;

public class TechCentre extends CentreType{
    private final CourseType COURSETYPE;

    public TechCentre(CourseType courseType) {
        super();
        this.COURSETYPE = courseType;
    }

    @Override
    public int getMaxSize() {
        return 200;
    }

    @Override
    public boolean attemptShutCentreDown() {
        return getNumberOfTrainees() < 25;
    }

    public CourseType getCourseType() {
        return COURSETYPE;
    }

    public int getCourseTypeIndex(){ return COURSETYPE.compareTo(CourseType.JAVA) + 2;}
}
