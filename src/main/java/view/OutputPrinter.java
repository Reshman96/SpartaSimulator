package view;

public final class OutputPrinter {
    private static void printMonthNumber(int currentMonth) {
        System.out.println("Total number of months: " + currentMonth);
    }
    private static void printFullCentres(int fullCentres) {
        System.out.println("Number of full centres: " + fullCentres);
    }

    private static void printOpenCentres(int openCentres) {
        System.out.println("Number of open centres: " + openCentres);
    }

    private static void printCurrentTrainees(int currentTrainees) {
        System.out.println("Number of current trainees being trained: " + currentTrainees);
    }

    private static void printWaitingList(int waitingListSize) {
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