public class CLI {
    public static void main(String[] args) {
        // String
        // - Pre-defined class in java
        // - used to store collection of data in text form
        // - represented by ""
        // - internally string is a character array
        // Suppose String name = "John"
        // Internally it is = {'J', 'o', 'h', 'n'}  - character array
        // [] - used to represent an array
        // args - just name of array, it could be anything

        // String[] args - command line arguments
        // - used to take input through command prompt

        // String firstName = args[0];
        // String lastName = args[1];
        // System.out.println("Welcome : " + firstName + " " + lastName);

        // int fnum = Integer.parseInt(args[0]);
        // int snum = Integer.parseInt(args[1]);
        // int result = fnum + snum;
        // System.out.println("Sum is : " + result);

        // int length = args.length;
        // if(length < 2) {
        //     System.out.println("Please pass 2 numbers");
        // }
        // else {
        //     int fnum = Integer.parseInt(args[0]);
        //     int snum = Integer.parseInt(args[1]);
        //     int result = fnum + snum;
        //     System.out.println("Sum is : " + result);
        // }

        
        int sum = 0;
        // Enhanced For Loop
        for(String e : args) {
            sum += Integer.parseInt(e);
        }
        System.out.println("Sum is : " + sum);

    }
}
