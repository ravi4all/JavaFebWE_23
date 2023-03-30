import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Div");
        System.out.println("4. Mul");

        System.out.println("Enter your choice : ");
        int choice = scanner.nextInt();

        System.out.println("Enter first number : ");
        int fnum = scanner.nextInt();

        System.out.println("Enter second number : ");
        int snum = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sum is : " + (fnum + snum));
                break;
            case 2:
                System.out.println("Sub is : " + (fnum - snum));
                break;
            case 3:
                System.out.println("Div is : " + (fnum / snum));
                break;
            case 4:
                System.out.println("Mul is : " + (fnum * snum));                
                break;        
            default:
                System.out.println("Invalid choice...");
                break;
        }

        scanner.close();
    }
}
