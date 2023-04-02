package OOPS_Codes;

// Encapsulation - wrapping of data into a single unit

public class StudentDetails {
    // Instance variables
    int rollNo;
    String name;
    int phy;
    int chem;
    int maths;
    int totalMarks;
    String collegeName;

    // Constructor
    // same name as class name
    // it's a default constructor
    // it's not a function so it won't be having any return type
    // it will be public so that we can object of class
    // used to initialize variables
    public StudentDetails() {
        System.out.println("Default Const. executed...");
        this.totalMarks = 300;
        this.collegeName = "DU";
    }

    // Parameterized constructor
    public StudentDetails(int rollNo, String name, int phy, int chem, int maths) {
        this();     // calling default constructor - constructor chaining
        System.out.println("Param Const. executed...");
        this.name = name;
        this.rollNo = rollNo;
        this.phy = phy;
        this.chem = chem;
        this.maths = maths;
    }

    void showStudent() {
        System.out.println("College Name : " + this.collegeName);
        System.out.println("Name is : " + name);
        System.out.println("Roll No is : " + rollNo);
        System.out.println("Phy : " + phy);
        System.out.println("Chem : " + chem);
        System.out.println("Math : " + maths);
    }

    void avg() {
        int obtainedMarks = phy + chem + maths;
        double avgMarks = obtainedMarks/3;
        System.out.println("Average marks : " + avgMarks);
    }
    void percentage() {
        int obtainedMarks = phy + chem + maths;
        double percentage = (double)obtainedMarks/totalMarks * 100;
        System.out.println("Percentage is : " + percentage);
        if(percentage >= 90) {
            System.out.println("Grade A");
        }
        else if(percentage >= 80 && percentage < 90) {
            System.out.println("Grade B");
        }
        else if(percentage >= 60 && percentage < 80) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Grade D...");
        }
    }
}
