package BackUp;

class Student {
    // instance variables - will occupy memory once object is created
    int rollNo;
    String name;
    double marks;
    String college;

    void takeInput(int rollNo, String name, double marks, String college) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.college = college;
    }

    void showStudent() {
        // this - refers to current object
        // this keyword is written internally
        System.out.println("College : " + this.college);
        System.out.println("Roll No : " + this.rollNo);
        System.out.println("Name : " + name);
        System.out.println("MarKs : " + marks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        // int x = 10;
        Student ram = new Student();
        // ram.rollNo = 101;
        // ram.name = "Ram";
        // ram.marks = 80.00000;
        // ram.college = "DU";
        ram.takeInput(101, "Ram", 78.00, "DU");
        ram.showStudent();
        // System.out.println("College : " + ram.college);
        // System.out.println("Roll No : " + ram.rollNo);
        // System.out.println("Name : " + ram.name);
        // System.out.println("Makrs : " + ram.marks);

        Student raman = new Student();
        // raman.rollNo = 102;
        // raman.name = "Raman";
        // raman.marks = 90.66;
        // raman.college = "DU";
        raman.takeInput(102, "Raman", 90.33, "DU");
        raman.showStudent();
        // System.out.println("College : " + raman.college);
        // System.out.println("Roll No : " + raman.rollNo);
        // System.out.println("Name : " + raman.name);
        // System.out.println("Makrs : " + raman.marks);
    }
}
