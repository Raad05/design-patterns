package singleton;

public class Car {
    // static variable
    private static volatile Car car;

    // using global variables
    public String name;
    public String model;

    // constructor
    private Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    // static method
    public static Car getCar(String name, String model) {
        if (car == null) {
            synchronized (Car.class) {
                if (car == null)
                    car = new Car(name, model);
            }
        }

        return car;
    }
}
