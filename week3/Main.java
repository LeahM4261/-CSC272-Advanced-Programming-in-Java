// Vehicle class
class Vehicle {
    int wheelCount;

    public Vehicle(int wheelCount) {
        this.wheelCount = wheelCount;
    }
}

// Engine class
class Engine {
    int cylinderCount;

    public Engine(int cylinderCount) {
        this.cylinderCount = cylinderCount;
    }
}

// Tire class
class Tire {
    String size;

    public Tire(String size) {
        this.size = size;
    }
}

// Automobile class
class Automobile extends Vehicle {
    Engine engine;
    Tire[] tires;

    public Automobile(int wheelCount, Engine engine, Tire[] tires) {
        super(wheelCount);
        this.engine = engine;
        this.tires = tires;
    }

    public void printCharacteristics() {
        System.out.println("Cylinder Count: " + engine.cylinderCount);
        System.out.println("Wheel Count: " + wheelCount);
        System.out.println("Tire Size: " + tires[0].size);
    }
}

// Test program
public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(4);
        Tire[] tires = {new Tire("265-75-R16"), new Tire("265-75-R16"), new Tire("265-75-R16"), new Tire("265-75-R16")};
        Automobile car = new Automobile(4, engine, tires);

        car.printCharacteristics();
    }
}