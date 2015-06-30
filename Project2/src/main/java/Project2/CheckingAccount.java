package Project2;

import javax.swing.*;

/**
 * Project2 of Project2
 * Created by Mason Matlock on 6/29/2015.
 */
public class CheckingAccount {
    private double balance;
    private double interest;
    private double penalty;
    private String accountName;

    //Constructors
    CheckingAccount() {
        balance = 200.0;
        interest = 0.3;
        penalty = 0.2;
        accountName = "Jane Doe";
    }

    CheckingAccount(double num, double num2, double num3, String name) {
        balance = num;
        interest = num2;
        penalty = num3;
        accountName = name;
    }

    public void deposit(double num) {balance += num;}

    public void withdraw(double num) {
        if (num > balance) {
            JOptionPane.showMessageDialog(null, "You do not have enough money to do this withdrawal.\n"
                    + "There will be a " + penalty * 100 + "percent penalty for over-withdrawal.");
        } else {
            balance -= num;
        }
    }

    //getters and setters
    public void setBalance(double num) {balance = num;}

    public double getBalance() {return balance;}

    public void setInterest(double num) {interest = num;}

    public double getInterest() {return interest;}

    public void setPenalty(double num) {penalty = num;}

    public double getPenalty() {return penalty;}

    public void setAccountName(String name) {accountName = name;}

    public String getAccountName() {return accountName;}
}
