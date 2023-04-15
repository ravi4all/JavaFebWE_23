public class CLI {
    public static void main(String[] arr) {
        if(arr.length == 0) {
            System.out.println("No Elements available");
        }
        else if(arr.length == 1) {
            System.out.println("Only One Element is passed");
            System.out.println(arr[0]);
        }
        else if(arr.length == 2) {
            // Type casting - convert one data type into another
            int firstNum = Integer.parseInt(arr[0]);
            int secondNum = Integer.parseInt(arr[1]);
            int result = firstNum + secondNum;
            System.out.println("Sum is : " + result);
        }
        else {
            int sum = 0;
            // for(int i = 0; i < arr.length; i++) {
            //     sum += Integer.parseInt(arr[i]);
            // }
            
            // Enhanced For Loop
            for(String s : arr) {
                sum += Integer.parseInt(s);
            }

            System.out.println("Sum is : " + sum);
        }
        
    }
}
