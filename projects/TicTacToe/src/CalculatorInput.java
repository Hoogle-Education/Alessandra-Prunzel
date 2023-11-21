import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CalculatorInput {

    Scanner keyboard = new Scanner(System.in);
    Scanner input;
    int num1, num2;
    String sign, equals, buffer;

//    static CalculatorInput instance;
//
//    private CalculatorInput() {}
//
//    public static CalculatorInput getInstance() throws MissingEqualsSignException {
//        if(instance != null)
//            return instance;
//
//        instance = new CalculatorInput();
//        instance.buffer = instance.keyboard.nextLine();
//        instance.input = new Scanner(instance.buffer);
//        instance.num1 = instance.input.nextInt();
//        instance.sign = instance.input.next();
//        instance.num2 = instance.input.nextInt();
//        instance.equals = instance.input.next();
//
//        if(instance.equals == null || !instance.equals.equals("="))
//            throw new MissingEqualsSignException();
//
//        return instance;
//    }

    public static CalculatorInput readInput() throws MissingEqualsSignException, InvalidOperatorSignException {
        CalculatorInput calculatorInput = new CalculatorInput();
        calculatorInput.buffer = calculatorInput.keyboard.nextLine();
        calculatorInput.input = new Scanner(calculatorInput.buffer);
        calculatorInput.num1 = calculatorInput.input.nextInt();
        calculatorInput.sign = calculatorInput.input.next();
        calculatorInput.num2 = calculatorInput.input.nextInt();
        calculatorInput.equals = calculatorInput.input.next();

        if(calculatorInput.equals == null || !calculatorInput.equals.equals("="))
            throw new MissingEqualsSignException();

        if(!calculatorInput.sign.equals("+") && !calculatorInput.sign.equals("-") && !calculatorInput.sign.equals("*") && !calculatorInput.sign.equals("/"))
            throw new InvalidOperatorSignException();

        return calculatorInput;
    }

    public int getNum1() {
        return num1;
    }

}
