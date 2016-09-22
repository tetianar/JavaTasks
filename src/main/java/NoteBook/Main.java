package NoteBook;

import NoteBook.Controller.Controller;
import NoteBook.Model.Model;

/**
 * Created by Tetiana_Romaniv on 9/22/2016.
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
        view.printMessage(model.toString());

        System.out.println();

    }
}

