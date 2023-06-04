public class TypePromotion {

    void show(byte x) {
        System.out.println("Byte X");
    }

    void show(short x) {
        System.out.println("Short X");
    }

    // void show(int x) {
    //     System.out.println("Int X");
    // }

    // void show(float x) {
    //     System.out.println("Float X");
    // }

    // void show(long x) {
    //     System.out.println("Long X");
    // }

    // void show(double x) {
    //     System.out.println("Double X");
    // }

    // void show(Integer x) {
    //     System.out.println("Integer X");
    // }

    // void show(int ...x) {
    //     System.out.println("Variable Length Argument X");
    // }

    public static void main(String[] args) {
        TypePromotion obj = new TypePromotion();
        // obj.show(12);   // will execute int
        
        // Type promotion
        // If int is not available
        // obj.show(45);   // will execute long

        // Type widening
        // obj.show(4);    // will execute float

        // obj.show(45);   // will execute double

        // obj.show(45);   // will execute Integer Wrapper

        // obj.show(45);   // will execute Variable length arg

        obj.show((byte)12);
        obj.show((short)56);
    }
}
