package model;

import view.InputHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static model.RandomNumberGenerator.getRandomInt;

public class TraineeGenerator {

    private static final int TRAINEE_UPPER_BOUND = InputHandler.getTraineeUpperBound();
    private static final int TRAINEE_LOWER_BOUND = InputHandler.getTraineeLowerBound();

    public static ArrayList<Trainee> getRandomNumOfTrainees() {

        if (TRAINEE_UPPER_BOUND != 0 && TRAINEE_LOWER_BOUND != 0) {
            int boundedRandomNumber = getRandomInt(TRAINEE_LOWER_BOUND, TRAINEE_UPPER_BOUND);
            ArrayList<Trainee> traineeArrayList = new ArrayList<>(boundedRandomNumber);

            for (int i = 0; i < boundedRandomNumber; i++) {
                traineeArrayList.add(new Trainee());
            }
            return traineeArrayList;
        } else {
            int defaultRandomNumber = getRandomInt(50, 100);
            ArrayList<Trainee> traineeArrayList = new ArrayList<>(defaultRandomNumber);
            for (int i = 0; i < defaultRandomNumber; i++) {
                traineeArrayList.add(new Trainee());
            }
            return traineeArrayList;
        }
    }

    public static ArrayList<Trainee> getTraineesFromArray(int[] traineeTypeArray){
        int traineeSum = Arrays.stream(traineeTypeArray).sum();
        ArrayList<Trainee> traineeArrayList = new ArrayList<>(traineeSum);

        for (int i = 0; i < traineeTypeArray[0]; i++) {
            traineeArrayList.add(new Trainee(CourseType.JAVA));
        }
        for (int i = 0; i < traineeTypeArray[1]; i++) {
            traineeArrayList.add(new Trainee(CourseType.CSHARP));
        }
        for (int i = 0; i < traineeTypeArray[2]; i++) {
            traineeArrayList.add(new Trainee(CourseType.DATA));
        }
        for (int i = 0; i < traineeTypeArray[3]; i++) {
            traineeArrayList.add(new Trainee(CourseType.DEVOPS));
        }
        for (int i = 0; i < traineeTypeArray[4]; i++) {
            traineeArrayList.add(new Trainee(CourseType.BUSINESS));
        }
        Collections.shuffle(traineeArrayList);
        return traineeArrayList;
    }

    public static ArrayList<Trainee> getSingleTrainee(CourseType courseType){
        ArrayList<Trainee> traineeArrayList = new ArrayList<>(1);
        traineeArrayList.add(new Trainee(courseType));
        return traineeArrayList;
    }
}