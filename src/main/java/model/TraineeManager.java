package model;

import java.sql.Array;
import java.util.ArrayList;

public class TraineeManager {

    private static ArrayList<Trainee> waitingList = new ArrayList<>();
    private static ArrayList<Trainee> tempListOfTrainees = new ArrayList();
    private int waitingTrainees;

    public static ArrayList<Trainee> getWaitingList() {
        return waitingList;
    }

    public static int getWaitingTrainees() {
        return waitingList.size();
    }

    public static int getTempListOfTraineesSize() {
        return tempListOfTrainees.size();
    }

    public static ArrayList<Trainee> getTempListOfTrainees() {
        return tempListOfTrainees;
    }

    public static void setTempListOfTrainees(ArrayList<Trainee> tempListOfTrainees) {
        TraineeManager.tempListOfTrainees = tempListOfTrainees;
    }

    public static void addTrainees(Trainee singleTrainee){
        waitingList.add(singleTrainee);
    }

    public static void addRandomNumberOfTrainees(){
     setTempListOfTrainees(TraineeGenerator.getRandomNumOfTrainees());
     waitingList.addAll(getTempListOfTrainees());
    }

//    public static void addTraineesFromArray(int[] traineeTypeArray){
//        tempListOfTrainees = TraineeGenerator.getTraineesFromArray(traineeTypeArray);
//        waitingList.addAll(tempListOfTrainees);
//    }

    public static void addTraineesFromClosedCentre(ArrayList<Trainee> displacedTrainees) {
        setTempListOfTrainees(displacedTrainees);
        //tempListOfTrainees = displacedTrainees;
        waitingList.addAll(getTempListOfTrainees());
    }

    public static void addSingleTrainee(CourseType courseType) {
        setTempListOfTrainees(TraineeGenerator.getSingleTrainee(courseType));
        //tempListOfTrainees = TraineeGenerator.getSingleTrainee(courseType);
        waitingList.addAll(getTempListOfTrainees());
    }

    public static ArrayList<Trainee> removeTraineeFromWaitingList(Trainee toBeRemovedTrainee) {
        waitingList.remove(toBeRemovedTrainee);
        return waitingList;
    }

}
