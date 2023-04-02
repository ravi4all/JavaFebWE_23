package OOPS_Codes;

public class EmployeeCaller {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "ram ShARMa", 45000.00);
        // System.out.println("ID : " + emp.getEmp_id());
        // System.out.println("Name : " + emp.getName());
        // System.out.println("Basic Salary : " + emp.getSalary());
        // System.out.println("Net Payable Salary : " + emp.netSalary());
        // System.out.println(emp);

        // toString() - present inside Object class
        // used to print object in human readable form
        // System.out.println(emp.toString());
        System.out.println(emp);    // internally it will call toString


        Employee emp_2 = new Employee(102, "Shyam", 55000.00);
        // System.out.println("ID : " + emp_2.getEmp_id());
        // System.out.println("Name : " + emp_2.getName());
        // System.out.println("Basic Salary : " + emp_2.getSalary());
        // System.out.println("Net Payable Salary : " + emp_2.netSalary());
        System.out.println(emp_2);
    }
}