package view;

public final class OutputPrinter {
    private static void printMonthNumber(int currentMonth) {
        System.out.println("Total number of months: " + currentMonth);
    }
    private static void printFullCentres(int fullCentres) {
        System.out.println("Number of full centres: " + fullCentres);
        System.out.println("Training hubs: ");
        System.out.println("Bootcamps: ");
        System.out.println("Java Tech Centres: ");
        System.out.println("C# Tech Centres: ");
        System.out.println("Data Tech Centres: ");
        System.out.println("DevOps Tech Centres: ");
        System.out.println("Business Tech Centres: ");
    }

    private static void printOpenCentres(int openCentres) {
        System.out.println("Number of open centres: " + openCentres);
        System.out.println("Training hubs: ");
        System.out.println("Bootcamps: ");
        System.out.println("Java Tech Centres: ");
        System.out.println("C# Tech Centres: ");
        System.out.println("Data Tech Centres: ");
        System.out.println("DevOps Tech Centres: ");
        System.out.println("Business Tech Centres: ");
    }

    private static void printClosedCentres(int closedCentres){
        System.out.println("Number of open centres: " + closedCentres);
        System.out.println("Training hubs: ");
        System.out.println("Bootcamps: ");
        System.out.println("Java Tech Centres: ");
        System.out.println("C# Tech Centres: ");
        System.out.println("Data Tech Centres: ");
        System.out.println("DevOps Tech Centres: ");
        System.out.println("Business Tech Centres: ");
    }

    private static void printCurrentTrainees(int currentTrainees) {
        System.out.println("Number of current trainees being trained: " + currentTrainees);
        System.out.println("Java Trainees: ");
        System.out.println("C# Trainees: ");
        System.out.println("Data Trainees: ");
        System.out.println("DevOps Trainees: ");
        System.out.println("Business Trainees: ");
    }

    private static void printWaitingList(int waitingListSize) {
        System.out.println("Number of trainees on the waiting list: " + waitingListSize);
        System.out.println("Java Trainees: ");
        System.out.println("C# Trainees: ");
        System.out.println("Data Trainees: ");
        System.out.println("DevOps Trainees: ");
        System.out.println("Business Trainees: ");
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