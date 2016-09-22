package NoteBook.Model.Entity;

/**
 * Created by Tetiana_Romaniv on 9/22/2016.
 */
public class Name {
    private String name;
    private String surname;
    private String patronymic;

    public Name(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;

    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
