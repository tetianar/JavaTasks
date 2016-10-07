package daoTask13.controller;

import daoTask13.TripsService;
import daoTask13.entities.Trips;
import org.junit.Before;
import org.junit.Test;

import javax.xml.ws.Service;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;


/**
 * Created by Tetiana_Romaniv on 10/7/2016.
 */
public class TestController {
    private Runner controller;
    private TripsService service;

    @Before
    public void init(){
        service = mock( TripsService.class);
        controller = new Runner();
        controller.service = service;
    }

    @Test
    public void testController() throws IllegalAccessException {
        controller.doServiceIcreaceCall("1000", "100");
        verify(service).addIncreaseValueToPrice(1000, 100);
    }
    @Test(expected = RuntimeException.class)
    public void testControllerInvalidData() throws IllegalAccessException {
        controller.doServiceIcreaceCall("aaa", "10");
        verify(service).addIncreaseValueToPrice(100, 10);
    }
    @Test
    public void testControllerInvalidDataExt() throws IllegalAccessException {
        try{
            controller.doServiceIcreaceCall("-100500", "10");
        }catch(RuntimeException ex){

        }
        verify(service , never()).addIncreaseValueToPrice(anyInt(),
                anyInt());

    }
    @Test
    public void testControllerInvalidDiscount() throws IllegalAccessException {
        try{
            controller.doServiceIcreaceCall("1000", "-10");
        }catch(RuntimeException ex){

        }
        verify(service , never()).addIncreaseValueToPrice(anyInt(),
                anyInt());

    }


}
