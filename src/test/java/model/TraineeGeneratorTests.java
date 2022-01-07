package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TraineeGeneratorTests {

    @Test
    @DisplayName("Does getTraineesFromArray return the expected arraylist size?")
    void doesGetTraineesFromArrayReturnTheExpectedArraylistSize() {
        int arraySize = TraineeGenerator.getTraineesFromArray(new int[]{0, 1, 2, 3, 4}).size();
        Assertions.assertEquals(10, arraySize);
    }

    @Test
    @DisplayName("Does getSingleTrainee return the expected arraylist size?")
    void doesgetSingleTraineeReturnTheExpectedArraylistSize() {
        int arraySize = TraineeGenerator.getSingleTrainee(CourseType.JAVA).size();
        Assertions.assertEquals(1, arraySize);
    }
}
