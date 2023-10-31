package service;

public class GermanyTaxService implements TaxService {

    public double calculateTax(double amount) {
        return 0.14*amount;
    }

}
