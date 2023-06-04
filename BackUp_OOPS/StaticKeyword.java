class Customer {
    // static - it gets loaded with class in memory
    static int counter;
    int id;
    String name;
    
    // Static Block - used to initialize static variables
    static {
        counter = 100;
    }

    public Customer(String name) {
        counter++;
        this.id = counter;
        this.name = name;
    }
    public void showCustomer() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + this.name);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Customer obj_1 = new Customer("Ram");
        obj_1.showCustomer();
        Customer obj_2 = new Customer("Shyam");
        obj_2.showCustomer();
        Customer obj_3 = new Customer("Aman");
        obj_3.showCustomer();

        obj_1.showCustomer();
    }
}
