package view;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class DefaultConfigMaker {

    public static void createDefaultConfig() {
        Properties properties = new Properties();
        try {
            properties.setProperty("traineeLowerBound", "50");
            properties.setProperty("traineeUpperBound", "100");
            properties.setProperty("centresPerMonth", "0.5");
            properties.setProperty("monthsOfSimulation", "24");
            properties.setProperty("existingCentres", "0");
            properties.setProperty("displayEveryMonth", "false");
            properties.setProperty("centreMonthlyIntakeLowerBound", "1");
            properties.setProperty("centreMonthlyIntakeUpperBound", "50");

            properties.setProperty("trainingHubMinimumTrainees", "25");
            properties.setProperty("trainingHubMaximumTrainees", "100");
            properties.setProperty("trainingHubConsecutiveMonthsOfInadequateTrainees", "1");
            properties.setProperty("trainingHubsPerMonth", "3");

            properties.setProperty("bootcampMinimumTrainees", "25");
            properties.setProperty("bootcampMaximumTrainees", "500");
            properties.setProperty("bootcampConsecutiveMonthsOfInadequateTrainees", "3");
            properties.setProperty("bootcampTotalCreations", "2");

            properties.setProperty("techCentreMinimumTrainees", "25");
            properties.setProperty("techCentreMaximumTrainees", "200");
            properties.setProperty("techCentresConsecutiveMonthsOfInadequateTrainees", "1");

            properties.store(new FileWriter("src/main/resources/config.properties"), null);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
