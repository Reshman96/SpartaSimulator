package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
    // src/main/resources/config.properties
    private static final Properties config;

    static {
        config = new Properties();
        try {
            config.load(new BufferedReader(new FileReader("src/main/resources/config.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double centresPerMonth() {
        double result = 0.0;
        try {
            result = Double.parseDouble(config.getProperty("centresPerMonth"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static int traineeUpperBound() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("traineeUpperBound"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static int traineeLowerBound() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("traineeLowerBound"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static int monthsOfSimulation() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("monthsOfSimulation"));
            if (result <= 0) {
                throw new Exception("Provided value for numberOfMonths is too low. Value must be greater than 0.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
