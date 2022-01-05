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
        Double result = 0.0;
        try {
            result = Double.parseDouble(config.getProperty("centresPerMonth"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static int traineeUpperBound() {
        Integer result = 0;
        try {
            result = Integer.parseInt(config.getProperty("traineeUpperBound"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static int traineeLowerBound() {
        Integer result = 0;
        try {
            result = Integer.parseInt(config.getProperty("traineeLowerBound"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }
}
