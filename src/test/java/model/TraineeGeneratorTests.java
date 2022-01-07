package model;

import org.junit.jupiter.api.*;
import view.InputHandler;

import java.util.ArrayList;

public class TraineeGeneratorTests {

    @Nested
    @DisplayName("Do they all return an arraylist of trainees?")
    class doTheyAllReturnAnArraylistOfTrainees {
        @Test
        @DisplayName("Does getRandomNumOfTrainees return an arraylist of trainees?")
        void doesGetRandomNumOfTraineesReturnAnArraylistOfTrainees() {
            Assertions.assertInstanceOf(new ArrayList<Trainee>().getClass(), TraineeGenerator.getRandomNumOfTrainees());
        }
        @Test
        @DisplayName("Does getTraineesFromArray return an arraylist of trainees?")
        void doesGetTraineesFromArrayReturnAnArraylistOfTrainees() {
            Assertions.assertInstanceOf(new ArrayList<Trainee>().getClass(), TraineeGenerator.getTraineesFromArray(new int[] {0,0,0,0,1}));
        }
        @Test
        @DisplayName("Does getSingleTrainee return an arraylist of trainees?")
        void doesGetSingleTraineeReturnAnArraylistOfTrainees() {
            Assertions.assertInstanceOf(new ArrayList<Trainee>().getClass(), TraineeGenerator.getSingleTrainee(CourseType.CSHARP));
        }
    }

    @Nested
    @DisplayName("Do they all return the expected number of trainees?")
    class doTheyAllReturnTheExpectedNumberOfTrainees {

        @Test
        @DisplayName("Does getTraineesFromArray return a single trainee?")
        void doesGetTraineesFromArrayReturnASingleTrainee() {
            Assertions.assertEquals(10, TraineeGenerator.getTraineesFromArray(new int[] {0,1,2,3,4}).size());
        }
        @Test
        @DisplayName("Does getSingleTrainee return a single trainee?")
        void doesGetSingleTraineeReturnASingleTrainee() {
            Assertions.assertEquals(1, TraineeGenerator.getSingleTrainee(CourseType.CSHARP).size());
        }
    }

    @Nested
    @DisplayName("Do they return the expected trainee class?")
    class doTheyReturnTheExpectedTraineeClass {
        @Test
        @DisplayName("Does getTraineesFromArray return only buisness course trainees if prompted?")
        void doesGetTraineesFromArrayReturnOnlyBuisnessCourseTraineesIfPrompted() {
            ArrayList<Trainee> traineeArray =TraineeGenerator.getTraineesFromArray(new int[] {0,0,0,0,4});
            Assertions.assertEquals(CourseType.BUSINESS, traineeArray.get(0).getCourse());
        }

        @Test
        @DisplayName("Does getSingleTrainee return a Java course trainee if prompted?")
        void doesGetSingleTraineeReturnOnlyBuisnessCourseTraineesIfPrompted() {
            ArrayList<Trainee> traineeArray =TraineeGenerator.getSingleTrainee(CourseType.JAVA);
            Assertions.assertEquals(CourseType.JAVA, traineeArray.get(0).getCourse());

        }
    }

//    @RepeatedTest(10)
//    @DisplayName("Does the shuffling of getTraineesFromArray work?")
//    void doesTheShufflingOfGetTraineesFromArrayWork() {
//        ArrayList<Trainee> traineeArray =TraineeGenerator.getTraineesFromArray(new int[] {1,1,1,1,1});
//        Assertions.assertEquals(CourseType.BUSINESS, traineeArray.get(0).getCourse());
//    }
}
