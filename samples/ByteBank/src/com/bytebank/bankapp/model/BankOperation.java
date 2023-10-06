package com.bytebank.bankapp.model;

public class BankOperation {

    private String type;
    private double amount;

    public BankOperation(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Operation : " + type
                + " -> amount = $"
                + String.format("%.2f", amount);
    }
}
