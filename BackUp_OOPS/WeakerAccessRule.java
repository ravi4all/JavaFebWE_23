class User {
    void show() {
        System.out.println("Show...");
    }
}

class PrimeUser extends User {
    @Override
    protected void show() {
        System.out.println("Show...");
    }
}

public class WeakerAccessRule {
    public static void main(String[] args) {
        
    }
}
