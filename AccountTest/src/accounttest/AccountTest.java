/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package accounttest;

import java.util.Date;
import java.text.DecimalFormat;

public class AccountTest {

    public static void main(String[] args) 
    {
       
        Account myAccount = new Account(1122, 20000.00, 4.5); 
        myAccount.withdraw(2500.00); 
        myAccount.deposit(3000.00); 
        myAccount.getAnnualInterestRate(4.5); 
         
        DecimalFormat dollar = new DecimalFormat("##,###.00"); 

        System.out.println("Balance: $" + dollar.format(myAccount.getBalance())); 
        System.out.println("Monthly Interest: $" + dollar.format(myAccount.getMonthlyInterest()));
 
        System.out.println("Account Created on: " + myAccount.getDateCreated().toString( ));
    }
class Account 
{ 

    private int id; 
    private double balance; 
    private double annualInterestRate; 
    private Date dateCreated;
    double interest;

    public Account() 
    { 
        id = 100; 
        balance = 0; 
        annualInterestRate = 0.0;   
    } 

    public Account (int newId, double newBalance, double newAnnualInterestRate) 
    { 
        id = newId; 
        balance = newBalance; 
        annualInterestRate = newAnnualInterestRate; 
    } 

    public int getId() 
    { 
        return id; 
    } 

    public double getBalance() 
    { 
        return balance; 
    } 

    public double getAnnualInterestRate(double newAnnualInterestRate) 
    { 
        return annualInterestRate = newAnnualInterestRate; 
    } 

    public Date getDateCreated() 
    { 
        return dateCreated = new Date(); 
    } 

    double getMonthlyInterest() 
    { 
        return interest = balance * (annualInterestRate/100 *12); 
    } 

    double withdraw(double amount) 
    { 
        return balance -= amount; 
    } 

    double deposit(double amount) 
    { 
        return balance += amount; 
    } 
  }    
}
