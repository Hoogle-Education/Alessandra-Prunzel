/**
 * This code should contain your Supervisor class declaration, constructor and method.
 * A Supervisor is an employee who also receives a bonus.
 * You must implement the bi-weekly pay for the employee according to instructions provided.
 */

// TO DO: TASK 1 - YOUR CODE FOR THE CLASS GOES HERE
// Declare the class and any variable

public class Supervisors extends Employees {

    private double bonus;

    /**
     * TO DO: TASK 2 - Constructs a supervisor with a given name, annual pay and bi-weekly bonus.
     *
     * @param name  the name of this employee
     * @param pay   the annual pay
     * @param bonus the bi-weekly bonus
     */
    // YOUR Constructor code goes here!!!
    public Supervisors(String name, double pay, double bonus) {
        super(name, pay);
        this.bonus = bonus;
    }

    // TO DO: TASK 3 - YOUR CODE FOR COMPUTING THE BI-WEEKLY PAY FOR THIS CATEGORY OF MILLER GOES HERE.
    // Hint: Note the relationship between this class and any other class. How will you apply that to your code?
    public double biWeeklyPay(int hoursWorked) {
        double basicPayment = super.biWeeklyPay(hoursWorked);
        double pay = basicPayment + bonus;
        return pay;
    }
}


