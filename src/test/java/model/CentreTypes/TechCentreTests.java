package model.CentreTypes;

import model.CentresTypes.TechCentre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TechCentreTests {

    @Test
    @DisplayName("CanYouCreateMe")
    void canYouCreateMe() {
        TechCentre techCentre = new TechCentre("java");
    }

    @Test
    @DisplayName("Return max size")
    void returnMaxSize() {
        TechCentre techCentre = new TechCentre("java");
        Assertions.assertEquals(200, techCentre.getMaxSize());
    }

    @Test
    @DisplayName("Return number of trainees")
    void returnNumberOfTrainees() {
        TechCentre techCentre = new TechCentre("java");
        Assertions.assertEquals(0, techCentre.getNumberOfTrainees());
    }

    @Test
    @DisplayName("Set and get monthly capacity")
    void setAndGetMonthlyCapacity() {
        TechCentre techCentre = new TechCentre("java");
        int setGetInt = 30;
        techCentre.setMonthlyCapacity(setGetInt);
        Assertions.assertEquals(setGetInt, techCentre.getMonthlyCapacity());
    }
}
