public class ForLoopDemo {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int arr[] = {1,2,3,4,5};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for(int i : arr) {
            System.out.println(i);
        }

        String name = "Ram Sharma";
        for(int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}
