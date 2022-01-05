package model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CentreTests {

    static Centre centreDefault;
    static Centre centreCustom;

    //When a centre is made, make sure number of trainees is 0
    //Has a max capacity of 100
    //Initial Monthly Capacity is 0
    //Check isFull boolean returns true when true
    //Check isFull boolean returns false when false
    //Test negative number of trainees - add method???

    @BeforeAll
    static void setup(){
         centreDefault = new Centre();
         centreCustom = new Centre(250);

         centreDefault.setNumberOfTrainees(100);
    }

    @Test
    @DisplayName("Test Trainees equals 0")
    void testTraineesEquals0() {
        assertEquals(0, centreDefault.getNumberOfTrainees());
    }

    @Test
    @DisplayName("TestDefaultMaxCapacity100")
    void testDefaultMaxCapacity100() {
        assertEquals(100, centreDefault.getMaxSize());
    }

    @Test
    @DisplayName("Test Initial monthly capacity is 0")
    void testInitialMonthlyCapacityIs0() {
        assertEquals(250, centreCustom.getMaxSize());
    }

    @Test
    @DisplayName("Test isFull for true")
    void testIsFullForTrue() {
        assertEquals(true, centreDefault.isFull());
    }

    @Test
    @DisplayName("Test isFull for false")
    void testIsFullForFalse() {
        assertEquals(false, centreCustom.isFull());
    }
}
