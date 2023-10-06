package com.bytebank.bankapp.model;

import java.util.Arrays;

public class Account {
    private long id;
    private String holder;
    private double balance;
    private BankOperation[] bankOperations = new BankOperation[100000];
    private int lastOperationIndex = 0;

    public Account(long id, String holder) {
        this.id = id;
        this.holder = holder;
    }

    public long getId() {
        return id;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public BankOperation[] getBankOperations() {
        return bankOperations;
    }

    public void deposit(double amount) {
        balance += amount;
        bankOperations[lastOperationIndex] = new BankOperation("INCOME", amount);
        lastOperationIndex++;
    }

    public void withdraw (double amount) {
        if( balance >= amount ) {
            balance -= amount;
            bankOperations[lastOperationIndex] = new BankOperation("OUTCOME", amount);
        } else {
            bankOperations[lastOperationIndex] = new BankOperation("FAILED WITHDRAW", amount);
        }

        lastOperationIndex++;
    }

    public void transfer() { // TODO
    }

    @Override
    public String toString() {
        String aux = "";

        aux += "Id: " + id
                + ", Holder: " + holder
                + ", balance: $" + String.format("%.2f", balance) + "\n";

        aux += "Bank operations: \n";

        for (int i = 0; i < lastOperationIndex; i++) {
            aux += bankOperations[i].toString() + "\n";
        }

        aux += "---------------------------------\n";

        return aux;
    }
}
