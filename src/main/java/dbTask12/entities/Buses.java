package dbTask12.entities;

import java.io.Serializable;

/**
 * Created by Tetiana_Romaniv on 9/30/2016.
 */
public class Buses implements Serializable {
    private int id;
    private int numberOfSeats;
    private boolean hasAirCond;
    private String model;
    private int year;

    public Buses(int id, int numberOfSeats, boolean hasAirCond, String model, int year) {
        this.id = id;
        this.numberOfSeats = numberOfSeats;
        this.hasAirCond = hasAirCond;
        this.model = model;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isHasAirCond() {
        return hasAirCond;
    }

    public void setHasAirCond(boolean hasAirCond) {
        this.hasAirCond = hasAirCond;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Buses{" +
                "id=" + id +
                ", numberOfSeats=" + numberOfSeats +
                ", hasAirCond=" + hasAirCond +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
