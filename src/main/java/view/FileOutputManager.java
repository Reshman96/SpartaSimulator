package view;

import java.io.*;

public class FileOutputManager {

    private int currentMonth;
    private int numOfOpenCentres;
    private int numOFullCentres;
    private int numOfTraineesTraining;
    private int numOfTraineesWaiting;

    private static void writeToFile(int month, int traineesInTraining, int traineesWaiting, int openCentres, int fullCentres) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/csv_file_example.txt"));

            bufferedWriter.write("Month: " + month);
            bufferedWriter.write("Full Centres: " + fullCentres);
            bufferedWriter.write("Open Centres: " + openCentres);
            bufferedWriter.write("Current Trainees: " + traineesInTraining);
            bufferedWriter.write("Waiting list size: " + traineesWaiting);

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
