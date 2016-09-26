package Patterns;

/**
 * Created by Tetiana_Romaniv on 9/26/2016.
 */
public class AbstractFactory {
    public static void main (String[] args) {
        DeviceFactory factory = getFactoryBCountryCode("EN");
        Mouse m = factory.getMouse();
        Keyboard k = factory.getKeyboard();
        TouchPad t = factory.getTouchPad();

        m.click();
        k.print();
        k.println();
        t.track(10,35);
    }

    private static DeviceFactory getFactoryBCountryCode(String lang){
        switch (lang){
            case "RU":
                return new RuDeviceFactory();
            case "EN":
                return new EnDeviceFactory();
            default:
                throw new RuntimeException("Unsupported Country Code: " + lang);
        }
    }
}


interface Mouse{
    void click();
    void dblClick();
    void scroll (int direction);
}

interface Keyboard{
    void print();
    void println();
}

interface TouchPad{
    void track (int deltaX, int deltaY);
}

interface DeviceFactory{
    Mouse getMouse();
    Keyboard getKeyboard();
    TouchPad getTouchPad();
}

class RuMouse implements Mouse{
    public void click() {System.out.println("Mouse click");}
    public void dblClick() {System.out.println("Mouse double click");}
    public void scroll(int direction){
        if (direction>0){
            System.out.println("Scroll up");
        }
        else if(direction<0){
            System.out.println("Scroll down");
        }
        else {
            System.out.println("Doesn't scroll");
        }
    }
}

class RuKeyboard implements Keyboard{
    public void print(){System.out.println("Print");}
    public void println(){System.out.println("Print with change a line");}
}

class RuTouchpad implements TouchPad{
    public void track(int deltaX, int deltaY){
        int s = (int) Math.sqrt(Math.pow(deltaX,2)+Math.pow(deltaY,2));
        System.out.println("Go on "+ s +" pixels");}
}


class EnMouse implements Mouse{
    public void click() {System.out.println("En. Mouse click");}
    public void dblClick() {System.out.println("En. Mouse double click");}
    public void scroll(int direction){
        if (direction>0){
            System.out.println("En. Scroll up");
        }
        else if(direction<0){
            System.out.println("En. Scroll down");
        }
        else {
            System.out.println("En. Doesn't scroll");
        }
    }
}

class EnKeyboard implements Keyboard{
    public void print(){System.out.println("En. Print");}
    public void println(){System.out.println("En. Print with change a line");}
}

class EnTouchpad implements TouchPad{
    public void track(int deltaX, int deltaY){
        int s = (int) Math.sqrt(Math.pow(deltaX,2)+Math.pow(deltaY,2));
        System.out.println("En. Go on "+ s +" pixels");}
}

class EnDeviceFactory implements DeviceFactory{
    public Mouse getMouse(){
        return new EnMouse();
    }
    public Keyboard getKeyboard(){
        return new EnKeyboard();
    }
    public TouchPad getTouchPad(){
        return new EnTouchpad();
    }
}

class RuDeviceFactory implements DeviceFactory{
    public Mouse getMouse(){
        return new RuMouse();
    }
    public Keyboard getKeyboard(){
        return new RuKeyboard();
    }
    public TouchPad getTouchPad(){
        return new RuTouchpad();
    }
}