import controller.SpartaSimulator;
import view.InputHandler;
import view.OutputManager;

public class Main {

    public static void main(String[] args) {
        InputHandler.setStartingParameters();

        SpartaSimulator spartaSimulator = new SpartaSimulator();
        spartaSimulator.simulator();


    }
}
