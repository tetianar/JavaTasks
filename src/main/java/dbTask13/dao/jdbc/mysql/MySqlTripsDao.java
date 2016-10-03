package dbTask13.dao.jdbc.mysql;

import dbTask13.dao.GenericDao;
import dbTask13.entities.Trips;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tetiana_Romaniv on 10/3/2016.
 */
public class MySqlTripsDao implements GenericDao<Trips> {
    private static final String SELECT_TRIPS_BY_PRICE = "SELECT * FROM trips WHERE =?";
    @Override
    public Trips find(int id) {
        return null;
    }

    @Override
    public List<Trips> findAll() {
        return null;
    }

    @Override
    public void update(Trips entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void insert(Trips entity) {

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

    public List<Trips> findByPrice(int price) {
        List<Trips> result = new ArrayList<>();
        Connection connection = MySqlJdbcDaoFactory.getConnection();
        try (PreparedStatement query = connection
                .prepareStatement(SELECT_TRIPS_BY_PRICE)) {
            query.setInt(1, price);
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



