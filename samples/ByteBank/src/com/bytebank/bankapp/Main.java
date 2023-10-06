package com.bytebank.bankapp;

import com.bytebank.bankapp.model.Account;

public class Main {
    public static void main(String[] args) {
        Account acc =   new Account(1L, "John Smith");

        acc.deposit(200);
        acc.deposit(125);

        acc.withdraw(250);

        acc.deposit(500);
        acc.withdraw(600);

        System.out.println(acc);
    }
}