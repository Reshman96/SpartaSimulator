package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static final Properties config;

    static {
        if(!new File("src/main/resources/config.properties").exists()){
            DefaultConfigMaker.createDefaultConfig();
        }
        config = new Properties();
        try {
            config.load(new BufferedReader(new FileReader("src/main/resources/config.properties")));
        } catch (IOException e) {
            System.err.println("Failed to load the config file properly.");
        }
    }

    public static int traineeLowerBound() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("traineeLowerBound"));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for traineeLowerBound in the config file.");
        }
        return result;
    }

    public static int traineeUpperBound() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("traineeUpperBound"));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for traineeUpperBound in the config file.");
        }
        return result;
    }

    public static double centresPerMonth() {
        double result = 0.0;
        try {
            result = Double.parseDouble(config.getProperty("centresPerMonth"));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for centresPerMonth in the config file.");
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
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for value given for monthsOfSimulation in the config file.");
        } catch (Exception e) {
            System.err.println("The value given for monthsOfSimulation in the config file isn't larger than 0.");
        }
        return result;
    }

    public static int existingCentres() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("existingCentres"));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for existingCentres in the config file.");
        }
        return result;
    }

    public static boolean displayEveryMonth() {
        boolean result = false;
        try {
            result = Boolean.parseBoolean(config.getProperty("displayEveryMonth"));
        } catch (Exception e) {
            System.err.println("Incorrect format for the value given for displayEveryMonth in the config file.");
        }
        return result;
    }

    public static int trainingHubMinimumTrainees() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("trainingHubMinimumTrainees"));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for trainingHubMinimumTrainees in the config file.");
        }
        return result;
    }

    public static int trainingHubMaximumTrainees() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("trainingHubMaximumTrainees"));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for trainingHubMaximumTrainees in the config file.");
        }
        return result;
    }

    public static int trainingHubConsecutiveMonthsOfInadequateTrainees() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("trainingHubConsecutiveMonthsOfInadequateTrainees"));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for trainingHubConsecutiveMonthsOfInadequateTrainees in the config file.");
        }
        return result;
    }

    public static int trainingHubsPerMonth() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("trainingHubsPerMonth"));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for trainingHubsPerMonth in the config file.");
        }
        return result;
    }

    public static int bootcampMinimumTrainees() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("bootcampMinimumTrainees"));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for bootcampMinimumTrainees in the config file.");
        }
        return result;
    }

    public static int bootcampMaximumTrainees() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("bootcampMaximumTrainees"));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for bootcampMaximumTrainees in the config file.");
        }
        return result;
    }

    public static int bootcampConsecutiveMonthsOfInadequateTrainees() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("bootcampConsecutiveMonthsOfInadequateTrainees"));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for bootcampConsecutiveMonthsOfInadequateTrainees in the config file.");
        }
        return result;
    }

    public static int bootcampTotalCreations() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("bootcampTotalCreations"));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for bootcampTotalCreations in the config file.");
        }
        return result;
    }

    public static int techCentreMinimumTrainees() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("techCentreMinimumTrainees"));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for techCentreMinimumTrainees in the config file.");
        }
        return result;
    }

    public static int techCentreMaximumTrainees() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("techCentreMaximumTrainees"));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for techCentreMaximumTrainees in the config file.");
        }
        return result;
    }

    public static int techCentresConsecutiveMonthsOfInadequateTrainees() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("techCentresConsecutiveMonthsOfInadequateTrainees"));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for techCentresConsecutiveMonthsOfInadequateTrainees in the config file.");
        }
        return result;
    }
}
