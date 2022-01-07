package model.CentreTypes;

import model.CentresTypes.TechCentre;
import model.CourseType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TechCentreTests {

    @Test
    @DisplayName("CanYouCreateMe")
    void canYouCreateMe() {
        TechCentre techCentre = new TechCentre(CourseType.JAVA);
    }

    @Test
    @DisplayName("Return max size")
    void returnMaxSize() {
        TechCentre techCentre = new TechCentre(CourseType.JAVA);
        Assertions.assertEquals(200, techCentre.getMaxSize());
    }

    @Test
    @DisplayName("Return number of trainees")
    void returnNumberOfTrainees() {
        TechCentre techCentre = new TechCentre(CourseType.JAVA);
        Assertions.assertEquals(0, techCentre.getNumberOfTrainees());
    }

    @Test
    @DisplayName("Set and get monthly capacity")
    void setAndGetMonthlyCapacity() {
        TechCentre techCentre = new TechCentre(CourseType.JAVA);
        int setGetInt = 30;
        techCentre.setMonthlyCapacity(setGetInt);
        Assertions.assertEquals(setGetInt, techCentre.getMonthlyCapacity());
    }

    @Test
    @DisplayName("does getCourseTypeIndex of DATA return 3?")
    void doesGetCourseTypeIndexOfDataReturn3() {
        TechCentre techCentre = new TechCentre(CourseType.DATA);
        Assertions.assertEquals(4, techCentre.getCourseTypeIndex());
    }
}
