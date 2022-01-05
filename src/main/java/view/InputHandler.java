package view;

public class InputHandler {
    private static int traineeUpperBound;
    private static double centresPerMonth;
    private static int monthsOfSimulation;

    public static int getTraineeUpperBound() {
        return traineeUpperBound;
    }

    public static double getCentresPerMonth() {
        return centresPerMonth;
    }

    public static int getMonthsOfSimulation() {
        return monthsOfSimulation;
    }

    public static void setMonthsOfSimulation(int numberOfMonths) {
        monthsOfSimulation = numberOfMonths;
    }
}
