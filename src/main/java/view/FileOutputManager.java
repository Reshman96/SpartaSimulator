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
            bufferedWriter.write("Open_Centres," + openCentres[8] + "," + openCentres[9] + "," +  openCentres[10] + ","+ openCentres[11] + "," +  openCentres[12] + "," +  openCentres[13] + "," +  openCentres[14] + "," + "\n");
            bufferedWriter.write("Closed_Centres," + closedCentres[15] + "," + closedCentres[16] + "," +  closedCentres[17] + ","+ closedCentres[18] + "," +  closedCentres[19] + "," +  closedCentres[20] + "," +  closedCentres[6] + "," + "\n\n");
            bufferedWriter.write("Trainees,Java,C#,Data,DevOps,Business,\n");
            bufferedWriter.write("Trainees_Training," + traineesInTraining[7] + "," + traineesInTraining[8] + "," +  traineesInTraining[9] + ","+ traineesInTraining[10] + "," +  traineesInTraining[11] + "\n");
            bufferedWriter.write("Trainees_Waiting," + traineesWaiting[7] + "," + traineesWaiting[8] + "," +  traineesWaiting[9] + ","+ traineesWaiting[10] + "," +  traineesWaiting[11] + "\n\n");

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
