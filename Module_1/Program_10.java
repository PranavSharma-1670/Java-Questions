// 10. Show an example of the final keyword for variables, methods, and classes.
final class FinalClass {
} // Cannot be subclassed

class Base {
    final void finalMethod() {
    } // Cannot be overridden
}

// class Cal extends FinalClass{
// // Error: cannot inherit from final 'FinalClass'
// public void print(){
// System.out.println("_");
// }
// }

// class Cal extends Base {
// // Error: cannot override the final method from Base
// public void finalMethod() {
// System.out.println("_");
// }
// }

public class Program_10 {
    public static void main(String[] args) {
        final double PI = 3.14159; // A constant
        System.out.println("Final variable PI: " + PI);
    }
}