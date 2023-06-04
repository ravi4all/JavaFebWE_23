// abstract classes are mainly used for data abstraction
// we cannot create object of abstract class
// we create abstract class for inheritance purpose only
// abstract classes are not 100% abstract because they contain concrete methods
abstract class Character {
    String name;
    String category;
    void walk() {
        System.out.println("Character Walk");
    }
    void run() {
        System.out.println("Character Run");
    }
    // abstract methods can be defined only inside abstract class
    // abstract class can have normal as well as abstract methods
    // we create abstract methods for providing standardization
    // there is no body for abstract methods
    abstract void jump();
}

class Tom extends Character {

    @Override
    void jump() {
        
    }
    
}

class Jerry extends Character {
    void jump() {
        
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // Character ch = new Character();
    }
}
