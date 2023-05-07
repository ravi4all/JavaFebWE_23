import java.util.Scanner;

public class EmpCaller {
    public static void main(String[] args) {
        // Input and Output
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID : ");
        int empId = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter Employee Name : ");
        String name = scanner.nextLine();

        System.out.println("Enter Employee Basic Salary : ");
        double salary = scanner.nextDouble();

        Employee emp_1 = new Employee(empId, name, salary);
        
        System.out.println("Emp Id : " + emp_1.getEmpId());
        System.out.println("Emp Name : " + emp_1.getName());
        System.out.println("Emp Basic Salary : " + emp_1.getBasicSalary());
        System.out.println("Emp Net Salary : " + emp_1.netSalary());

        scanner.close();

    }
}
