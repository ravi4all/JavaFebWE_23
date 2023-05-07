package BackUp;

// Encapsulation - Wrapping of methods and variables in class
// SRP - Single Responsibility Principle

// Convert this example into student grading system
// take marks of 5 subjects
// calculate total, average and percentage
// based on percentage assign grades to the student


public class StudentData {
    int rollNo;
    String name;
    double marks;
    String college;
    String branch;

    // Constructor
    // - used to initialize variables
    // - this is default constructor
    // - it is called whenever we create object of class
    // - constructor have same name as class name
    // - constructor looks like a function but it returns nothing
    // - constructor cannot be private, because we cannot create object of a
    //   class whose constructor is private
    public StudentData() {
        this("CS");
        this.college = "RD";
    }

    public StudentData(String branch) {
        this.branch = branch;
    }

    // Constructor overloading - we have multiple constrcutor
    // all constructors will have different arguments but same name
    // Parameterized constructor
    public StudentData(int rollNo, String name, double marks) {
        // Constructor Chaining - one const. calls another const.
        this();     // it will call default constructor
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // void takeInput(int rollNo, String name, double marks) {
    //     this.rollNo = rollNo;
    //     this.name = name;
    //     this.marks = marks;
    // }

    void totalMarks() {

    }

    void avgMarks() {

    }

    void percentage() {

    }

    void grading() {
        
    }

    void showDetails() {
        System.out.println("College : " + this.college);
        System.out.println("Roll No : " + this.rollNo);
        System.out.println("Name : " + name);
        System.out.println("MarKs : " + marks);
    }
}
