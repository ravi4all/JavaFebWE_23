public class Overloading {

    void area(int w, int h) {
        // calculate area of rectangle
    }

    void area(float r) {
        // calculate area of circle
    }

    void area(int s) {
        // calculate area of square
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        // obj.area(5,6);
        obj.area(40);
        // obj.area(45.75f);
    }
}
