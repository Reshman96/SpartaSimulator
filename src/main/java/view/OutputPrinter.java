package view;

public class OutputPrinter {
    public void printMonthNumber(int currentMonth) {
        System.out.println("Current month: " + currentMonth);
    }
    public void printFullCentres(int fullCentres) {
        System.out.println("Number of full centres: " + fullCentres);
    }

    public void printOpenCentres(int openCentres) {
        System.out.println("Number of open centres: " + openCentres);
    }

    public void printCurrentTrainees(int currentTrainees) {
        System.out.println("Number of current trainees being trained: " + currentTrainees);
    }

    public void printWaitingList(int waitingListSize) {
        System.out.println("Number of trainees on the waiting list: " + waitingListSize);
    }

    public void printMonthlyData(int currentMonth, int fullCentres, int openCentres, int currentTrainees, int waitingListSize) {
        printMonthNumber(currentMonth);
        printFullCentres(fullCentres);
        printOpenCentres(openCentres);
        printCurrentTrainees(currentTrainees);
        printWaitingList(waitingListSize);
        System.out.println("");
    }
}
