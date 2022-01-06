package view;

import java.io.*;
import java.time.LocalDateTime;

public class FileOutputManager {

    private static BufferedWriter bufferedWriter;

    public static void openCSVFile() {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/sparta_simulation_csv.csv", true));
            bufferedWriter.write(LocalDateTime.now() + " #\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeDetailsToFile(int month, int[] fullCentres, int[] openCentres, int[] closedCentres, int[] traineesInTraining, int[] traineesWaiting) {
        try {
            bufferedWriter.write("Month," + month + ",\n");
            bufferedWriter.write("Centre,Training_Hub,Bootcamp,Tech_java,Tech_C#,T_Data,T_DevOps,T_Business\n");
            bufferedWriter.write("Full_Centres," + fullCentres[0] + "," + fullCentres[1] + "," +  fullCentres[2] + ","+ fullCentres[3] + "," +  fullCentres[4] + "," +  fullCentres[5] + "," +  fullCentres[6] + "," +"\n");
            bufferedWriter.write("Open_Centres," + openCentres[0] + "," + openCentres[1] + "," +  openCentres[2] + ","+ openCentres[3] + "," +  openCentres[4] + "," +  openCentres[5] + "," +  openCentres[6] + "," + "\n");
            bufferedWriter.write("Closed_Centres," + closedCentres[0] + "," + closedCentres[1] + "," +  closedCentres[2] + ","+ closedCentres[3] + "," +  closedCentres[4] + "," +  closedCentres[5] + "," +  closedCentres[6] + "," + "\n\n");
            bufferedWriter.write("Trainees,Java,C#,Data,DevOps,Business,\n");
            bufferedWriter.write("Trainees_Training," + traineesInTraining[0] + "," + traineesInTraining[1] + "," +  traineesInTraining[2] + ","+ traineesInTraining[3] + "," +  traineesInTraining[4] + "\n");
            bufferedWriter.write("Trainees_Waiting," + traineesWaiting[0] + "," + traineesWaiting[1] + "," +  traineesWaiting[2] + ","+ traineesWaiting[3] + "," +  traineesWaiting[4] + "\n\n");

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
