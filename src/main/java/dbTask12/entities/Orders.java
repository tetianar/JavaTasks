package dbTask12.entities;

import java.util.Date;

/**
 * Created by Tetiana_Romaniv on 9/30/2016.
 */
public class Orders {
    private int id;
    private Date dateTime;
    private String orderNumber;
    private int seat;

    public Orders(int id, Date dateTime, String orderNumber, int seat) {
        this.id = id;
        this.dateTime = dateTime;
        this.orderNumber = orderNumber;
        this.seat = seat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", dateTime='" + dateTime + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", seat=" + seat +
                '}';
    }
}
