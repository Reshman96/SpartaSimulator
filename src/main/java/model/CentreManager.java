package model;

import model.CentresTypes.Bootcamp;
import model.CentresTypes.CentreType;
import model.CentresTypes.TechCentre;
import model.CentresTypes.TrainingHub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CentreManager {
    private static ArrayList<CentreType> availableCentres = new ArrayList<>();
    // [0] is Training Hubs, [1] is BootCamp, [2-6] are the types of Tech centres
    private static int[] fullCentres = {0,0,0,0,0,0,0};
    private static int[] closedCentres = {0,0,0,0,0,0,0};
    private static int[] fullTrainees = {0,0,0,0,0};
    private static int traineesCurrentlyTraining;

    public ArrayList<CentreType> getAvailableCentres() {
        return availableCentres;
    }

    public static int[] getFullCentres() {
        return fullCentres;
    }

    public static int[] getFullTrainees() {return fullTrainees;}

    public static int[] getClosedCentres() {
        return closedCentres;
    }

    public static int getTraineesCurrentlyTraining() {
        return traineesCurrentlyTraining;
    }

    public static void addCentre(CentreType currentCentre){
        availableCentres.add(currentCentre);
    }

    public static int[] countOpenCentres(){
        // assumes closed centres will be removed from our list
        int[] centreTypes = {0,0,0,0,0,0,0};
        for (CentreType openCentre : availableCentres){
            if (openCentre.getClass() == TrainingHub.class){
                centreTypes[0] ++;
            }
            if (openCentre.getClass() == Bootcamp.class){
                centreTypes[1] ++;
            }
            if (openCentre.getClass() == TechCentre.class){
                centreTypes[((TechCentre) openCentre).getCourseTypeIndex()] ++;
            }
        }
        return centreTypes;
    }

    /**
     * Method to remove full centres from the availableCentres arraylist and count
     * them in the fullCentres int array
     */
    public static void moveFullCentres(){
        Iterator<CentreType> it = availableCentres.iterator();

        while (it.hasNext()) {
            CentreType centre = it.next();
            if (centre.isFull()) {
                it.remove();
                fullTrainees = addTraineeTypeArrays(centre.getTypesOfTrainees(), fullTrainees);
                if (centre.getClass() == TrainingHub.class){
                    fullCentres[0] ++;
                }
                if (centre.getClass() == Bootcamp.class){
                    fullCentres[1] ++;
                }
                if (centre.getClass() == TechCentre.class){
                    fullCentres[((TechCentre) centre).getCourseTypeIndex()] ++;
                }
            }
        }
    }

    public static int[] attemptCloseCentres(){
        Iterator<CentreType> it = availableCentres.iterator();

        int[] displacedTrainees = {0,0,0,0,0};

        while (it.hasNext()) {
            CentreType centre = it.next();
            if (centre.attemptShutCentreDown()) {
                it.remove();
                displacedTrainees = addTraineeTypeArrays(displacedTrainees,centre.getTypesOfTrainees());
                if (centre.getClass() == TrainingHub.class){
                    closedCentres[0] ++;
                }
                if (centre.getClass() == Bootcamp.class){
                    closedCentres[1] ++;
                }
                if (centre.getClass() == TechCentre.class){
                    closedCentres[((TechCentre) centre).getCourseTypeIndex()] ++;
                }
            }
        }
        return displacedTrainees;
    }

    private static int[] addTraineeTypeArrays(int[] array1, int[] array2){
        int[] sumArray = {0,0,0,0,0};
        for (int i = 0; i < 5; i++) {
            sumArray[i] = array1[i] + array2[i];
        }
        return sumArray;
    }


    public static void resetCentreArray(){
        availableCentres.clear();
    }

}
