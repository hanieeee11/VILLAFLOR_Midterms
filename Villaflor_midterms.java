class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name );
        System.out.println("Age: " + age + "years old");
    }
}

class Student extends Person {
    String studentID;
    String course;
    int units;
    final int feePerUnit = 1000;

    Student(String name, int age, String studentID, String course, int units) {
        super(name, age);
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    double calculateFees() {
        return units * feePerUnit;
    }

    @Override
    void displayInfo() {
        System.out.println("\nStudent Name: " + name );
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: " + calculateFees());
    }
}

class Instructor extends Person {
    String employeeID;
    String department;
    double salary;

    // Initializing variables
    Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    @Override
    void displayInfo() {
        System.out.println("\nInstructor Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID );
        System.out.println("Department: " + department );
        System.out.println("Salary: " + salary );
    }
}

public class Villaflor_midterms {
    static void printDetails(Person p) {
        p.displayInfo();
    }

    public static void main(String[] args) {
    // Instantiating objects for the students and instructors
        Student student1 = new Student("Jay Han Louie's A. Villaflor", 20 , "231000342" , "Computer Engineering" , 24);
        Student student2 = new Student("Joshua Jericho De Leon Barja " , 20 , "123443222" , "Cumputer Science" , 30);
        Instructor instructor1 = new Instructor("Engr. Sarahlyn", 45, "CPEI1", "Engineering", 50000);
        Instructor instructor2 = new Instructor("Engr. Tanya", 22, "CPEI2", "Engineering", 40000);

    // Print out individual details
        printDetails(student1);
        printDetails(student2);
        printDetails(instructor1);
        printDetails(instructor2);
    }
}

