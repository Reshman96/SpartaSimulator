package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Config {
    private static final FormattedProperties config;
    private static final int exitCode = 0;
    private static final String fileLocation = "src/main/resources/config.properties";

    static {
        if (!new File(fileLocation).exists()) {
            DefaultConfigMaker.createDefaultConfig();
        }
        config = new FormattedProperties();
        try {
            config.load(new BufferedReader(new FileReader(fileLocation)));
        } catch (IOException e) {
            System.err.println("Failed to load the config file properly.");
            System.exit(exitCode);
        }
    }

    public static int traineeLowerBound() {
        return negativeNumErrorChecker("traineeLowerBound");
    }

    public static int traineeUpperBound() {
        return zeroOrLowerNumErrorChecker("traineeUpperBound");
    }

    public static double centresPerMonth() {
        double result = 0.0;
        try {
            result = Double.parseDouble(config.getProperty("centresPerMonth"));
            if (result <= 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for centresPerMonth in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for centresPerMonth in the config file isn't larger than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    public static int monthsOfSimulation() {
        return zeroOrLowerNumErrorChecker("monthsOfSimulation");
    }

    public static int existingCentres() {
        return negativeNumErrorChecker("existingCentres");
    }

    public static int centreMonthlyIntakeLowerBound() {
        return negativeNumErrorChecker("centreMonthlyIntakeLowerBound");
    }

    public static int centreMonthlyIntakeUpperBound() {
        return zeroOrLowerNumErrorChecker("centreMonthlyIntakeUpperBound");
    }

    public static boolean displayEveryMonth() {
        boolean result = false;
        try {
            String displayEveryMonthString = config.getProperty("displayEveryMonth").trim().toLowerCase();
            String[] values = new String[]{"true", "false"};
            if (Arrays.asList(values).contains(displayEveryMonthString)) {
                result = Boolean.parseBoolean(displayEveryMonthString);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.err.println("Incorrect format for the value given for displayEveryMonth in the config file.");
            System.exit(exitCode);
        }
        return result;
    }

    public static int trainingHubMinimumTrainees() {
        return negativeNumErrorChecker("trainingHubMinimumTrainees");
    }

    public static int trainingHubMaximumTrainees() {
        return negativeNumErrorChecker("trainingHubMaximumTrainees");
    }

    public static int trainingHubConsecutiveMonthsOfInadequateTrainees() {
        return negativeNumErrorChecker("trainingHubConsecutiveMonthsOfInadequateTrainees");
    }

    public static int trainingHubsPerMonth() {
        return negativeNumErrorChecker("trainingHubsPerMonth");
    }

    public static int bootcampMinimumTrainees() {
        return negativeNumErrorChecker("bootcampMinimumTrainees");
    }

    public static int bootcampMaximumTrainees() {
        return negativeNumErrorChecker("bootcampMaximumTrainees");
    }

    public static int bootcampConsecutiveMonthsOfInadequateTrainees() {
        return negativeNumErrorChecker("bootcampConsecutiveMonthsOfInadequateTrainees");
    }

    public static int bootcampTotalCreations() {
        return negativeNumErrorChecker("bootcampTotalCreations");
    }

    public static int techCentreMinimumTrainees() {
        return negativeNumErrorChecker("techCentreMinimumTrainees");
    }

    public static int techCentreMaximumTrainees() {
        return negativeNumErrorChecker("techCentreMaximumTrainees");

    }

    public static int techCentresConsecutiveMonthsOfInadequateTrainees() {
        return negativeNumErrorChecker("techCentresConsecutiveMonthsOfInadequateTrainees");
    }

    private static int negativeNumErrorChecker(String methodName) {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty(methodName));
            if (intIsNegative(result)) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for " + methodName + " in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for " + methodName + " in the config file is less than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    private static int zeroOrLowerNumErrorChecker(String methodName) {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty(methodName));
            if (intIsZeroOrLower(result)) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for " + methodName + " in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for " + methodName + " in the config file is less than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    private static boolean intIsNegative(int number) {
        return number < 0;
    }

    private static boolean intIsZeroOrLower(int number) {
        return number <= 0;
    }
}
