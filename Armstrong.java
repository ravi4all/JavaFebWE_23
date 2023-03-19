public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int result = 0;
        int temp = num;
        while(num != 0) {
            int rem = num % 10;
            // result += rem * rem * rem;
            // result = result + Math.pow(rem, 3);
            result += Math.pow(rem, 3);
            num = num / 10;
        }
        if(temp == result) {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not armstrong");
        }
    }
}
