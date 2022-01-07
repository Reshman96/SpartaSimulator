package model;

import model.CentresTypes.Bootcamp;
import model.CentresTypes.CentreType;
import model.CentresTypes.TechCentre;
import model.CentresTypes.TrainingHub;
import org.junit.jupiter.api.*;

public class CentreManagerTests {

    @AfterEach
    void teardown(){CentreManager.resetCentreArray();}

    @Nested
    @DisplayName("Testing Output types")
    class testingOutputTypes {
        @Test
        @DisplayName("does getFullCentres return an int array?")
        void doesGetFullCentresReturnAnIntArray() {
            Assertions.assertInstanceOf(int[].class, CentreManager.getFullCentres());
        }
    }


    @Test
    @DisplayName("Adding one of each type of training centre")
    void addingOneOfEachTypeOfTrainingCentre() {
        TrainingHub trainingHub = new TrainingHub();
        Bootcamp bootcamp = new Bootcamp();
        TechCentre techCentre = new TechCentre(CourseType.JAVA);
        CentreManager.addCentre(trainingHub);
        CentreManager.addCentre(bootcamp);
        CentreManager.addCentre(techCentre);
        Assertions.assertArrayEquals(new int[]{1, 1, 1}, CentreManager.countOpenCentres());
    }

    @Test
    @DisplayName("Adding three bootcamps")
    void addingThreeBootcamps() {
        Bootcamp bootcamp = new Bootcamp();
        CentreManager.addCentre(bootcamp);
        CentreManager.addCentre(bootcamp);
        CentreManager.addCentre(bootcamp);
        Assertions.assertArrayEquals(new int[]{0, 3, 0}, CentreManager.countOpenCentres());
    }

    @Test
    @DisplayName("Do getFullCentres and addFullCentres work properly together? ")
    void doGetFullCentresAndAddFullCentresWorkProperlyTogether() {
        CentreManager.addFullCentre(0);
        CentreManager.addFullCentre(0);
        CentreManager.addFullCentre(1);
        Assertions.assertArrayEquals(new int[]{2, 1, 0}, CentreManager.getFullCentres());
    }
}
