import view.InputHandler;
import view.OutputManager;

public class Main {

    public static void main(String[] args) {
        InputHandler.setStartingParameters();

        int months = InputHandler.getMonthsOfSimulation();
        // The code below is hardcoded temporary data that needs to be replaced by Model/Controller
        int[] fullCentres = {1, 2, 3, 4, 5, 6, 7};
        int[] openCentres = {1, 2, 3, 4, 5, 6, 7};
        int[] closedCentres = {1, 2, 3, 4, 5, 6, 7};
        int[] currentTrainees = {1, 2, 3, 4, 5};
        int[] waitingListSize = {1, 2, 3, 4, 5};

        OutputManager.outputData(months, fullCentres, openCentres, closedCentres, currentTrainees, waitingListSize);
    }
}
