package model.CentreTypes;

import model.CentresTypes.Bootcamp;
import model.Trainee;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BootCampTests {

    Bootcamp bootCamp;


    @BeforeEach
    void setup(){
        bootCamp = new Bootcamp();
        ArrayList<Trainee> dummyList = new ArrayList<>();
        for(int i = 0; i < 24; i++) {
            dummyList.add(new Trainee());
        }
        bootCamp.setTraineeList(dummyList);
    }

    @Test
    @DisplayName("Test that max size is 500")
    void testThatMaxSizeIs500() {
        Assertions.assertEquals(500, bootCamp.getMaxSize());
    }

    @Test
    @DisplayName("Attempt centre shutdown at high attendance")
    void attemptCentreShutdownAtHighAttendance() {
        bootCamp.addTrainee(new Trainee());
        assertFalse(bootCamp.attemptShutCentreDown());
    }

    @Test
    @DisplayName("Attempt centre shutdown at low attendance third strike")
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
