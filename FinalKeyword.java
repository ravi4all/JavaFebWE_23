/*
* final keyword
* we can use final keyword with
*  - class - we cannot inherit final class
*  - variable - we cannot change value of final variable
*  - method - we cannot override final method
*/

//  final class X1 {
    
//  }

class X1 {
    final void show() {

    }
}

class Y1 extends X1 {
    // @Override
    // void show() {
        
    // }
}

public class FinalKeyword {
    public static void main(String[] args) {
        final double PI = 3.14;
        // Math.PI = 3.15;
    }
}
