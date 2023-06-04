interface IPlayer {
    void walk();        // internally - public abstract void walk();
    void run();
    void jump();
    void kick();
    void punch();
    int SPEED = 10;     // internally - public final int SPEED = 10;
}

abstract class CommonFunctionality implements IPlayer {
    @Override
    public void walk() {
        
    }

    @Override
    public void run() {
        
    }

    @Override
    public void jump() {
        
    }
}

class King extends CommonFunctionality implements IPlayer {

    @Override
    public void kick() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kick'");
    }

    @Override
    public void punch() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'punch'");
    }

}

class Paul extends CommonFunctionality implements IPlayer {

    @Override
    public void kick() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kick'");
    }

    @Override
    public void punch() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'punch'");
    }

}

public class InterfaceDemo {
    public static void main(String[] args) {
        
    }
}
