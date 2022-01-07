package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class Config {
    private static final Properties config;
    private static final int exitCode = 0;

    static {
        if (!new File("src/main/resources/config.properties").exists()) {
            DefaultConfigMaker.createDefaultConfig();
        }
        config = new Properties();
        try {
            config.load(new BufferedReader(new FileReader("src/main/resources/config.properties")));
        } catch (IOException e) {
            System.err.println("Failed to load the config file properly.");
            System.exit(exitCode);
        }
    }

    public static int traineeLowerBound() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("traineeLowerBound"));
            if (result < 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for traineeLowerBound in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for traineeLowerBound in the config file isn't larger than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    public static int traineeUpperBound() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("traineeUpperBound"));
            if (result <= 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for traineeUpperBound in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for traineeUpperBound in the config file isn't larger than 0.");
            System.exit(exitCode);
        }
        return result;
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
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("monthsOfSimulation"));
            if (result <= 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for value given for monthsOfSimulation in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for monthsOfSimulation in the config file isn't larger than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    public static int existingCentres() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("existingCentres"));
            if (result < 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for existingCentres in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for existingCentres in the config file is less than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    public static int centreMonthlyIntakeLowerBound() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("centreMonthlyIntakeLowerBound"));
            if (result < 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for centreMonthlyIntakeLowerBound in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for centreMonthlyIntakeLowerBound in the config file is less than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    public static int centreMonthlyIntakeUpperBound() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("centreMonthlyIntakeUpperBound"));
            if (result <= 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for centreMonthlyIntakeUpperBound in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for centreMonthlyIntakeUpperBound in the config file isn't larger than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    public static boolean displayEveryMonth() {
        boolean result = false;
        try {
            String displayEveryMonthString = config.getProperty("displayEveryMonth").trim();
            String[] values = new String[] {"True", "true", "False", "false"};
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
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("trainingHubMinimumTrainees"));
            if (result < 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for trainingHubMinimumTrainees in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for trainingHubMinimumTrainees in the config file is less than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    public static int trainingHubMaximumTrainees() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("trainingHubMaximumTrainees"));
            if (result < 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for trainingHubMaximumTrainees in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for trainingHubMaximumTrainees in the config file is less than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    public static int trainingHubConsecutiveMonthsOfInadequateTrainees() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("trainingHubConsecutiveMonthsOfInadequateTrainees"));
            if (result < 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for trainingHubConsecutiveMonthsOfInadequateTrainees in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for trainingHubConsecutiveMonthsOfInadequateTrainees in the config file is less than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    public static int trainingHubsPerMonth() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("trainingHubsPerMonth"));
            if (result < 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for trainingHubsPerMonth in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for trainingHubsPerMonth in the config file is less than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    public static int bootcampMinimumTrainees() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("bootcampMinimumTrainees"));
            if (result < 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for bootcampMinimumTrainees in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for bootcampMinimumTrainees in the config file is less than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    public static int bootcampMaximumTrainees() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("bootcampMaximumTrainees"));
            if (result < 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for bootcampMaximumTrainees in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for bootcampMaximumTrainees in the config file is less than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    public static int bootcampConsecutiveMonthsOfInadequateTrainees() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("bootcampConsecutiveMonthsOfInadequateTrainees"));
            if (result < 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for bootcampConsecutiveMonthsOfInadequateTrainees in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for bootcampConsecutiveMonthsOfInadequateTrainees in the config file is less than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    public static int bootcampTotalCreations() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("bootcampTotalCreations"));
            if (result < 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for bootcampTotalCreations in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for bootcampTotalCreations in the config file is less than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    public static int techCentreMinimumTrainees() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("techCentreMinimumTrainees"));
            if (result < 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for techCentreMinimumTrainees in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for techCentreMinimumTrainees in the config file is less than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    public static int techCentreMaximumTrainees() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("techCentreMaximumTrainees"));
            if (result < 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for techCentreMaximumTrainees in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for techCentreMaximumTrainees in the config file is less than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    public static int techCentresConsecutiveMonthsOfInadequateTrainees() {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty("techCentresConsecutiveMonthsOfInadequateTrainees"));
            if (result < 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format for the value given for techCentresConsecutiveMonthsOfInadequateTrainees in the config file.");
            System.exit(exitCode);
        } catch (Exception e) {
            System.err.println("The value given for techCentresConsecutiveMonthsOfInadequateTrainees in the config file is less than 0.");
            System.exit(exitCode);
        }
        return result;
    }

    public static int intNotNegativeChecker(String methodName) {
        int result = 0;
        try {
            result = Integer.parseInt(config.getProperty(methodName));
            if (result < 0) {
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
}
