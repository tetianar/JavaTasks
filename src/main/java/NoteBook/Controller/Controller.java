package NoteBook.Controller;
import NoteBook.Model.Entity.NoteBookItem;
import NoteBook.Model.Model;
import NoteBook.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static NoteBook.Controller.RegularExpressions.*;

/**
 * Created by Tetiana_Romaniv on 9/22/2016.
 */


public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputRegForm inputRegForm = new InputRegForm();
        inputRegForm.setName(inputIntValueWithScanner(sc,view.INPUT_NAME, regExpName));
        inputRegForm.setSurname(inputIntValueWithScanner(sc,view.INPUT_SURNAME, regExpName));
        inputRegForm.setPatronymic(inputIntValueWithScanner(sc,view.INPUT_PATRONYMIC, regExpName));
        inputRegForm.setIndex(inputIntValueWithScanner(sc,view.INPUT_INDEX, regExpIndex));
        inputRegForm.setCity(inputIntValueWithScanner(sc,view.INPUT_CITY, regExpCity));
        inputRegForm.setStreet(inputIntValueWithScanner(sc,view.INPUT_STREET, regExpStreet));
        inputRegForm.setBuilding(inputIntValueWithScanner(sc,view.INPUT_BUILDING, regExpBuilding));
        inputRegForm.setApartment(inputIntValueWithScanner(sc,view.INPUT_APARTMENT, regExpApartment));

        NoteBookItem noteBookItem = new NoteBookItem();
        model.addItem();
    }



    public String inputIntValueWithScanner(Scanner sc, String message, String regExp) {
        String inputValue = "";
        Pattern p = Pattern.compile(regExp);

        boolean match = false;
        while( !match ) {
            view.printMessage(message);
            inputValue = sc.nextLine();
            Matcher m = p.matcher(inputValue);
            if (m.matches()){
                match = true;
            }
            else {
                view.printMessage(view.WRONG_INPUT_DATA);
            }
        }
        return inputValue;

    }




}
