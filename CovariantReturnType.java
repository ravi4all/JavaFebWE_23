class Shape {

}

class Area extends Shape {

}

class Box {
    Shape calculate() {
        Shape obj = new Shape();
        return obj;
    }
}

class Square extends Box {
    @Override
    Area calculate() {
        Area obj = new Area();
        return obj;
    }
}

public class CovariantReturnType {
    public static void main(String[] args) {
        
    }
}
