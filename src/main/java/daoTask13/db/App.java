package daoTask13.db;
import daoTask13.entities.Trips;
import daoTask13.service.TripsService;


import java.sql.*;


import static java.sql.DriverManager.getConnection;

/**
 * Created by Tetiana_Romaniv on 9/30/2016.
 */
public class App {
    public static void main( String[] args ) throws SQLException
    {

        TripsService service = TripsService.getInstance();

        //Increase price of trip on an increaseValue
        System.out.println(service.addIncreaseValueToPrice(1000,200) );

        //Find trips by price
        System.out.println(service.findByPrice(1000));

        //Find trip by Id
        System.out.println(service.findById(2));

        //Show all data from trip table
        System.out.println(service.findAll());

        //Update data
        Trips trip = new Trips();
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        trip.setBusesID(1);
        trip.setRouteID(1);
        trip.setDateDest(sqlDate);
        trip.setDateDepart(sqlDate);
        trip.setPrice(2000.10);
        trip.setId(1);
        service.update(trip);
        System.out.println(service.findById(1));

        //Insert data
        Trips tripForInsert = new Trips();
        java.util.Date insertDate = new java.util.Date();
        java.sql.Date sqlInsertDate = new java.sql.Date(insertDate.getTime());
        tripForInsert.setBusesID(3);
        tripForInsert.setRouteID(2);
        tripForInsert.setDateDest(sqlInsertDate);
        tripForInsert.setDateDepart(sqlInsertDate);
        tripForInsert.setPrice(2550.10);
        service.insert(tripForInsert);
        System.out.println(service.findByPrice(2550.10));

        //Delete by id
        service.deleteById(6);
        System.out.println(service.findById(6));
    }
}