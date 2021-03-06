package dbTask12.entities;

/**
 * Created by Tetiana_Romaniv on 9/30/2016.
 */
public class Seats {
    private int id;
    private boolean status;
    private boolean nearAWindow;
    private int seatNumber;
    private int busesID;

    public Seats(int id, boolean status, boolean nearAWindow, int seatNumber, int busesID) {
        this.id = id;
        this.status = status;
        this.nearAWindow = nearAWindow;
        this.seatNumber = seatNumber;
        this.busesID = busesID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isNearAWindow() {
        return nearAWindow;
    }

    public void setNearAWindow(boolean nearAWindow) {
        this.nearAWindow = nearAWindow;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getBusesID() {
        return busesID;
    }

    public void setBusesID(int busesID) {
        this.busesID = busesID;
    }

    @Override
    public String toString() {
        return "Seats{" +
                "id=" + id +
                ", status=" + status +
                ", nearAWindow=" + nearAWindow +
                ", seatNumber=" + seatNumber +
                ", busesID=" + busesID +
                '}';
    }
}