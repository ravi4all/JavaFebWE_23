package OOPS_Codes;

public class ConstructorDemo {

    // static block - used for initialization of static variables
    // will be called only once
    static {
        System.out.println("Will be executed first...");
    }

    // Init Block - used for initialization of variables before constructor
    // will be executed every time we make object
    {
        System.out.println("Executed Before Constructor...");
    }

    // Constructor block
    // will be executed every time we make object
    public ConstructorDemo() {
        System.out.println("Constructor exectued...");
    }

    public static void main(String[] args) {
        ConstructorDemo obj_1 = new ConstructorDemo();
        ConstructorDemo obj_2 = new ConstructorDemo();
        ConstructorDemo obj_3 = new ConstructorDemo();
    }
}
