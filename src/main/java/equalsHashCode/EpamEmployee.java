package equalsHashCode;

/**
 * Created by Tetiana_Romaniv on 9/22/2016.
 */
public class EpamEmployee {

    private String name;
    private int age;
    private String education;
    private City city;


    public EpamEmployee(String name, int age, String education, City city) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EpamEmployee that = (EpamEmployee) o;

        if (age != that.age) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (education != null ? !education.equals(that.education) : that.education != null) return false;
        return city == that.city;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (education != null ? education.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }


}
