package E_OOPsFourPrinciples.D_Abstraction.AbstractClasses.ParentClass;

// Parent Class

// Abstract Class : Defines properties,abstract methods,setter and getter (Constructor usually not defined but created sometime so that child can access it)

// NOTE : We cannot create objects of abstact class, but we can implement constructor so child can call it and object can be created of it.

abstract public class BankAccount {

    // Declaring Properties
    private String accountNumber;
    private double balance;

    // abstract methods (Just implement template defined in child classes)
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Other than abstract method normal method can also implement in abstract class
    public void balance(){
        System.out.println("Balance Printed");
    }


    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

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
