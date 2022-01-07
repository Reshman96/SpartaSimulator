package model.CentreTypes;

import model.CentresTypes.Bootcamp;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BootCampTests {

    Bootcamp bootCamp;


    @BeforeEach
    void setup(){
        bootCamp = new Bootcamp();
    }

    @Test
    @DisplayName("Test that max size is 500")
    void testThatMaxSizeIs500() {
        Assertions.assertEquals(500, bootCamp.getMaxSize());
    }

    @Test
    @DisplayName("Attempt centre shutdown at high attendance")
    void attemptCentreShutdownAtHighAttendance() {
        bootCamp.setNumberOfTrainees(new int[] {10,10,10,10,10});
        assertFalse(bootCamp.attemptShutCentreDown());
    }

    @Test
    @DisplayName("Attempt centre shutdown at low attendance third strike")
    void attemptCentreShutdownAtLowAttendanceThirdStrike() {
        bootCamp.setNumberOfTrainees(new int[] {1,1,1,1,1});
        bootCamp.attemptShutCentreDown();
        bootCamp.attemptShutCentreDown();
        assertTrue(bootCamp.attemptShutCentreDown());
    }

    @Test
    @DisplayName("Attempt centre shutdown at low attendance for a second consecutive time")
    void attemptCentreShutdownAtLowAttendanceForASecondConsecutiveTime() {
        bootCamp.setNumberOfTrainees(new int[] {1,1,1,1,1});
        bootCamp.attemptShutCentreDown();
        assertFalse(bootCamp.attemptShutCentreDown());
    }

    @AfterEach
    void teardown() {
        bootCamp = null;
    }
}
