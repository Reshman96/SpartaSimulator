package model;

import org.junit.jupiter.api.*;
import java.util.Arrays;

public class TraineeTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println("Executing: " + testInfo.getClass());
    }

    @RepeatedTest(100)
    @DisplayName("Course type is valid")
    void courseTypeIsValid() {
        Trainee test = new Trainee();
        Assertions.assertTrue(Arrays.asList(CourseType.values()).contains(test.getCourse()));
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " completed.");
    }
}
