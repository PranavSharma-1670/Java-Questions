// 45. Write a program to demonstrate final classes and methods.
final class FinalClass {
} // Cannot be subclassed

class BaseWithFinal {
    final void show() {
    }
} // Cannot be overridden

// class Cal extends FinalClass{
// // Error: cannot inherit from final 'FinalClass'
// public void print(){
// System.out.println("_");
// }
// }

// class Cal extends BaseWithFinal {
// // Error: cannot override the final method from Base
// public void show() {
// System.out.println("_");
// }
// }

public class Program_45 {
    public static void main(String[] args) {
        System.out.println("Final demo.");
    }
}