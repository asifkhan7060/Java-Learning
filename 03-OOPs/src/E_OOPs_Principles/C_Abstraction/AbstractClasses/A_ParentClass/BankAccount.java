package E_OOPs_Principles.C_Abstraction.AbstractClasses.A_ParentClass;

// Go through Intro.md and understand what is Abstraction and more about it and then visit here !!!

// Abstract class can define instance variables, static/final members, constructors, concrete methods, abstract methods, and nested classes/interfaces.

// NOTE : We cannot create objects of abstact class

abstract public class BankAccount {

    // Declaring Properties
    private String accountNumber;
    private double balance;

    // Constructor - 2 parameter
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Constructor - 1 parameter
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // abstract methods (Just implement template it will be further defined in child classes)
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Other than abstract method normal method (concrete methods) can also implement in abstract class
    public void balance(){
        System.out.println("Balance Printed");
    }

    // getters and setters

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
