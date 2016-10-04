package daoTask13.dao;

/**
 * Created by Tetiana_Romaniv on 10/3/2016.
 */
public abstract class DaoFactory {
    public abstract BusesDao createBusesDao();

    public abstract CitiesDao createCitiesDao();

    public abstract OrdersDao createOrdersDao();
    public abstract TripsDao createTripsDao();
    public abstract RoutesDao createRoutes();
    public abstract SeatsDao createSeats();
    public abstract TravelersDao createTravelers();

    public static DaoFactory getInstance() {
        String factoryClassName = "daoTask13.dao.jdbc.mysql.MySqlJdbcDaoFactory";
        try {
            return (DaoFactory) Class.forName(factoryClassName).newInstance();
        } catch (Exception ex) {
            //log
            throw new RuntimeException(ex);
        }
    }
}

