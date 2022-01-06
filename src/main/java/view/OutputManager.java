package view;

public class OutputManager {

    public static void setupCSV(){
        FileOutputManager.openCSVFile();
    }
    public static void outputMonth(int month, int fullCentres, int openCentres, int currentTrainees, int waitingListSize){
        FileOutputManager.writeDetailsToFile(month, fullCentres, openCentres, currentTrainees, waitingListSize);
    }

    public static void finishOutput(){
        FileOutputManager.closeCSVFile();
    }

    public static void outputData(int month, int fullCentres, int openCentres, int currentTrainees, int waitingListSize){

        if((month==1 && InputHandler.getDisplayEveryMonth()) || !InputHandler.getDisplayEveryMonth()) setupCSV();

        OutputPrinter.printMonthlyData(month, fullCentres, openCentres, currentTrainees, waitingListSize);
        outputMonth(month, fullCentres, openCentres, currentTrainees, waitingListSize);

        if(month==InputHandler.getMonthsOfSimulation()) finishOutput();

    }

}
