package Reflection;

/**
 * Created by Tetiana_Romaniv on 9/23/2016.
 */
public class Truck extends Car {
    private int carryingCapacity;

    public Truck(String brand, int power, int numberOfCylinders,int carryingCapacity){
        super(brand, power, numberOfCylinders);
        this.carryingCapacity = carryingCapacity;
    }

    @MethodAnnotation
    @Override
    public void carry() {
        System.out.println("Trucks transport cargo");
    }

    @Override
    public String toString() {
        return "Truck{" +
                ", carryingCapacity=" + carryingCapacity +
                '}';
    }
}


