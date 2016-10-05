package fileFormats.json;

/**
 * Created by Tetiana_Romaniv on 10/4/2016.
 */
public class Cities {
    private int id;
    private String name;

    public Cities(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Cities() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
