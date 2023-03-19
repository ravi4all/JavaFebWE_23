public class PrimeNumberP2 {
    public static void main(String[] args) {
        // int num = 997;
        int num = 100000007;
        int counter = 0;
        boolean prime = true;
        // for(int i = 2; i < num/2; i++) {
        //     counter++;
        //     if(num % i == 0) {
        //         prime = false;
        //         break;
        //     }
        // }

        // for(int i = 2; i * i <= num; i++) {
        //     counter++;
        //     if(num % i == 0) {
        //         prime = false;
        //         break;
        //     }
        // }


        if(num % 2 == 0 || num % 3 == 0) {
            prime = false;
        }
        for(int i = 5; i*i <= num; i+=6) {
            counter++;
            if(num % i == 0 || num % (i + 2) == 0) {
                prime = false;
                break;
            }
        }

        System.out.println("Took : " + counter + " iterations...");
        if(prime) {
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }
    }
}
