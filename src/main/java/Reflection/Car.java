package Reflection;

/**
 * Created by Tetiana_Romaniv on 9/23/2016.
 */
public abstract class Car implements Transport {
    @FieldAnnotation
    public String color;

    protected static final int numberOfWheels = 4;
    private String brand;
    private int power;
    private  int numberOfCylinders;

    public Car(String brand, int power, int numberOfCylinders) {
        this.brand = brand;
        this.power = power;
        this. numberOfCylinders = numberOfCylinders;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public void move() {
        System.out.println("Cars moving on the ground");
    }

    @Override
    public void beep() {
        System.out.println("Beep is designed to prevent an emergency");
    }


    @Override
    public void carry() {
        System.out.println("Cars transport people and cargo");
    }


}