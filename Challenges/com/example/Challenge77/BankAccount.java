package com.example.Challenge77;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

    }

    public void depositMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid Deposit ");
        } else {

            balance += money;
            System.out.println("Deposit Sucsessfull "+ money);
        }
    }

    public void withdrawMoney(double money){
        if ( balance>=money && money >0) {
             balance -= money;
            System.out.println("Withdraw successfull " + money);
        } else if (money > balance) {
            System.out.println("Incaficient Balance , Please Deposit Money ");

        } else if (money <= 0) {
            System.out.println("Invalid withdraw");

        }
        else {
            money = balance;
            balance = 0;
        }

    }
}











