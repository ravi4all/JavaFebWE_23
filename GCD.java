public class GCD {
    public static void main(String[] args) {
        int x = 28, y = 96;
        int min = Math.min(x, y);
        for(int i = min; i >= 0; i--) {
            if(x % i == 0 && y % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
