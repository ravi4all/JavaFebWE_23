import java.util.ArrayList;
import java.util.Date;

class Task {
    String name;
    String desc;
    Date date;
}

public class ArrayListDemo {
    public static void main(String[] args) {
        Task t1 = new Task();
        ArrayList<Task> list = new ArrayList<>();
        list.add(t1);
    }
}
