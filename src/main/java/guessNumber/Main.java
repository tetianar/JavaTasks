package guessNumber;

/**
 * Created by Tetiana_Romaniv on 9/15/2016.
 */
public class Main {

    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processGame();
    }

}
