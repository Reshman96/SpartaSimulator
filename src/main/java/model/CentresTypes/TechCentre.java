package model.CentresTypes;

import model.CourseType;
import view.InputHandler;

public class TechCentre extends CentreType{
    private final CourseType COURSETYPE;
    private final int TECH_CENTRE_MINIMUM_ACCEPTABLE_LIMIT = InputHandler.getTechCentreMinimumTrainees();
    private final int TECH_CENTRE_MAXIMUM_ACCEPTABLE_LIMIT = InputHandler.getTechCentreMaximumTrainees();


    public TechCentre(CourseType courseType) {
        super();
        this.COURSETYPE = courseType;
    }

    @Override
    public int getMaxSize() {
        return TECH_CENTRE_MAXIMUM_ACCEPTABLE_LIMIT;
    }

    @Override
    public boolean attemptShutCentreDown() {
        return getNumberOfTrainees() < TECH_CENTRE_MINIMUM_ACCEPTABLE_LIMIT;
    }

    public CourseType getCourseType() {
        return COURSETYPE;
    }

    public int getCourseTypeIndex(){ return COURSETYPE.compareTo(CourseType.JAVA) + 2;}
}
