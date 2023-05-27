class Parent {
    int x;
    Parent() {
        x = 20;
        System.out.println("This is parent class default const...");
    }
    Parent(int x) {
        this();
        System.out.println("Parent class param const...");
    }
}

class Child extends Parent {
    int x;
    Child() {
        // super();    // java uses super() internally to call parent class const.
        super(110); // will call parent's parameterized
        
        x = 30;
        System.out.println("This is child class default const...");
    }
    Child(int x) {
        this(); // will call default const of same class
        // local variable + instance variable + parent class variable
        int total = x + this.x + super.x;
        System.out.println("Total : " + total);
    }
}

public class SuperVsThis {
    public static void main(String[] args) {
        // Child obj = new Child();
        Child obj = new Child(50);
    }
}
