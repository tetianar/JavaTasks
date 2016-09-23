package Driver;
import ArithmAndPosOfVal.Arithmetics;
import Driver.entities.*;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by romas on 23.09.2016.
 */
public class TestRoute {
    @Rule
    public ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);




    //@Test(expected = IllegalArgumentException.class)
    @Test
    public void testException(){
        exp.expect(IllegalArgumentException.class);
        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(),
                DriverLicense.Category.A, new Date()));

        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500", DriverLicense.Category.C,
                1499, 80, GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car, johnDriver, "Troeshina", "Klovska");
    }

    //@Test (timeout = 1000)
    @Test
    public void testTimeOut(){
        while (true){}
    }

    @Test
    public void testDriverLicenseData(){

        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(),
                DriverLicense.Category.A, new Date()));
        //johnDriver.getDriverLicense().setFromDate(23.05.2017 10:00:00);

        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500", DriverLicense.Category.C,
                1499, 80, GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car, johnDriver, "Troeshina", "Klovska");
    }
}
