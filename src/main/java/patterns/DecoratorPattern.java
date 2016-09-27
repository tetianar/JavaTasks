package patterns;

/**
 * Created by Tetiana_Romaniv on 9/26/2016.
 */
public class DecoratorPattern {
    public static void main (String[] args) {
        //PrinterInterface printer = new Printer("Hello");
        PrinterInterface printer = new QuoteDecorator(new RightBracketDecorator(new LeftBracketDecorator(new Printer("Hello"))));
        printer.print();
    }
}

interface PrinterInterface{
    void print();
}

class Printer implements PrinterInterface{
    String value;
    public Printer(String value){this.value = value;}
    public void print(){
        System.out.println(value);
    }
}

abstract class Decorator implements PrinterInterface{
    PrinterInterface component;
    public Decorator(PrinterInterface component) {
        this.component = component;
    }
}

class QuoteDecorator extends Decorator{
    PrinterInterface component;
    public QuoteDecorator(PrinterInterface component){super(component);}
    public void print(){
        System.out.print("\"");
        component.print();
        System.out.print("\"");
    }
}

class LeftBracketDecorator extends Decorator{
    PrinterInterface component;
    public LeftBracketDecorator(PrinterInterface component){super(component);}
    public void print(){
        System.out.print("(");
        component.print();
    }
}

class RightBracketDecorator extends Decorator{
    PrinterInterface component;
    public RightBracketDecorator(PrinterInterface component){super(component);}
    public void print(){
        component.print();
        System.out.print(")");
    }
}