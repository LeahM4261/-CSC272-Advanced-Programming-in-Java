// Class definition
class Car {
    String make;
    String model;
    
    // Constructor to initialize make and model
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    // Method to display car details
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

public class DifferenceObjectsClasses {
    public static void main(String[] args) {
        // Creating objects of class Car
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Honda", "Civic");
        
        // Accessing object properties and methods
        car1.displayDetails();
        car2.displayDetails();
    }
}
