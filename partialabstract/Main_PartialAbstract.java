public class Main_PartialAbstract {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();   // concrete method from abstract class
        v.drive();   // implemented abstract method
    }
}

abstract class Vehicle {
    void start() {   // concrete method
        System.out.println("Vehicle is starting");
    }

    abstract void drive();   // abstract method
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Car is driving");
    }
}