package reflection;
import java.io.IOException;
import java.lang.reflect.*;

/**
 * Created by Tetiana_Romaniv on 9/23/2016.
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class c =  Car.class;
        Class tr = Truck.class;
        Class[] interfaces = c.getInterfaces();
        Field[] fields = c.getDeclaredFields();
        Field[] trPublicFields = tr.getFields();
        Method[] methods = tr.getMethods();


        //Вывести имя класса Car
        System.out.println("Имя класса Car: " + c.getName());

        //Вывести имя класса Truck
        System.out.println("Имя класса Truck: " + tr.getName());

        //Список интерфейсов реализованных классом Car
        for(Class cInterface : interfaces) {
            System.out.println("Интерфейс реализованный классом Car: " + cInterface.getName() );
        }

        //Список полей с типами и аннтотациями в классе Car
        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.print("Имя: "+ field.getName()+"  Тип: " + fieldType.getName());
            if(field.isAnnotationPresent(FieldAnnotation.class)) {
                FieldAnnotation annot = field.getAnnotation(FieldAnnotation.class);
                System.out.print("   Аннотация: " + annot.description());
            }
            System.out.println();
        }

        //Список public полей с типами в классе Truck
        System.out.println("Public fields in class Truck:  ");
        for (Field trField : trPublicFields) {
            Class trFieldType = trField.getType();
            System.out.println("Имя: "+ trField.getName()+"  Тип: " + trField.getName());
        }

        //вызвать отмеченные аннотацией MethodAnnotation методы с помощью invoke().
        for (Method method : methods) {
            if(method.isAnnotationPresent(MethodAnnotation.class)) {
                Truck obg = new Truck("Opel", 200, 2, 5);
                method.invoke(obg);
            }
        }
    }
}

