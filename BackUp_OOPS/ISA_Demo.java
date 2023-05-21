class Loan {
    int x = 10;
    void apply() {
        System.out.println("Apply for Loan...");
    }
    void roi() {
        System.out.println("ROI is 8%");
    }
    void emi() {
        System.out.println("Min EMI will be of 24 months");
    }
}

class EduLoan extends Loan {
    int y = 20;
    void eligibility() {
        System.out.println("You must be Under Graduate");
    }
    
    @Override
    void roi() {
        System.out.println("ROI is 9%");
    }
}

class HomeLoan extends Loan {
    void timePeriod() {
        System.out.println("Minimum Time Period for Home Loan is 5 Years");
    }

    @Override
    void emi() {
        System.out.println("Min EMI will be of 36 Months...");
    }
}

public class ISA_Demo {

    // Polymorphic call
    void caller(Loan loan) {
        loan.apply();
        loan.emi();
        loan.roi();
        // Downcasting
        if(loan instanceof EduLoan) {
            EduLoan eduLoan = (EduLoan)loan;
            eduLoan.eligibility();
        }
        else if(loan instanceof HomeLoan) {
            HomeLoan homeLoan = (HomeLoan)loan;
            homeLoan.timePeriod();
        }
    }

    public static void main(String[] args) {

        ISA_Demo obj = new ISA_Demo();
        obj.caller(new EduLoan());
        obj.caller(new HomeLoan());

        // EduLoan edu = new EduLoan();
        // edu.apply();    // Loan class
        // edu.roi();      // EduLoan class (Override)
        // edu.emi();      // Loan class
        // edu.eligibility();  // EduLoan class (self)
        
        // System.out.println("==========");

        // HomeLoan home = new HomeLoan();
        // home.apply();   // Loan class
        // home.roi();     // Loan class
        // home.emi();     // HomeLoan class (Override)
        // home.timePeriod();  // HomeLoan class (self)


        // Upcasting - we create object of child class 
        // but the type of object is Parent class
        // Loan loan = new EduLoan();
        // loan.apply();    // Loan class
        // loan.roi();      // EduLoan class (Override)
        // loan.emi();      // Loan class
        // loan.eligibility();  // EduLoan class (self)
        // System.out.println(loan.x + "," + loan.y);
        
        // System.out.println("==========");

        // loan = new HomeLoan();
        // loan.apply();   // Loan class
        // loan.roi();     // Loan class
        // loan.emi();     // HomeLoan class (Override)
        // loan.timePeriod();  // HomeLoan class (self)
    }
}
