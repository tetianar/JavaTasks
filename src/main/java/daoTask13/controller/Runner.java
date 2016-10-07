package daoTask13.controller;

import daoTask13.entities.Trips;
import daoTask13.TripsService;

import java.util.List;

/**
 * Created by Tetiana_Romaniv on 10/7/2016.
 */
public class Runner {
    TripsService service = TripsService.getInstance();
    public static void main( String[] args ) throws IllegalAccessException {
        new Runner().doServiceIcreaceCall("1000","100");
    }

    public void doServiceIcreaceCall(String price, String increaseValue) throws IllegalAccessException {
        int priceVal = Integer.parseInt(price);
        int increaseVal = Integer.parseInt(increaseValue);
        if (increaseVal<0)
            throw new IllegalAccessException();
        List<Trips> trips = service.addIncreaseValueToPrice(priceVal,increaseVal);
        System.out.println(trips);
    }
}
