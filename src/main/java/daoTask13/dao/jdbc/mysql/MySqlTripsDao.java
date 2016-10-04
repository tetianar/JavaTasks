package daoTask13.dao.jdbc.mysql;

import daoTask13.dao.TripsDao;
import daoTask13.entities.Trips;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tetiana_Romaniv on 10/3/2016.
 */
public class MySqlTripsDao implements TripsDao {
    private static final String SELECT_TRIPS_BY_PRICE = "SELECT * FROM trips WHERE price=?";
    private static final String SELECT_TRIPS_BY_ID = "SELECT * FROM trips WHERE id =?";
    private static final String SELECT_TRIPS_ALL_DATA = "SELECT * FROM trips";
    private static final String UPDATE_TRIPS = "UPDATE trips SET date_depart=?, date_dest=?,price = ?,route_id=?, buses_id=? WHERE id =?";
    private static final String INSERT_TRIPS = "INSERT trips (date_depart,date_dest,price,route_id,buses_id) VALUES(?,?,?,?,?)";
    private static final String DELETE_TRIP = "DELETE FROM trips WHERE id=?";

    @Override
    public Trips find(int id){
        Trips result = null;
        Connection connection = MySqlJdbcDaoFactory.getConnection();
        try (PreparedStatement query = connection
                .prepareStatement(SELECT_TRIPS_BY_ID)) {
            query.setInt(1, id);
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                result = getTripsFromResultSet(rs);
            }
        } catch (Exception ex) {
            //log
            throw new RuntimeException(ex);
        }
        return result;
    }

    @Override
    public List<Trips> findAll() {
        List<Trips> result = new ArrayList<>();
        Connection connection = MySqlJdbcDaoFactory.getConnection();
        try (PreparedStatement query = connection
                .prepareStatement(SELECT_TRIPS_ALL_DATA)) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Trips trips = getTripsFromResultSet(rs);
                result.add(trips);
            }
        } catch (Exception ex) {
            //log
            throw new RuntimeException(ex);
        }
        return result;
    }

    @Override
    public void update(Trips trip) {
        Connection connection = MySqlJdbcDaoFactory.getConnection();
        try (PreparedStatement query = connection
                .prepareStatement(UPDATE_TRIPS)) {

            query.setDate(1,(java.sql.Date) trip.getDateDepart());
            query.setDate(2,(java.sql.Date) trip.getDateDest());
            query.setDouble(3,trip.getPrice());
            query.setInt(4,trip.getRouteID());
            query.setInt(5,trip.getBusesID());
            query.setInt(6,trip.getId());

            query.executeUpdate();

        } catch (Exception ex) {
            //log
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void delete(int id) {
        Connection connection = MySqlJdbcDaoFactory.getConnection();
        try (PreparedStatement query = connection
                .prepareStatement(DELETE_TRIP)) {
            query.setInt(1, id);
            query.executeUpdate();

        } catch (Exception ex) {
            //log
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void insert(Trips tripForInsert) {
        Connection connection = MySqlJdbcDaoFactory.getConnection();
        try (PreparedStatement query = connection
                .prepareStatement(INSERT_TRIPS)) {

            query.setDate(1, (java.sql.Date) tripForInsert.getDateDepart());
            query.setDate(2, (java.sql.Date) tripForInsert.getDateDest());
            query.setDouble(3,tripForInsert.getPrice());
            query.setInt(4,tripForInsert.getRouteID());
            query.setInt(5,tripForInsert.getBusesID());

            query.executeUpdate();

        } catch (Exception ex) {
            //log
            throw new RuntimeException(ex);
        }

    }

    private Trips getTripsFromResultSet(ResultSet resultSet)
            throws SQLException {
        Trips trips = new Trips();
        trips.setId(resultSet.getInt("id"));
        trips.setDateDepart(resultSet.getDate("date_dest"));
        trips.setDateDest(resultSet.getDate("date_dest"));
        trips.setPrice(resultSet.getDouble("price"));
        trips.setBusesID(resultSet.getInt("buses_id"));
        trips.setRouteID(resultSet.getInt("route_id"));
        return trips;

    }

    public List<Trips> findByPrice(double price) {
        List<Trips> result = new ArrayList<>();
        Connection connection = MySqlJdbcDaoFactory.getConnection();
        try (PreparedStatement query = connection
                .prepareStatement(SELECT_TRIPS_BY_PRICE)) {
            query.setDouble(1, price);
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Trips trips = getTripsFromResultSet(rs);
                result.add(trips);
            }
        } catch (Exception ex) {
            //log
            throw new RuntimeException(ex);
        }
        return result;
    }
}



