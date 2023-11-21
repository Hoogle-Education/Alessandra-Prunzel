public class CalculatorInputTest {

    public static void main(String[] args) {
        CalculatorInput calculatorInput = null;

        try {
            calculatorInput = CalculatorInput.readInput();
            System.out.println(calculatorInput.getNum1());
        } catch (MissingEqualsSignException e) {
            System.err.println(e.getMessage());
        } catch (InvalidOperatorSignException e) {
            System.err.println(e.getMessage());
        }

    }
}
