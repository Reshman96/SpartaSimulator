package model.CentreTypes;

import model.CentresTypes.Bootcamp;
import model.CentresTypes.CentreType;
import model.CentresTypes.TechCentre;
import model.CentresTypes.TrainingHub;
import model.CourseType;
import model.Trainee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CentreTypeTests {

    ArrayList<Trainee> dummyList = new ArrayList<>();
    Bootcamp bootCamp = new Bootcamp();

    @BeforeEach
    void setup() {
        for(int i = 0; i < 24; i++) {
            dummyList.add(new Trainee());
        }
        bootCamp.setTraineeList(dummyList);
    }

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

    @Test
    @DisplayName("Return number of trainees x")
    void returnNumberOfTraineesX() {
        Assertions.assertEquals(24, bootCamp.getNumberOfTrainees());
    }


    @Test
    @DisplayName("Test isFull for false")
    void testIsFullForFalse() {
        TrainingHub trainingHub= new TrainingHub();
        assertFalse(trainingHub.isFull());
    }

    @Test
    @DisplayName("Test isFull for true")
    void testIsFullForTrue() {
        TrainingHub trainingHub = new TrainingHub();

        ArrayList<Trainee> newList = new ArrayList<>();
        for(int n = 0; n < 100; n++) {
            newList.add(new Trainee());
        }
        trainingHub.setTraineeList(newList);
        assertTrue(trainingHub.isFull());
    }

}
