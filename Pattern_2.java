public class Pattern_2 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        for(int i = 0; i < rows; i++)  {
            for(int j = 0 ; j < cols; j++) {
                if(i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print('*');
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
