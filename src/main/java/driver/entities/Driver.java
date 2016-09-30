package driver.entities;

/**
 * Created by romas on 23.09.2016.
 */
public class Driver {
    private Human human;
    private DriverLicense driverLicense;

    public Driver() {
    }

    public Driver(Human human, DriverLicense driverLicense) {
        this.human = human;
        this.driverLicense = driverLicense;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }

    @Override
    public String toString() {
        return "driver{" +
                "human=" + human +
                ", driverLicense=" + driverLicense +
                '}';
    }
}
