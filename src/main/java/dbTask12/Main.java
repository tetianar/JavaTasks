package dbTask12;

import dbTask12.utilities.DataBase;

import java.sql.*;

import static dbTask12.utilities.DataBase.*;

/**
 * Created by Tetiana_Romaniv on 9/30/2016.
 */
public class Main {

    public static void main( String[] args ) throws SQLException {

        DataBase.getTableBuses();
        DataBase.getTableCities();
        DataBase.getTableSeats();
    }


}
