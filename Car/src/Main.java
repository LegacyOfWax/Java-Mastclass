class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine()
    {
        return "Car --> Start Engine";
    }
    public String accelerate()
    {
        return "Car --> Accelarte";
    }
    public String brake()
    {
        return "Car --> break";
    }
}
class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi --> Start Engine";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi --> Accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi --> Break";
    }
}


public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "Base Car" );
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("\n");

        Mitsubishi mitsubishi = new Mitsubishi(4, "Outlander");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println("\n");

        Ford ford = new Ford(4, "Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println("\n");

    }
}