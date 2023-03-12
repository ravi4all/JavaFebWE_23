public class IfElse {
    public static void main(String[] args) {
        int x = 12, y = 20, z=30;
        // if(x > y) {
        //     System.out.println("X is greater");
        // }
        // else {
        //     System.out.println("Y is greater");
        // }
        String result = x > y ? "X" : "Y";
        System.out.println(result + " is greater");

        if(x > y && x > z) {
            System.out.println("X is greatest");
        }
        else if(y > x && y > z) {
            System.out.println("Y is greatest");
        }
        else {
            System.out.println("Z is greatest");
        }

    }
}
