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

    public static double centresPerMonth() {
        double result = 0.0;
        try {
            result = Double.parseDouble(config.getProperty("centresPerMonth"));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for centresPerMonth in the config file.");
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

    public static int traineeLowerBound() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("traineeLowerBound"));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for traineeLowerBound in the config file.");
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
}
