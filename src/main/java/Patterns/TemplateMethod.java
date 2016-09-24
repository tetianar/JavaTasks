package Patterns;

/**
 * Created by romas on 24.09.2016.
 */
public class TemplateMethod {

    public static void main (String[] args) {
        C a = new A();
        a.templateMethod();

        System.out.println();

        C b = new B();
        b.templateMethod();
    }
}

abstract  class C{
    void templateMethod(){
        System.out.print ("1");
        differ();
        System.out.print ("3");
        differ2();
    }
    abstract void differ();
    abstract void differ2();
}

class A extends C{
    void differ(){
        System.out.print ("2");
    }
    void differ2(){
        System.out.print ("5");
    }
}

class B extends C{
    void differ(){
        System.out.print ("4");
    }
    void differ2() {}
}
