package model;

import java.util.ArrayList;

public class TraineeManager {

    private static ArrayList<Trainee> waitingList = new ArrayList<>();
    private static ArrayList<Trainee> tempListOfTrainees = new ArrayList<>();

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

    public static void addTraineesFromArrayList(ArrayList<Trainee> trainees) {
        setTempListOfTrainees(trainees);
        waitingList.addAll(trainees);
    }

    public static void addRandomNumberOfTrainees(){
     setTempListOfTrainees(TraineeGenerator.getRandomNumOfTrainees());
     waitingList.addAll(getTempListOfTrainees());
    }

    public static void addSingleTrainee(CourseType courseType) {
        setTempListOfTrainees(TraineeGenerator.getSingleTrainee(courseType));
        waitingList.addAll(getTempListOfTrainees());
    }

    public static void removeTraineeFromWaitingList(Trainee toBeRemovedTrainee) {
        waitingList.remove(toBeRemovedTrainee);
    }

    public static void resetWaitingList(){
        waitingList.clear();
    }
}
