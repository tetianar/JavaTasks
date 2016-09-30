package dbTask12.entities;

/**
 * Created by Tetiana_Romaniv on 9/30/2016.
 */
public class Routes {
    private int id;
    private String routeName;
    private int destCity;
    private int departCity;

    public Routes(int id, String routeName, int destCity, int departCity) {
        this.id = id;
        this.routeName = routeName;
        this.destCity = destCity;
        this.departCity = departCity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public int getDestCity() {
        return destCity;
    }

    public void setDestCity(int destCity) {
        this.destCity = destCity;
    }

    public int getDepartCity() {
        return departCity;
    }

    public void setDepartCity(int departCity) {
        this.departCity = departCity;
    }

    @Override
    public String toString() {
        return "Routes{" +
                "id=" + id +
                ", routeName='" + routeName + '\'' +
                ", destCity=" + destCity +
                ", departCity=" + departCity +
                '}';
    }
}
