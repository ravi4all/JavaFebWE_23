package OOPS_Codes;

import java.util.Scanner;

public class StudentCaller {
    public static void main(String[] args) {
        // it will call default const...
        // StudentDetails ram = new StudentDetails();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Roll No : ");
        // ram.rollNo = scanner.nextInt();
        int rollNo = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter Name : ");
        // ram.name = scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("Enter Physics Marks : ");
        // ram.phy = scanner.nextInt();
        int phy = scanner.nextInt();

        System.out.println("Enter Chemistry Marks : ");
        // ram.chem = scanner.nextInt();
        int chem = scanner.nextInt();

        System.out.println("Enter Maths Marks : ");
        // ram.maths = scanner.nextInt();
        int maths = scanner.nextInt();

        StudentDetails ram = new StudentDetails(rollNo, name, phy, chem, maths);
        ram.showStudent();
        ram.avg();
        ram.percentage();


        // StudentDetails shyam = new StudentDetails(rollNo, name, phy, chem, maths);
        // shyam.showStudent();
        // shyam.avg();
        // shyam.percentage();

        scanner.close();
    }
}
