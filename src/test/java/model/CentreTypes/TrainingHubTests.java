package model.CentreTypes;

import model.CentresTypes.TrainingHub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TrainingHubTests {

    @Nested
    @DisplayName("Training Hub Tests")
    class CentreTests {
        @Test
        @DisplayName("Can be created test")
        void canYouCreateMe() {
            TrainingHub trainingHub = new TrainingHub();
            Assertions.assertInstanceOf(TrainingHub.class, trainingHub);
        }

        @Test
        @DisplayName("Return max size")
        void returnMaxSize() {
            TrainingHub trainingHub = new TrainingHub();
            Assertions.assertEquals(100, trainingHub.getMaxSize());
        }

        @Test
        @DisplayName("Return number of trainees")
        void returnNumberOfTrainees() {
            TrainingHub trainingHub = new TrainingHub();
            Assertions.assertEquals(0, trainingHub.getNumberOfTrainees());
        }

        @Test
        @DisplayName("Set and get monthly capacity")
        void setAndGetMonthlyCapacity() {
            TrainingHub trainingHub = new TrainingHub();
            int setGetInt = 30;
            trainingHub.setMonthlyCapacity(setGetInt);
            Assertions.assertEquals(setGetInt, trainingHub.getMonthlyCapacity());
        }
    }
}
