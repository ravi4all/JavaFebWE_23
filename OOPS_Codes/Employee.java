package OOPS_Codes;

import java.util.Date;

// Good Encapsulation - Encapsulation + Data Abstraction
// Make variables private and methods public
// SRP - Single Responsibility Principle

public class Employee {
    private int emp_id;
    private String name;
    private double salary;

    public Employee(int emp_id, String name, double salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.salary = salary;
    }

    // Getter and Setter
    
    /**
     * @return int return the emp_id
     */
    public int getEmp_id() {
        return emp_id;
    }

    /**
     * @param emp_id the emp_id to set
     */
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return double return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Earnings
    public double getHRA() {
        return salary * 0.35;
    }

    public double getTA() {
        return salary * 0.20;
    }

    public double getMA() {
        return salary * 0.15;
    }

    public double getDA() {
        return salary * 0.25;
    }

    // Deductions - Taxes
    public double getTDS() {
        return salary * 0.10;
    }

    public double getPF() {
        return salary * 0.05;
    }

    public double netSalary() {
        double earnings = salary + getHRA() + getDA() + getMA() + getTA();
        double deductions = getPF() + getTDS();
        double netSal = earnings - deductions;
        return netSal;
    }

    @Override
    public String toString() {
        CommonEmpUtils utils = new CommonEmpUtils();
        Date date = utils.formatDate();
        return "Date : " + date + "\n" + "Name is : " + this.name + "\n" + 
        "Basic Salary is : " + this.salary + "\n" + 
        "Net Payable Salary is : " + netSalary();
    }

}
