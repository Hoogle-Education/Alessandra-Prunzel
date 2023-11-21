import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String line = keyboard.nextLine();

        Scanner input = new Scanner(line);

        System.out.println("line: " + line);

        int a = input.nextInt();
        String operation = input.next();
        int b = input.nextInt();
        boolean equals = input.next().equals("=");

        if(!equals) throw new InputMismatchException("Expected \"=\"");

        int result = switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Unknown operation: " + operation);
        };
    }
}
