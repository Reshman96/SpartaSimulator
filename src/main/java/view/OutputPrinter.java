package view;

public final class OutputPrinter {
    public static void printMonthNumber(int currentMonth) {
        System.out.println("Current month: " + currentMonth);
    }
    public static void printFullCentres(int fullCentres) {
        System.out.println("Number of full centres: " + fullCentres);
    }

    public static void printOpenCentres(int openCentres) {
        System.out.println("Number of open centres: " + openCentres);
    }

    public static void printCurrentTrainees(int currentTrainees) {
        System.out.println("Number of current trainees being trained: " + currentTrainees);
    }

    public static void printWaitingList(int waitingListSize) {
        System.out.println("Number of trainees on the waiting list: " + waitingListSize);
    }

    public static void printMonthlyData(int currentMonth, int fullCentres, int openCentres, int currentTrainees, int waitingListSize) {
        printMonthNumber(currentMonth);
        printFullCentres(fullCentres);
        printOpenCentres(openCentres);
        printCurrentTrainees(currentTrainees);
        printWaitingList(waitingListSize);
        System.out.println("");
    }
}