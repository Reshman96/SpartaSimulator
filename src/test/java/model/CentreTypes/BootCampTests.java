package model.CentreTypes;

import model.CentresTypes.Bootcamp;
import model.Trainee;
import model.CentresTypes.TechCentre;

import org.junit.jupiter.api.*;
import view.InputHandler;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BootCampTests {

    Bootcamp bootCamp;

    @BeforeAll
    static void setupAll() {
        InputHandler.setStartingParameters();
    }

    @BeforeEach
    void setup(){
        bootCamp = new Bootcamp();
        ArrayList<Trainee> dummyList = new ArrayList<>();
        for(int i = 0; i < InputHandler.getBootcampMinimumTrainees() - 1; i++) {
            dummyList.add(new Trainee());
        }
        bootCamp.setTraineeList(dummyList);
    }

    @Test
    @DisplayName("Test that max size is 500")
    void testThatMaxSizeIs500() {
        Assertions.assertEquals(InputHandler.getBootcampMaximumTrainees(), bootCamp.getMaxSize());
    }

    @Test
    @DisplayName("Attempt centre shutdown at high attendance")
    void attemptCentreShutdownAtHighAttendance() {
        bootCamp.addTrainee(new Trainee());
        assertFalse(bootCamp.attemptShutCentreDown());
    }

    @Test
    @DisplayName("Attempt centre shutdown at low attendance third strike (Default only)")
    void attemptCentreShutdownAtLowAttendanceThirdStrike() {
        bootCamp.attemptShutCentreDown();
        bootCamp.attemptShutCentreDown();
        assertTrue(bootCamp.attemptShutCentreDown());
    }

    @Test
    @DisplayName("Attempt centre shutdown at low attendance for a second consecutive time")
    void attemptCentreShutdownAtLowAttendanceForASecondConsecutiveTime() {
        bootCamp.attemptShutCentreDown();
        assertFalse(bootCamp.attemptShutCentreDown());
    }

    @AfterEach
    void teardown() {
        bootCamp = null;
    }
}
