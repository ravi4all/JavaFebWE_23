package BackUp;

public class StudentCaller {
    public static void main(String[] args) {
        // will call default const...
        // StudentData obj = new StudentData();

        // will call param const...
        StudentData obj = new StudentData(101, "Ram", 70.00);
        // obj.takeInput(101, "Ram", 70.00);
        obj.showDetails();

        StudentData obj_2 = new StudentData(102, "Shyam", 78.88);
        // obj_2.takeInput(102, "Shyam", 78.88);
        obj_2.showDetails();
    }
}
