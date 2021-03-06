package noteBook.controller;
import noteBook.model.entity.NoteBookItem;
import noteBook.model.Model;
import noteBook.View;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static noteBook.controller.RegularExpressions.*;

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
        inputRegForm.setComment(inputIntValueWithScanner(sc,view.INPUT_COMMENT, regExpComment));
        inputRegForm.setNickname(inputIntValueWithScanner(sc,view.INPUT_NICKNAME, regExpName));
        inputRegForm.setGroup(inputIntValueWithScanner(sc,view.INPUT_GROUP, regExpGroups));
        inputRegForm.setHomePhoneNumber(inputIntValueWithScanner(sc,view.INPUT_HOME_PHONE_NUMBER, regExpPhoneNumber));
        inputRegForm.setMobilePhoneNumber(inputIntValueWithScanner(sc,view.INPUT_MOBILE_PHONE_NUMBER, regExpPhoneNumber));
        inputRegForm.setMobilePhoneNumber2(inputIntValueWithScanner(sc,view.INPUT_MOBILE_PHONE_NUMBER2, regExpPhoneNumber));
        inputRegForm.setEmail(inputIntValueWithScanner(sc,view.INPUT_EMAIL, regExpEmail));
        inputRegForm.setSkype(inputIntValueWithScanner(sc,view.INPUT_SKYPE, regExpSkype));
        inputRegForm.setCreateData(inputIntValueWithScanner(sc,view.INPUT_CREATE_DATE, regExpData));
        inputRegForm.setModifyData(inputIntValueWithScanner(sc,view.INPUT_MODIFY_DATE, regExpData));


        NoteBookItem noteBookItem = new NoteBookItem();
        model.addItem();

        view.printNoteBookItem(noteBookItem);
    }



    public String inputIntValueWithScanner(Scanner sc, String message, String regExp) {
        boolean match = false;
        String inputValue = "";
        Pattern p = Pattern.compile(regExp);

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
