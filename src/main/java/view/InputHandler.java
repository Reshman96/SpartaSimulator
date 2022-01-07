package view;

public class InputHandler {
    private static int traineeLowerBound;
    private static int traineeUpperBound;
    private static double centresPerMonth;
    private static int monthsOfSimulation;
    private static int existingCentres;
    private static boolean displayEveryMonth;
    private static int trainingHubMinimumTrainees;
    private static int trainingHubMaximumTrainees;
    private static int centreMonthlyIntakeLowerBound;
    private static int centreMonthlyIntakeUpperBound;
    private static int trainingHubConsecutiveMonthsOfInadequateTrainees;
    private static int trainingHubsPerMonth;
    private static int bootcampMinimumTrainees;
    private static int bootcampMaximumTrainees;
    private static int bootcampConsecutiveMonthsOfInadequateTrainees;
    private static int bootcampTotalCreations;
    private static int techCentreMinimumTrainees;
    private static int techCentreMaximumTrainees;
    private static int techCentresConsecutiveMonthsOfInadequateTrainees;

    public static int getTraineeLowerBound() {
        return traineeLowerBound;
    }

    public static int getTraineeUpperBound() {
        return traineeUpperBound;
    }

    public static double getCentresPerMonth() {
        return centresPerMonth;
    }

    public static int getMonthsOfSimulation() {
        return monthsOfSimulation;
    }

    public static int getExistingCentres() {
        return existingCentres;
    }

    public static boolean getDisplayEveryMonth() {
        return displayEveryMonth;
    }

    public static int getCentreMonthlyIntakeLowerBound() {
        return centreMonthlyIntakeLowerBound;
    }

    public static int getCentreMonthlyIntakeUpperBound() {
        return centreMonthlyIntakeUpperBound;
    }

    public static int getTrainingHubMinimumTrainees() {
        return trainingHubMinimumTrainees;
    }

    public static int getTrainingHubMaximumTrainees() {
        return trainingHubMaximumTrainees;
    }

    public static int getTrainingHubConsecutiveMonthsOfInadequateTrainees() {
        return trainingHubConsecutiveMonthsOfInadequateTrainees;
    }

    public static int getTrainingHubsPerMonth() {
        return trainingHubsPerMonth;
    }

    public static int getBootcampMinimumTrainees() {
        return bootcampMinimumTrainees;
    }

    public static int getBootcampMaximumTrainees() {
        return bootcampMaximumTrainees;
    }

    public static int getBootcampConsecutiveMonthsOfInadequateTrainees() {
        return bootcampConsecutiveMonthsOfInadequateTrainees;
    }

    public static int getBootcampTotalCreations() {
        return bootcampTotalCreations;
    }

    public static int getTechCentreMinimumTrainees() {
        return techCentreMinimumTrainees;
    }

    public static int getTechCentreMaximumTrainees() {
        return techCentreMaximumTrainees;
    }

    public static int getTechCentresConsecutiveMonthsOfInadequateTrainees() {
        return techCentresConsecutiveMonthsOfInadequateTrainees;
    }

    public static void setStartingParameters() {
        traineeLowerBound = Config.traineeLowerBound();
        traineeUpperBound = Config.traineeUpperBound();
        centresPerMonth = Config.centresPerMonth();
        monthsOfSimulation = Config.monthsOfSimulation();
        existingCentres = Config.existingCentres();
        displayEveryMonth = Config.displayEveryMonth();
        centreMonthlyIntakeLowerBound = Config.centreMonthlyIntakeLowerBound();
        centreMonthlyIntakeUpperBound = Config.centreMonthlyIntakeUpperBound();
        trainingHubMinimumTrainees = Config.trainingHubMinimumTrainees();
        trainingHubMaximumTrainees = Config.trainingHubMaximumTrainees();
        trainingHubConsecutiveMonthsOfInadequateTrainees = Config.trainingHubConsecutiveMonthsOfInadequateTrainees();
        trainingHubsPerMonth = Config.trainingHubsPerMonth();
        bootcampMinimumTrainees = Config.bootcampMinimumTrainees();
        bootcampMaximumTrainees = Config.bootcampMaximumTrainees();
        bootcampConsecutiveMonthsOfInadequateTrainees = Config.bootcampConsecutiveMonthsOfInadequateTrainees();
        bootcampTotalCreations = Config.bootcampTotalCreations();
        techCentreMinimumTrainees = Config.techCentreMinimumTrainees();
        techCentreMaximumTrainees = Config.techCentreMaximumTrainees();
        techCentresConsecutiveMonthsOfInadequateTrainees = Config.techCentresConsecutiveMonthsOfInadequateTrainees();
    }
}
