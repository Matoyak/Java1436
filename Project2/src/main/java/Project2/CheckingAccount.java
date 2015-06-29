package Project2;

import javax.swing.*;

/**
 * Project2 of Project2
 * Created by Mason Matlock on 6/29/2015.
 */
public class CheckingAccount {
    private double balance;
    private double interest;
    private String accountName;

    //Constructors
    CheckingAccount() {
        balance = 0.0;
        interest = 0.0;
        accountName = "Jane Doe";
    }

    CheckingAccount(double num, double num2, String name) {
        balance = num;
        interest = num2;
        accountName = name;
    }

    public void deposit(double num) {
        balance += num;
    }

    public void withdraw(double num) {
        if (num > balance) {
            JOptionPane.showMessageDialog(null, "You do not have enough money to do this withdrawal.");
        } else {
            balance -= num;
        }
    }

    //getters and setters
    public void setBalance(double num) {balance = num;}

    public double getBalance() {return balance;}

    public void setInterest(double num) {interest = num;}

    public double getInterest() {return interest;}

    public void setAccountName(String name) {accountName = name;}

    public String getAccountName() {return accountName;}
}
