package model.CentreTypes;

import model.CentresTypes.TrainingHub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TrainingHubTests {

    @Test
    @DisplayName("Test that max size is 100")
    void testThatMaxSizeIs500() {
        TrainingHub trainingHub = new TrainingHub();
        Assertions.assertEquals(100, trainingHub.getMaxSize());
    }
}
