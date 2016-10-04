package daoTask13.dao.jdbc.mysql;

import daoTask13.dao.*;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Created by Tetiana_Romaniv on 10/3/2016.
 */
public class MySqlJdbcDaoFactory extends DaoFactory{
    private static final String DB_CONFIG_FILE_NAME = "db.properties";
    private static final String DB_USER = "db.user";
    private static final String DB_PASS = "db.pass";
    private static final String DB_URL = "db.url";
    private static Connection connection;

    static Connection getConnection() {
        try {
            if (connection == null) {
                InputStream in = MySqlJdbcDaoFactory.class.getResourceAsStream(DB_CONFIG_FILE_NAME);
                Properties prop = new Properties();
                prop.load(in);
                connection = DriverManager.getConnection(
                        prop.getProperty(DB_URL),
                        prop.getProperty(DB_USER),
                        prop.getProperty(DB_PASS));
            }
            return connection;
        } catch (Exception ex) {
            //add logging
            throw new RuntimeException(ex);
        }
    }


    @Override
    public BusesDao createBusesDao() {
        return new MySqlBusesDao();
    }

    @Override
    public CitiesDao createCitiesDao() {
        return (CitiesDao) new MySqlCitiesDao();
    }

    @Override
    public OrdersDao createOrdersDao() {
        return null;
    }

    @Override
    public TripsDao createTripsDao() {
        return (TripsDao) new MySqlTripsDao();
    }

    @Override
    public RoutesDao createRoutes() {
        return (RoutesDao) new MySqlRoutesDao();
    }

    @Override
    public SeatsDao createSeats() {
        return (SeatsDao) new MySqlSeatsDao();
    }

    @Override
    public TravelersDao createTravelers() {
        return (TravelersDao) new MySqlTravelersDao();
    }
}
