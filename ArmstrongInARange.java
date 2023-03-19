public class ArmstrongInARange {
    public static void main(String[] args) {
        int min = 100;
        int max = 1000;
        for(int i = min; i < max; i++) {
            int num = i;
            int result = 0;
            int temp = num;
            while(num != 0) {
                int rem = num % 10;
                result += Math.pow(rem, 3);
                num = num / 10;
            }
            if(temp == result) {
                System.out.println("Armstrong : " + temp);
            }
            // else {
            //     System.out.println("Not armstrong");
            // }
        }
    }
}
