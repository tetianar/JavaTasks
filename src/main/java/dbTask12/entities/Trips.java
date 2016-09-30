package dbTask12.entities;

/**
 * Created by Tetiana_Romaniv on 9/30/2016.
 */
public class Trips {
    private int id;
    private boolean status;
    private String dateDepart;
    private String dateDest;
    private int routeID;
    private int busesID;

    public Trips(int id, boolean status, String dateDepart, String dateDest, int routeID, int busesID) {
        this.id = id;
        this.status = status;
        this.dateDepart = dateDepart;
        this.dateDest = dateDest;
        this.routeID = routeID;
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

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getDateDest() {
        return dateDest;
    }

    public void setDateDest(String dateDest) {
        this.dateDest = dateDest;
    }

    public int getRouteID() {
        return routeID;
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    public int getBusesID() {
        return busesID;
    }

    public void setBusesID(int busesID) {
        this.busesID = busesID;
    }

    @Override
    public String toString() {
        return "Trips{" +
                "id=" + id +
                ", status=" + status +
                ", dateDepart='" + dateDepart + '\'' +
                ", dateDest='" + dateDest + '\'' +
                ", routeID=" + routeID +
                ", busesID=" + busesID +
                '}';
    }
}
