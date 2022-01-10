package view;

import java.io.FileWriter;
import java.io.IOException;

public class DefaultConfigMaker {
    private static final String fileLocation = "src/main/resources/config.properties";
    private static FileWriter fileWriter = null;

    static {
        try {
            fileWriter = new FileWriter(fileLocation);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createDefaultConfig() {
        try {
            setIndividualProperty("traineeLowerBound", "50", "Default Values");
            setIndividualProperty("traineeUpperBound", "100");
            setIndividualProperty("centresPerMonth", "0.5");
            setIndividualProperty("monthsOfSimulation", "24");
            setIndividualProperty("existingCentres", "0");
            setIndividualProperty("displayEveryMonth", "false");
            setIndividualProperty("centreMonthlyIntakeLowerBound", "1");
            setIndividualProperty("centreMonthlyIntakeUpperBound", "50", true);

            setIndividualProperty("trainingHubMinimumTrainees", "25", "Training Hub");
            setIndividualProperty("trainingHubMaximumTrainees", "100");
            setIndividualProperty("trainingHubConsecutiveMonthsOfInadequateTrainees", "1");
            setIndividualProperty("trainingHubsPerMonth", "3", true);

            setIndividualProperty("bootcampMinimumTrainees", "25", "Bootcamp");
            setIndividualProperty("bootcampMaximumTrainees", "500");
            setIndividualProperty("bootcampConsecutiveMonthsOfInadequateTrainees", "3");
            setIndividualProperty("bootcampTotalCreations", "2", true);

            setIndividualProperty("techCentreMinimumTrainees", "25", "Tech Centre");
            setIndividualProperty("techCentreMaximumTrainees", "200");
            setIndividualProperty("techCentresConsecutiveMonthsOfInadequateTrainees", "1", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void setIndividualProperty(String key, String value, boolean endOfBlock, String comments) throws IOException {
        FormattedProperties properties = new FormattedProperties();
        properties.setProperty(key, value);
        properties.store(fileWriter, comments, endOfBlock);
    }

    private static void setIndividualProperty(String key, String value, boolean endOfBlock) throws IOException {
        setIndividualProperty(key, value, endOfBlock, null);
    }

    private static void setIndividualProperty(String key, String value, String comments) throws IOException {
        setIndividualProperty(key, value, false, comments);
    }

    private static void setIndividualProperty(String key, String value) throws IOException {
        setIndividualProperty(key, value, false, null);
    }
}
