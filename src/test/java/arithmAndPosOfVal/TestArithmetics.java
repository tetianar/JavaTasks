package arithmAndPosOfVal;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TestArithmetics {
    private static Arithmetics a;

    @Rule
    public ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);


    @BeforeClass
    public static void runT(){
        a = new Arithmetics();
    }

    /*
        @After
        @AfterClass
     */

    @Test
    public void testAdd(){
        double res = a.add(3,7);
        Assert.assertEquals(res, 10.0, 0);
    }
    @Ignore
    @Test
    public void testMult(){
        Arithmetics a = new Arithmetics();
        double res = a.mult(3,7);
        Assert.assertNotNull(a);
    }

    @Test
    public void testDeduct(){
        double res = a.deduct(3,7);
        Assert.assertTrue(res == -4);
    }

    @Test
    public void testDiv(){
        double res = a.div(10,5);
        Assert.assertTrue(res == 2.0);
    }

    //@Test(expected = ArithmeticException.class)
    @Test
    public void testDivException(){
        exp.expect(ArithmeticException.class);
        a.div(10.0, 0.0);
    }

    //@Test (timeout = 1000)
    @Test
    public void testTimeOut(){
        while (true){}
    }
}