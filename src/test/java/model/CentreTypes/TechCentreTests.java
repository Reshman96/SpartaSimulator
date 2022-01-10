package model.CentreTypes;

import model.CentresTypes.TechCentre;
import model.CentresTypes.TrainingHub;
import model.CourseType;
import model.Trainee;
import org.junit.jupiter.api.*;
import view.InputHandler;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TechCentreTests {

    TechCentre techCentre;

    @BeforeAll
    static void setupAll() {
        InputHandler.setStartingParameters();
    }

    @BeforeEach
    void setup(){
        techCentre = new TechCentre(CourseType.DATA);
    }

    @Test
    @DisplayName("CanYouCreateMe")
    void canYouCreateMe() {
        TechCentre techCentre = new TechCentre(CourseType.JAVA);
        Assertions.assertInstanceOf(TechCentre.class, techCentre);
    }

    @Test
    @DisplayName("Return max size")
    void returnMaxSize() {
        Assertions.assertEquals(InputHandler.getTechCentreMaximumTrainees(), techCentre.getMaxSize());
    }

    @Test
    @DisplayName("does getCourseTypeIndex of DATA return 3?")
    void doesGetCourseTypeIndexOfDataReturn3() {
        Assertions.assertEquals(4, techCentre.getCourseTypeIndex());
    }

    @Test
    @DisplayName("Attempt low attendance shutdown")
    void attemptLowAttendanceShutdown() {
        assertTrue(techCentre.attemptShutCentreDown());
    }

    @Test
    @DisplayName("Attempt high attendance shutdown")
    void attemptHighAttendanceShutdown() {
        for(int i = 0; i < InputHandler.getTechCentreMinimumTrainees(); i++) {
            techCentre.addTrainee(new Trainee());
        }

        assertFalse(techCentre.attemptShutCentreDown());
    }


    @AfterEach
    void tearDown(){
        techCentre = null;
    }
}
