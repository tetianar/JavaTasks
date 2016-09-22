package GuessNumber;

import java.util.Scanner;

/**
 * Created by Tetiana_Romaniv on 9/15/2016.
 */
public class Controller {

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processGame(){
        Scanner sc = new Scanner(System.in);

        while (model.win == false) {
            model.guess(inputIntValueWithScanner(sc));
        }
        view.printMessage(view.YOU_WIN);
    }

    // The Utility methods
    public int inputIntValueWithScanner(Scanner sc) {
        int inputValue=0;
        view.printMessage(View.INPUT_INT_DATA +
                model.getMin() + View.HYPHEN + model.getMax());

        while( true ) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA
                        + View.INPUT_INT_DATA +
                        model.getMin() + View.HYPHEN + model.getMax());
                sc.next();
            }
            // check value in diapason
            if ((inputValue = sc.nextInt()) <= model.getMin() ||
                    inputValue >= model.getMax()) {
                view.printMessage(View.WRONG_RANGE_DATA
                        + View.INPUT_INT_DATA +
                        model.getMin() + View.HYPHEN + model.getMax());
                continue ;
            }
            break;
        }
        return inputValue;
    }

}

