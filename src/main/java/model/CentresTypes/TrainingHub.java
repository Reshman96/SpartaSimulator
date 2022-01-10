package model.CentresTypes;

import view.InputHandler;

public class TrainingHub extends CentreType {

    private final int TRAINING_HUB_MINIMUM_ACCEPTABLE_LIMIT = InputHandler.getTrainingHubMinimumTrainees();
    private final int TRAINING_HUB_MAXIMUM_ACCEPTABLE_LIMIT = InputHandler.getTrainingHubMaximumTrainees();

    public TrainingHub() {
        super();
    }

    @Override
    public int getMaxSize() {
        return TRAINING_HUB_MAXIMUM_ACCEPTABLE_LIMIT;
    }

    @Override
    public boolean attemptShutCentreDown() {
        return getNumberOfTrainees() < TRAINING_HUB_MINIMUM_ACCEPTABLE_LIMIT;
    }
}
