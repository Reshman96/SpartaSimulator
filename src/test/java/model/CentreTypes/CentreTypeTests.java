package model.CentreTypes;

import model.CentresTypes.Bootcamp;
import model.CentresTypes.CentreType;
import model.CentresTypes.TechCentre;
import model.CentresTypes.TrainingHub;
import model.CourseType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CentreTypeTests {

    @Test
    @DisplayName("Set and get monthly capacity")
    void setAndGetMonthlyCapacity() {
        CentreType techCentre = new TechCentre(CourseType.JAVA);
        int setGetInt = 30;
        techCentre.setMonthlyCapacity(setGetInt);
        Assertions.assertEquals(setGetInt, techCentre.getMonthlyCapacity());
    }

    @Test
    @DisplayName("Return number of trainees 0")
    void returnNumberOfTrainees0() {
        CentreType techCentre = new TechCentre(CourseType.JAVA);
        Assertions.assertEquals(0, techCentre.getNumberOfTrainees());
    }

//    @Test
//    @DisplayName("Return number of trainees x")
//    void returnNumberOfTraineesX() {
//        CentreType bootCamp = new Bootcamp();
//        bootCamp.setNumberOfTrainees(new int[] {4,5,1,2,4});
//        Assertions.assertEquals(16, bootCamp.getNumberOfTrainees());
//    }

    @Test
    @DisplayName("Test isFull for false")
    void testIsFullForFalse() {
        TrainingHub trainingHub= new TrainingHub();
        assertFalse(trainingHub.isFull());
    }

//    @Test
//    @DisplayName("Test isFull for true")
//    void testIsFullForTrue() {
//        TrainingHub trainingHub = new TrainingHub();
//        trainingHub.setNumberOfTrainees(new int[]{trainingHub.getMaxSize(), 0, 0, 0, 0});
//        assertTrue(trainingHub.isFull());
//    }
}
