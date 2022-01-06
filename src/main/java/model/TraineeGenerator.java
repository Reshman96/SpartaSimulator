package model;

import view.InputHandler;

import java.util.ArrayList;

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
}