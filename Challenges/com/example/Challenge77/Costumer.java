package com.example.Challenge77;

public class Costumer {
    public static void main(String[] args) {
        BankAccount costumer1 = new BankAccount("45545252562455","Vikash Raw");
        costumer1.depositMoney(500);
       costumer1.withdrawMoney(500);
       costumer1.withdrawMoney(0);
    }
}
