package daoTask13.entities;

import java.util.Date;

/**
 * Created by Tetiana_Romaniv on 10/3/2016.
 */
public class Trips {
    private int id;
    private Date dateDepart;
    private Date dateDest;
    private Double price;
    private int routeID;
    private int busesID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateDest() {
        return dateDest;
    }

    public void setDateDest(Date dateDest) {
        this.dateDest = dateDest;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
                ", dateDepart=" + dateDepart +
                ", dateDest=" + dateDest +
                ", price=" + price +
                ", routeID=" + routeID +
                ", busesID=" + busesID +
                '}';
    }
}
