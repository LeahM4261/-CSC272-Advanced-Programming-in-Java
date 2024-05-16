// Person class
class Person {
    private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Year of Birth: " + yearOfBirth;
    }
}

// Student class (subclass of Person)
class Student extends Person {
    private String major;

    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}

// Instructor class (subclass of Person)
class Instructor extends Person {
    private double salary;

    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }
}

// Test program class
public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Alice", 1998, "Computer Science");
        Instructor instructor = new Instructor("Bob", 1975, 60000);

        System.out.println(student);
        System.out.println(instructor);
    }
}