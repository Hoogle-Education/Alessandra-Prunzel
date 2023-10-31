package service;

public class BrazilTaxService implements TaxService{

    public double calculateTax(double amount) {
        if(amount > 100.0)
            return 0.15*amount;

        return 0.20*amount;
    }

}
