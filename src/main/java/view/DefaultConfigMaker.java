package view;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class DefaultConfigMaker {

    public static void createDefaultConfig() {
        Properties properties = new Properties();
        try {
            properties.setProperty("centresPerMonth", "0.5");
            properties.setProperty("traineeUpperBound", "100");
            properties.setProperty("traineeLowerBound", "50");
            properties.setProperty("monthsOfSimulation", "24");
            properties.setProperty("existingCentres", "0");
            properties.store(new FileWriter("src/main/resources/config.properties"), null);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
