package view;

import java.io.*;

public class FileOutputManager {

    private static BufferedWriter bufferedWriter;

    public static void openCSVFile() {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/csv_file_example.csv"));
            bufferedWriter.write("Month,Full_centres,Open_centres,Trainees_Training,Trainees_waiting\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeDetailsToFile(int month, int traineesInTraining, int traineesWaiting, int openCentres, int fullCentres) {
        try {
            bufferedWriter.write(month + "," + fullCentres + "," + openCentres + "," + traineesInTraining + "," +traineesWaiting + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeCSVFile() {
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
