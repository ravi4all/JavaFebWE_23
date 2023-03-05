import java.math.BigInteger;
import java.util.ArrayList;

public class DataTypes {
    public static strictfp void main(String[] args) {
        // Primitive
        boolean flag = true;
        char c = 'a';
        char c1 = 5;
        byte b1 = 127;
        b1++;       // -128
        short s = 32323;
        int i = 21123123;
        long l = 324234;

        float f = 324.33f;
        double d = 34.465;

        // Non Primitive
        BigInteger a = new BigInteger("345346546567686");
        BigInteger b = new BigInteger("345464576575");
        BigInteger bigC = a.add(b);


        // Wrapper Classes
        Integer i1 = 34;
        Byte b2 = 43;

        // Autoboxing
        // Primitive to Non-primitive and vice versa

        // Array
        int arr_1[] = {1,3,4,7,8,1};
        int arr_2[] = new int[10];

        // Dynamic Array
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);

        // String
        // internally it's a character array
        // example : String name = "John"   -> {'J', 'o', 'h', 'n'}
        String name = "John";
        String name_2 = name;
        String name_3 = "John";
        // internally java uses String Pool to store string object
        System.out.println(name.equals(name_3));    // compare value
        System.out.println(name == name_3);     // compare reference

        String name_4 = new String("John");
        System.out.println(name == name_4);     // compare reference

    }
}
