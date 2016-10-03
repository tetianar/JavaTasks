package dbTask13.db;
import dbTask13.service.TripsService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

/**
 * Created by Tetiana_Romaniv on 9/30/2016.
 */
public class App {
    public static void main( String[] args ) throws SQLException
    {
        TripsService service = TripsService.getInstance();
        System.out.println(service.addIncreaseValueToPrice(1000,200) );


    }
}