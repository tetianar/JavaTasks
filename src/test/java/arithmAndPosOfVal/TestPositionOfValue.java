package arithmAndPosOfVal;
import org.junit.*;

import java.util.Arrays;

public class TestPositionOfValue {
    private static int [] arrayValues = {17,45,2,6,4,4,8,4,7,415,45,16};
    private static PositionsOfValue a;

    @BeforeClass
    public static void run(){
        a = new PositionsOfValue();
    }

    @Test
    public void testWithPresentSearchValueMoreThanOne(){
        int value = 4;
        int [] expectArray = {4,5,7};
        int [] actualArray = a.search(arrayValues,value);
        Assert.assertTrue(Arrays.equals(actualArray,expectArray));
    }

    @Test
    public void testWithPresentOneSearchValue(){
        int value = 8;
        int [] expectArray = {6};
        int [] actualArray = a.search(arrayValues,value);
        Assert.assertTrue(Arrays.equals(actualArray,expectArray));
    }

    @Test
    public void testSearchValueAtTheLastPosition(){
        int value = 16;
        int [] expectArray = {11};
        int [] actualArray = a.search(arrayValues,value);
        Assert.assertTrue(Arrays.equals(actualArray,expectArray));
    }

    @Test
    public void testSearchValueAtTheFirstPosition(){
        int value = 17;
        int [] expectArray = {0};
        int [] actualArray = a.search(arrayValues,value);
        Assert.assertTrue(Arrays.equals(actualArray,expectArray));
    }

    @Test
    public void testWithOutSearchValue(){
        int value = 115;
        int [] expectArray = {};
        int [] actualArray = a.search(arrayValues,value);
        Assert.assertTrue(Arrays.equals(actualArray,expectArray));
    }

    @Test
    public void testWithEmptyArray(){
        int [] arrayValues = {};
        int value = 115;
        int [] expectArray = {};
        PositionsOfValue a = new PositionsOfValue();
        int [] actualArray = a.search(arrayValues,value);
        Assert.assertTrue(Arrays.equals(actualArray,expectArray));
    }


}
