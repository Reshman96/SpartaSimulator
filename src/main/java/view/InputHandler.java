package view;

import java.io.BufferedReader;

public class InputHandler {
    private int traineeUpperBound;
    private double centresPerMonth;
    private int monthsOfSimulation;

    public InputHandler(int monthsOfSimulation) {
        this.monthsOfSimulation = monthsOfSimulation;
        // this.traineeUpperBound = resources/config.properties
//        this.traineeUpperBound = config.getP

        // this.centresPerMonth;    need to know where config file is
    }

    public int getTraineeUpperBound() {
        return traineeUpperBound;
    }

    public void setTraineeUpperBound(int traineeUpperBound) {
        this.traineeUpperBound = traineeUpperBound;
    }

    public double getCentresPerMonth() {
        return centresPerMonth;
    }

    public void setCentresPerMonth(double centresPerMonth) {
        this.centresPerMonth = centresPerMonth;
    }

    public int getMonthsOfSimulation() {
        return monthsOfSimulation;
    }

    public void setMonthsOfSimulation(int monthsOfSimulation) {
        this.monthsOfSimulation = monthsOfSimulation;
    }
}
