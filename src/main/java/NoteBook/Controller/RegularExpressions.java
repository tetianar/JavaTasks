package NoteBook.Controller;

/**
 * Created by Tetiana_Romaniv on 9/22/2016.
 */
public interface RegularExpressions {
    String regExpName = "[A-Za-z]+";
    String regExpNickname = "[A-Za-z0-9_]{3,15}+$";
    String regExpComment = "[A-Za-z0-9.,-()/*+]";
    String regExpGroups = "[PG1|PG2|PG3]";
    String regExpHomeNumber = "\\d{3}-\\d{3}-\\d\\d-\\d\\d";
    String regExpMobileNumber  = "\\d{3}-\\d{3}-\\d\\d-\\d\\d";
    String regExpMobileNumber2 = "\\d{3}-\\d{3}-\\d\\d-\\d\\d";
    String regExpEmail = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
    String regExpSkype = "[a-zA-Z][a-zA-Z0-9\\.,\\-_]{5,31}";
    String regExpIndex = "[0-9]{5}";
    String regExpCity = "[a-zA-z]+";
    String regExpStreet = "[a-zA-z]+";
    String regExpBuilding = "[0-9a-z]+";
    String regExpApartment = "[0-9]+";
    String regExpCreateData = "^(\\d{1,2})\\.(\\d{1,2})\\.(\\d{1,4})$";
    String regExpModifyData = "^(\\d{1,2})\\.(\\d{1,2})\\.(\\d{1,4})$";

}
