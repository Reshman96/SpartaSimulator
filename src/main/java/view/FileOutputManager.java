package view;

import java.io.*;
import java.time.LocalDateTime;

public class FileOutputManager {

    private static BufferedWriter bufferedWriter;

    public static void openCSVFile() {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/csv_file_example.csv", true));
            bufferedWriter.write(LocalDateTime.now() + " #\n");
            bufferedWriter.write("Month,Full_centres,Open_centres,Trainees_Training,Trainees_waiting\n\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeDetailsToFile(int month, int fullCentres, int openCentres, int traineesInTraining, int traineesWaiting) {
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
