package model;

import org.junit.jupiter.api.*;
import java.util.Arrays;

public class TraineeTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println("Executing: " + testInfo.getClass());
    }

    @BeforeEach
    void setup(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + " running now.");
    }

    @RepeatedTest(100)
    @DisplayName("Course type is valid")
    void courseTypeIsValid() {
        Trainee test = new Trainee();
        Assertions.assertTrue(Arrays.asList(CourseType.values()).contains(test.getCourse()));
    }

    @AfterEach
            void tearDown(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + " has finished testing.");
    }

    @AfterAll
            static void tearDownAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " completed.");
    }
}
