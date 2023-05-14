import java.util.Scanner;

public class EmpCaller {
    public static void main(String[] args) {
        // Input and Output
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter Employee ID : ");

        MessageReader mr = new MessageReader();
        System.out.println(mr.getValue("emp_id"));
        int empId = scanner.nextInt();

        scanner.nextLine();

        // System.out.println("Enter Employee Name : ");
        System.out.println(mr.getValue("emp_name"));
        String name = scanner.nextLine();

        // System.out.println("Enter Employee Basic Salary : ");
        System.out.println(mr.getValue("emp_salary"));
        double salary = scanner.nextDouble();

        Employee emp_1 = new Employee(empId, name, salary);
        
        // System.out.println("Emp Id : " + emp_1.getEmpId());
        // System.out.println("Emp Name : " + emp_1.getName());
        // System.out.println("Emp Basic Salary : " + emp_1.getBasicSalary());
        // System.out.println("Emp Net Salary : " + emp_1.netSalary());

        // Hashcode
        System.out.println(emp_1);  // internally calls toString
        // toString - defined inside Object class
        // converts object into printable format
        // System.out.println(emp_1.toString());

        scanner.close();

    }
}
