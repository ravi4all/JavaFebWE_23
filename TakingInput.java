import java.io.IOException;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your name : ");
        // reads one byte at a time
        // returns int (ASCII) of any input
        int name = System.in.read();
        System.out.println(name);
        // Scanner
    }
}
