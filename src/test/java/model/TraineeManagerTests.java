package model;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class TraineeManagerTests {

    @AfterEach
    void teardown(){
        TraineeManager.resetWaitingList();
    }

    @Test
    @DisplayName("Test random number of trainees generated added to the waiting list")
    void testRandomNumberOfTraineesGeneratedAddedToTheWaitingList() {
        TraineeManager.addRandomNumberOfTrainees();
        Assertions.assertEquals(TraineeManager.getTempListOfTraineesSize(), TraineeManager.getWaitingTrainees());
    }

    @Test
    @DisplayName("Test new trainees can be added to the existing waiting list")
    void testNewTraineesCanBeAddedToTheExistingWaitingList() {
        TraineeManager.addRandomNumberOfTrainees();
        int sumOfTraineesInWaitingList = TraineeManager.getTempListOfTraineesSize();
        TraineeManager.addSingleTrainee(CourseType.BUSINESS);
        sumOfTraineesInWaitingList += TraineeManager.getTempListOfTraineesSize();
        Assertions.assertEquals(TraineeManager.getWaitingTrainees(), sumOfTraineesInWaitingList);
    }

    @Test
    @DisplayName("Test removing a trainee updates the waiting list accordingly")
    void testRemovingATraineeUpdatesTheWaitingListAccordingly() {
        Trainee trainee1 = new Trainee(CourseType.JAVA);
        Trainee trainee2 = new Trainee(CourseType.DATA);
        Trainee trainee3 = new Trainee(CourseType.BUSINESS);
        ArrayList<Trainee> groupTrainees = new ArrayList<>();
        groupTrainees.add(trainee1);
        groupTrainees.add(trainee2);
        groupTrainees.add(trainee3);
        TraineeManager.addTraineesFromArrayList(groupTrainees);
        TraineeManager.removeTraineeFromWaitingList(trainee1);
        Assertions.assertEquals(2, TraineeManager.getWaitingTrainees());
    }

    @Test
    @DisplayName("Test that a single trainee is added to the waiting list")
    void testThatASingleTraineeIsAddedToTheWaitingList() {
        TraineeManager.addSingleTrainee(CourseType.JAVA);
        Assertions.assertEquals(1, TraineeManager.getWaitingTrainees());
    }
}

