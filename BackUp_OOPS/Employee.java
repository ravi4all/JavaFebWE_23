// Encapsulation
// Data Hiding - make data members private and methods public
// Good Encapsulation = Encapsulation + Data Hiding

// SRP - Single Responsibility Principle
// public class Employee {
    // all java classes internally inherits Object Class
    public class Employee extends Object{
    private int empId;
    private String name;
    private double basicSalary;

    private EmpUtils utils;

    public Employee() {
        utils = new EmpUtils();
    }

    public Employee(int empId, String name, double basicSalary) {
        this();
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Getter and Setter

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        name = utils.formatName(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Earnings
    private double getHRA() {
        return basicSalary * 0.30;
    }
    private double getDA() {
        return basicSalary * 0.25;
    }
    private double getMA() {
        return basicSalary * 0.15;
    }
    private double getTA() {
        return basicSalary * 0.10;
    }

    // Deductions
    private double getTDS() {
        return basicSalary * 0.10;
    }
    private double getPF() {
        return basicSalary * 0.05;
    }

    public double netSalary() {
        double earning = basicSalary + getHRA() + getDA() + getMA() + getTA();
        double deduction = getTDS() + getPF();
        double net = earning - deduction;
        return net;
    }

    @Override
    public String toString() {
        String date = utils.formatDate();
        String sal = utils.formatSalary(netSalary());
        return  "Date : " + date + "\n" +
                "Emp ID : " + empId + "\n" + "Emp Name : " + name + "\n" + 
                "Emp Basic Salary : " + basicSalary + "\n" + 
                "Emp Net Salary : " + sal;
    }

}
