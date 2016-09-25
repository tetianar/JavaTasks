package NoteBook.Controller;

/**
 * Created by Tetiana_Romaniv on 9/22/2016.
 */
public interface RegularExpressions {
    String regExpName = "^[A-za-z0-9_-]{3,15}";
    String regExpComment = "[A-Za-z0-9 '.-_@!,;]+";
    String regExpGroups = "((work)|(home))";
    String regExpNumber = "\\d{3}-\\d{3}-\\d\\d-\\d\\d";
    String regExpEmail = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
    String regExpSkype = "[a-zA-Z][a-zA-Z0-9\\.,\\-_]{5,31}";
    String regExpIndex = "[A-Za-z0-9]{5}";
    String regExpCity = "[a-zA-z0-9- ._]+";
    String regExpStreet = "[a-zA-z-9 -._]+";
    String regExpBuilding = "[0-9a-z]+";
    String regExpApartment = "[0-9]+";
    String regExpData = "^(\\d{1,2})\\.(\\d{1,2})\\.(\\d{1,4})$";
}
