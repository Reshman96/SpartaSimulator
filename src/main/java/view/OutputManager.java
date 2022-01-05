package view;

public class OutputManager {

    public static void outputFirstMonth(int month, int fullCentres, int openCentres, int currentTrainees, int waitingListSize){
        FileOutputManager.openCSVFile();
        FileOutputManager.writeDetailsToFile(month, fullCentres, openCentres, currentTrainees, waitingListSize);
    }

    public static void outputMonth(int month, int fullCentres, int openCentres, int currentTrainees, int waitingListSize){
        FileOutputManager.writeDetailsToFile(month, fullCentres, openCentres, currentTrainees, waitingListSize);
    }

    public static void outputFinalMonth(int month, int fullCentres, int openCentres, int currentTrainees, int waitingListSize){
        OutputPrinter.printMonthlyData(month, fullCentres, openCentres, currentTrainees, waitingListSize);
        FileOutputManager.writeDetailsToFile(month, fullCentres, openCentres, currentTrainees, waitingListSize);
        FileOutputManager.closeCSVFile();
    }
}
