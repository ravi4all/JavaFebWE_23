package OOPS_Codes;

import java.util.Scanner;

class Student {
    // Instance variables
    int rollNo;
    String name;
    int phy;
    int chem;
    int maths;
    int totalMarks = 300;

    void showStudent() {
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

public class StudentGradingSystem {
    public static void main(String[] args) {
        // int x;
        
        // ram is a reference variable whose data type is Student
        // new is used to allocate new memory of object of Student()
        // Student() is a constructor
        Student ram = new Student();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Roll No : ");
        ram.rollNo = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter Name : ");
        ram.name = scanner.nextLine();

        System.out.println("Enter Physics Marks : ");
        ram.phy = scanner.nextInt();

        System.out.println("Enter Chemistry Marks : ");
        ram.chem = scanner.nextInt();

        System.out.println("Enter Maths Marks : ");
        ram.maths = scanner.nextInt();

        ram.showStudent();
        ram.avg();
        ram.percentage();

        scanner.close();

    }
}
