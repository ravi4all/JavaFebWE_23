public class LabeledForLoop {
    public static void main(String[] args) {
        // for(int i = 0; i < 5; i++) {
        //     System.out.println(i);
        // }

        // int arr[] = {3,1,4,7,9};
        // for(int i : arr) {
        //     System.out.println(i);
        // }

        outer:
        for(int i = 0; i < 5; i++) {
            inner:
            for(int j = 0; j < 5; j++) {
                System.out.println(i + "," + j);
                if(i == 2 && j == 2) {
                    break outer;
                }
            }
        }
        

    }
}
