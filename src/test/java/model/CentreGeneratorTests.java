package model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentreGeneratorTests {

    static Centre centreDefault;

    @BeforeAll
    static void setup() {
       centreDefault = new Centre();
       centreDefault.setMonthlyCapacity(50);
    }

    @Test
    @DisplayName("Test Centre created through monthly capacity")
    void testTraineesEquals0() {
        assertEquals(50, centreDefault.getMonthlyCapacity());
    }

}
