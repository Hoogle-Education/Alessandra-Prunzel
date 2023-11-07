/**
 * This class represents the employee. An employee is paid the same (particular) amount regardless of the hours (additional) the employee worked.
 */
// TO DO: TASK 1 - DECLARE YOUR CLASS AND ANY VARIABLES HERE.

public class Employees extends Millers {

    private double annualPay;

    private static final double WEEKS_IN_YEAR = 52.0;

    /**
     * Constructs an employee with a given name and an annual pay.
     *
     * @param name the name of this employee
     * @param pay  the annual pay of the employee
     */
    public Employees(String name, double pay) {
        setName(name);
        annualPay = pay;
    }

    // TO DO: TASK - This portion of your code computes the pay for this category of miller.
    // YOUR CODE GOES IN HERE.
    public double biWeeklyPay(int hoursWorked) {
        double weeklyPay = annualPay / WEEKS_IN_YEAR;
        double pay = 2 * weeklyPay;

        return pay;
    }
}

