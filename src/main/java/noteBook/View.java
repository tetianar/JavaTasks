package noteBook;

import noteBook.model.entity.NoteBookItem;

/**
 * Created by Tetiana_Romaniv on 9/22/2016.
 */
public class View {
    // Text's constants
    public static final String INPUT_NAME = "Input name.  ";
    public static final String INPUT_SURNAME = "Input surname.  ";
    public static final String INPUT_PATRONYMIC = "Input patronymic.  ";
    public static final String INPUT_NICKNAME = "Input nickname.  ";
    public static final String INPUT_COMMENT = "Input comment.  ";
    public static final String INPUT_GROUP = "Input group. HOME or WORK ";
    public static final String INPUT_HOME_PHONE_NUMBER = "Input home phone number in format xxx-xxx-xx-xx. ";
    public static final String INPUT_MOBILE_PHONE_NUMBER = "Input mobile phone number in format xxx-xxx-xx-xx.  ";
    public static final String INPUT_MOBILE_PHONE_NUMBER2 = "Input mobile phone number in format xxx-xxx-xx-xx.  ";
    public static final String INPUT_EMAIL = "Input email.  ";
    public static final String INPUT_SKYPE = "Input skype.  ";
    public static final String INPUT_INDEX = "Input index. Should be 5 symbols.  ";
    public static final String INPUT_CITY = "Input city. ";
    public static final String INPUT_STREET = "Input street. ";
    public static final String INPUT_BUILDING = "Input building. ";
    public static final String INPUT_APARTMENT = "Input apartment. ";
    public static final String INPUT_CREATE_DATE = "Input date of creation in format xx.xx,xxxx.  ";
    public static final String INPUT_MODIFY_DATE = "Input date of modification in format xx.xx,xxxx.  ";

    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";

    /**
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printNoteBookItem(NoteBookItem noteBookItem) {
        System.out.println(noteBookItem.toString());
    }

}

