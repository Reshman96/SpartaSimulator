package view;

import java.util.Arrays;

public final class OutputPrinter {
    private static void printMonthNumber(int currentMonth) {
        System.out.println("Total number of months: " + currentMonth);
    }
    private static void printFullCentres(int[] fullCentres) {
        System.out.println("Number of full centres: " + Arrays.stream(fullCentres).sum());
        System.out.println("Training hubs: " + fullCentres[0]);
        System.out.println("Bootcamps: " + fullCentres[1]);
        System.out.println("Java Tech Centres: " + fullCentres[2]);
        System.out.println("C# Tech Centres: " + fullCentres[3]);
        System.out.println("Data Tech Centres: " + fullCentres[4]);
        System.out.println("DevOps Tech Centres: " + fullCentres[5]);
        System.out.println("Business Tech Centres: " + fullCentres[6]);
    }

    private static void printOpenCentres(int[] openCentres) {
        System.out.println("Number of open centres: " + Arrays.stream(openCentres).sum());
        System.out.println("Training hubs: " + openCentres[0]);
        System.out.println("Bootcamps: " + openCentres[1]);
        System.out.println("Java Tech Centres: " + openCentres[2]);
        System.out.println("C# Tech Centres: " + openCentres[3]);
        System.out.println("Data Tech Centres: " + openCentres[4]);
        System.out.println("DevOps Tech Centres: " + openCentres[5]);
        System.out.println("Business Tech Centres: " + openCentres[6]);
    }

    private static void printClosedCentres(int[] closedCentres){
        System.out.println("Number of open centres: " + Arrays.stream(closedCentres).sum());
        System.out.println("Training hubs: " + closedCentres[0]);
        System.out.println("Bootcamps: " + closedCentres[1]);
        System.out.println("Java Tech Centres: " + closedCentres[2]);
        System.out.println("C# Tech Centres: " + closedCentres[3]);
        System.out.println("Data Tech Centres: " + closedCentres[4]);
        System.out.println("DevOps Tech Centres: " + closedCentres[5]);
        System.out.println("Business Tech Centres: " + closedCentres[6]);
    }

    private static void printCurrentTrainees(int[] currentTrainees) {
        System.out.println("Number of current trainees being trained: " + Arrays.stream(currentTrainees).sum());
        System.out.println("Java Trainees: " + currentTrainees[0]);
        System.out.println("C# Trainees: " + currentTrainees[1]);
        System.out.println("Data Trainees: " + currentTrainees[2]);
        System.out.println("DevOps Trainees: " + currentTrainees[3]);
        System.out.println("Business Trainees: " + currentTrainees[4]);
    }

    private static void printWaitingList(int[] waitingList) {
        System.out.println("Number of trainees on the waiting list: " + Arrays.stream(waitingList).sum());
        System.out.println("Java Trainees: " + waitingList[0]);
        System.out.println("C# Trainees: " + waitingList[1]);
        System.out.println("Data Trainees: " + waitingList[2]);
        System.out.println("DevOps Trainees: " + waitingList[3]);
        System.out.println("Business Trainees: " + waitingList[4]);
    }

    public static void printMonthlyData(int currentMonth, int[] fullCentres, int[] openCentres, int[] closedCentres, int[] currentTrainees, int[] waitingList) {
        printMonthNumber(currentMonth);
        printFullCentres(fullCentres);
        printOpenCentres(openCentres);
        printClosedCentres(closedCentres);
        printCurrentTrainees(currentTrainees);
        printWaitingList(waitingList);
        System.out.println("");
    }
}