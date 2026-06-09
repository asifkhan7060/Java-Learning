package E_OOPsFourPrinciples.D_Abstraction.AbstractClasses.ParentClass;

// Abstract Class

abstract public class BankAccount {

    // Declaring Properties
    private String accountNumber;
    private double balance;

    // abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
