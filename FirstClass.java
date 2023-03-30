// DRY - Don't Repeat Yourself

class Student {
    // instance variables
    int rollNo;
    String name;
    String branch;
    String course;
    double fees;

    void takeInput(int rollNo, String name, String branch, String course, double fees) {
        // Local Variable
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.course = course;
        this.fees = fees;
    }

    void showDetails() {
        // this - refers to current object
        // java internally applies this before each variable
        System.out.println("RollNo : " + this.rollNo );
        System.out.println("Name : " + this.name );
        System.out.println("Branch : " + this.branch );
        System.out.println("Course : " + course );
        System.out.println("Fees : " + fees );
    }
}

public class FirstClass {
    public static void main(String[] args) {
        /*
         * While creating object first we define type of object
         * object data type will be a class
         * object comes into memory when we define new keyword
         * and finally object is created of a constructor of the class
         */
        Student obj = new Student();
        // obj.rollNo = 101;
        // obj.name = "Ram";
        // obj.branch = "CSE";
        // obj.course = "Btech";
        // obj.fees = 4500.00;
        obj.takeInput(101, "Ram", "CSE", "Btech", 4500.00);
        obj.showDetails();
        // System.out.println("RollNo : " + obj.rollNo );
        // System.out.println("Name : " + obj.name );
        // System.out.println("Branch : " + obj.branch );
        // System.out.println("Course : " + obj.course );
        // System.out.println("Fees : " + obj.fees );

        System.out.println("=======================");

        Student shyam = new Student();
        // shyam.rollNo = 102;
        // shyam.name = "Shyam";
        // shyam.branch = "ECE";
        // shyam.course = "Btech";
        // shyam.fees = 4500.00;
        shyam.takeInput(102, "Shyam", "ECE", "Btech", 4500.00);
        shyam.showDetails();
        // System.out.println("RollNo : " + shyam.rollNo );
        // System.out.println("Name : " + shyam.name );
        // System.out.println("Branch : " + shyam.branch );
        // System.out.println("Course : " + shyam.course );
        // System.out.println("Fees : " + shyam.fees );
    }
}
