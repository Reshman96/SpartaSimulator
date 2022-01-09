package view;

import java.io.FileWriter;
import java.io.IOException;

public class DefaultConfigMaker {
    private static final String fileLocation = "src/main/resources/config.properties";

    public static void createDefaultConfig() throws IOException {
        FileWriter fileWriter = new FileWriter(fileLocation);
        try {
            setIndividualProperty("traineeLowerBound", "50", fileWriter, "Default Values", false);
            setIndividualProperty("traineeUpperBound", "100", fileWriter, null, false);
            setIndividualProperty("centresPerMonth", "0.5", fileWriter, null, false);
            setIndividualProperty("monthsOfSimulation", "24", fileWriter, null, false);
            setIndividualProperty("existingCentres", "0", fileWriter, null, false);
            setIndividualProperty("displayEveryMonth", "false", fileWriter, null, false);
            setIndividualProperty("centreMonthlyIntakeLowerBound", "1", fileWriter, null, false);
            setIndividualProperty("centreMonthlyIntakeUpperBound", "50", fileWriter, null, true);

            setIndividualProperty("trainingHubMinimumTrainees", "25", fileWriter, "Training Hub", false);
            setIndividualProperty("trainingHubMaximumTrainees", "100", fileWriter, null, false);
            setIndividualProperty("trainingHubConsecutiveMonthsOfInadequateTrainees", "1", fileWriter, null, false);
            setIndividualProperty("trainingHubsPerMonth", "3", fileWriter, null, true);

            setIndividualProperty("bootcampMinimumTrainees", "25", fileWriter, "Bootcamp", false);
            setIndividualProperty("bootcampMaximumTrainees", "500", fileWriter, null, false);
            setIndividualProperty("bootcampConsecutiveMonthsOfInadequateTrainees", "3", fileWriter, null, false);
            setIndividualProperty("bootcampTotalCreations", "2", fileWriter, null, true);

            setIndividualProperty("techCentreMinimumTrainees", "25", fileWriter, "Tech Centre", false);
            setIndividualProperty("techCentreMaximumTrainees", "200", fileWriter, null, false);
            setIndividualProperty("techCentresConsecutiveMonthsOfInadequateTrainees", "1", fileWriter, null, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void setIndividualProperty(String key, String value, FileWriter fileWriter, String comments, boolean endOfBlock) throws IOException {
        FormattedProperties properties = new FormattedProperties();
        properties.setProperty(key, value);
        properties.store(fileWriter, comments, endOfBlock);
    }
}
