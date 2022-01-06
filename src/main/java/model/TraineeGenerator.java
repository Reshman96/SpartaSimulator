package model;

import view.InputHandler;

import static model.RandomNumberGenerator.getRandomInt;

public class TraineeGenerator {

    private static final int TRAINEE_UPPER_BOUND = InputHandler.getTraineeUpperBound();
    private static final int TRAINEE_LOWER_BOUND = InputHandler.getTraineeLowerBound();

    public static int getRandomNumOfTrainees() {

        if (TRAINEE_UPPER_BOUND != 0 && TRAINEE_LOWER_BOUND != 0)
            return getRandomInt(TRAINEE_LOWER_BOUND, TRAINEE_UPPER_BOUND);
        else return getRandomInt(50, 100);
    }
}