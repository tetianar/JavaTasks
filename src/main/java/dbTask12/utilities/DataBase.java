package dbTask12.utilities;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import dbTask12.entities.*;

import static java.sql.DriverManager.getConnection;

/**
 * Created by Tetiana_Romaniv on 9/30/2016.
 */
public class DataBase {

    static List<Cities> citiesList = new ArrayList<>();
    static List<Buses> busesList = new ArrayList<>();
    static List<Seats> seatsList = new ArrayList<>();
    static List<Routes> routesList = new ArrayList<>();
    static List<Trips> tripsList = new ArrayList<>();
    static List<Orders> ordersList = new ArrayList<>();
    static List<Travelers> travelersList = new ArrayList<>();

    public static List getTableCities() throws SQLException {
        Connection connection = getConnection("jdbc:mysql://localhost:3306/bus_booking?useSSL=false", "root", "Kondratyka3");
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM cities")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Cities cities = new Cities(rs.getInt("id"), rs.getString("name"));
                citiesList.add(cities);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return citiesList;
    }


    public static List getTableBuses() throws SQLException {
        Connection connection = getConnection("jdbc:mysql://localhost:3306/bus_booking?useSSL=false", "root", "Kondratyka3");
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM buses")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Buses buses = new Buses(rs.getInt("id"), rs.getInt("number_of_seats"),
                        rs.getBoolean("has_air_cond"), rs.getString("model"), rs.getInt("year"));
                busesList.add(buses);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return busesList;

    }

    public static List getTableSeats() throws SQLException {
        Connection connection = getConnection("jdbc:mysql://localhost:3306/bus_booking?useSSL=false", "root", "Kondratyka3");
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM seats")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Seats seats = new Seats(rs.getInt("id"), rs.getBoolean("status"), rs.getBoolean("near_a_window"),
                        rs.getInt("seat_number"), rs.getInt("buses_id"));
                seatsList.add(seats);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return seatsList;

    }

    public static List getTableRoutes() throws SQLException {
        Connection connection = getConnection("jdbc:mysql://localhost:3306/bus_booking?useSSL=false", "root", "Kondratyka3");
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM routes")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Routes routes = new Routes(rs.getInt("id"), rs.getString("route_name"),
                        rs.getInt("dest_city"), rs.getInt("depart_city"));
                routesList.add(routes);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return routesList;

    }

    public static List getTableTrips() throws SQLException {
        Connection connection = getConnection("jdbc:mysql://localhost:3306/bus_booking?useSSL=false", "root", "Kondratyka3");
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM trips")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Trips trips = new Trips(rs.getInt("id"), rs.getDate("date_depart"), rs.getDate("date_dest"), rs.getDouble("price"),
                        rs.getInt("route_id"), rs.getInt("buses_id"));
                tripsList.add(trips);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return tripsList;
    }

    public static List getTableOrders() throws SQLException {
        Connection connection = getConnection("jdbc:mysql://localhost:3306/bus_booking?useSSL=false", "root", "Kondratyka3");
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM orders")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Orders orders = new Orders(rs.getInt("id"), rs.getDate("date_time"), rs.getString("order_number"), rs.getInt("seat"));
                ordersList.add(orders);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ordersList;
    }


    public static List getTableTravelers() throws SQLException {
        Connection connection = getConnection("jdbc:mysql://localhost:3306/bus_booking?useSSL=false", "root", "Kondratyka3");
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM travelers")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Travelers travelers = new Travelers(rs.getInt("id"),
                        rs.getString("first_name"), rs.getString("last_name"));
                travelersList.add(travelers);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return travelersList;
    }
}