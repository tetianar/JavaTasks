package driver;

import driver.entities.*;
import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.Date;

/**
 * Created by romas on 23.09.2016.
 */
public class TestRoute {

    Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
    DriverLicense license = new DriverLicense(new Date(), DriverLicense.Category.B, new Date());

    @Rule
    public ExpectedException exp = ExpectedException.none();

    //@Test(expected = IllegalArgumentException.class)
    @Test
    public void testException() {
        exp.expect(IllegalArgumentException.class);
        Driver johnDriver = new Driver(john, license);
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500", DriverLicense.Category.C,
                1499, 80, GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car, johnDriver, "Troeshina", "Klovska");
    }

    @Test(expected = Exception.class)
        public void testIncorrectFromDateInDriverLicence() {
        exp.expect(Exception.class);
        Date fromDate = new Date(1800, 12, 12);
        license.setFromDate(fromDate);
    }

    //@Test(expected = Exception.class)
    /*Если срок действия прав 10 лет, дата действия прав должна быть не больше чем: текущая дата+10 лет, иная ситуация
    должна быть обработана.*/
    @Test
    public void testIncorrectExpireDateInDriverLicence() {
        exp.expect(Exception.class);
        Date expireDate = new Date(2318, 10, 10);
        license.setExpires(expireDate);
    }


    /*Дата срока действия прав должна быть больше даты выдачи*/
    @Test
    public void testExpireDateBigerThenCreateDate() {
        Date fromDate = new Date(2008, 12, 12);
        Date expireDate = new Date(2018, 10, 10);
        license.setFromDate(fromDate);
        license.setExpires(expireDate);
        Assert.assertTrue(license.getFromDate().before(license.getExpires()));
    }

    //@Test(expected = Exception.class)
    /*Нельзя создать driver, если ему не исполнилось 16 лет */
    @Test
    public void TooYangHuman() {
        exp.expect(Exception.class);
        john.setBirthDate(new Date());
        Driver johnDriver = new Driver(john, license);
    }
}
