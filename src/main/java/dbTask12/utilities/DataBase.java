package dbTask12.utilities;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import dbTask12.entities.*;

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

    public static void getTableCities() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking?useSSL=false", "root", "1111");
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM cities")){
            ResultSet rs = query.executeQuery();
            while(rs.next()){
                Cities cities = new Cities(rs.getInt("id"), rs.getString("name"));
                citiesList.add(cities);
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        System.out.println(citiesList);
    }


    public static void getTableBuses() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking?useSSL=false", "root", "1111");
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM buses")){
            ResultSet rs = query.executeQuery();
            while(rs.next()){
                Buses buses = new Buses(rs.getInt("id"), rs.getInt("number_of_seats"),
                        rs.getBoolean("has_air_cond"), rs.getString("model"),rs.getInt("year"));
                busesList.add(buses);
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        System.out.println(busesList);

    }

    public static void getTableSeats() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking?useSSL=false", "root", "1111");
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM seats")){
            ResultSet rs = query.executeQuery();
            while(rs.next()){
                Seats seats = new Seats(rs.getInt("id"),rs.getBoolean("status"), rs.getBoolean("near_a_window"),
                        rs.getInt("seat_number"),rs.getInt("buses_id"));
                seatsList.add(seats);
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        System.out.println(seatsList);

    }



}
