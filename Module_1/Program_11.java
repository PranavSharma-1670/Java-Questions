// 11. Write a program that uses Java's StringBuilder for efficient string operations.
public class Program_11 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb);
        sb.insert(5, ", Java");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb.toString());
    }
}