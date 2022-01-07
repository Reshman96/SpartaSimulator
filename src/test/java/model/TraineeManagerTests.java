package model;

import model.CentresTypes.Bootcamp;
import model.CentresTypes.TechCentre;
import model.CentresTypes.TrainingHub;
import org.junit.jupiter.api.*;

public class TraineeManagerTests {

    private TraineeManager traineeManager = new TraineeManager();


//    @BeforeEach
//    static void setup(){
//        TraineeManager = new TraineeManager();
//    }

    @AfterEach
    void teardown(){CentreManager.resetCentreArray();}

    @Nested
    @DisplayName("Testing Trainees in the Waiting list")
    class testingTraineesInTheWaitingList {
        /**
         * This test focus on checking that the random number of trainees are generated
         * is equal to the waiting list of trainees
         */
        @Test
        @DisplayName("Test Random Number of Trainees generated added to the waiting list")
        void testRandomNumberOfTraineesGeneratedAddedToTheWaitingList() {
            traineeManager.addRandomNumberOfTrainees();
            int trainRandomCreated = traineeManager.getTempListOfTraineesSize();
            int waitingListSize = traineeManager.getWaitingTrainees();
            //System.out.println(trainRandomCreated + " / " + waitingListSize);
            Assertions.assertEquals(trainRandomCreated, waitingListSize);
        }

        /**
         * This test should check if new trainees can be added to the existing waiting list
         */
        @Test
        @DisplayName("Test new trainees can be added to the existing waiting list")
        void testNewTraineesCanBeAddedToTheExistingWaitingList() {
            traineeManager.addRandomNumberOfTrainees();
            int sumOfTraineesInWaitingList;


        }

        /**
         * This test should check if waiting list for removed is updated
         */
    }

}
