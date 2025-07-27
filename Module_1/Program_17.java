// 17. Write a program to identify valid and invalid identifiers in Java.
public class Program_17 {
    public static void main(String[] args) {
        int validIdentifier = 10;
        int _anotherValid = 20;
        int $alsoValid = 30;
        // int 1invalid; // ERROR: Cannot start with a digit.
        // int my-var; // ERROR: Hyphen not allowed.
        // int my@var = 40; // Syntax error on token "@",
        // var cannot be resolved to a variable
        int my$var = 40; // Syntax error on token "$", ; expected
        // int my!var = 50; // Syntax error on token "!", ; expected
        // int my#var = 50; // Syntax error on token "Invalid Character",
        // var cannot be resolved to a variable
        // int my^var = 50; // var cannot be resolved to a variable
        // int my&var = 50; // Syntax error on token "&",
        // var cannot be resolved to a variable
        // int my*var = 50; // Syntax error on token "*",
        // var cannot be resolved to a variable
        // int my(var) = 50; // Syntax error on token "(",
        // var cannot be resolved to a variable
        // int my[0] = 50; // Syntax error on token "[",
        // var cannot be resolved to a variable
        // int my(0) = 50; // Syntax error, insert ";" to complete
        // LocalVariableDeclarationStatementJava(1610612976)
        // The left-hand side of an assignment must be a variable

        System.out.println("The valid names are : ");
        System.out.println("validIdentifier");
        System.out.println("_anotherValid");
        System.out.println("$alsoValid");
        System.out.println("my$var");

    }
}