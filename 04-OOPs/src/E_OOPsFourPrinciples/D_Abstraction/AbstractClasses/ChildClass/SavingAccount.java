package E_OOPsFourPrinciples.D_Abstraction.AbstractClasses.ChildClass;

import E_OOPsFourPrinciples.D_Abstraction.AbstractClasses.ParentClass.BankAccount;

public class SavingAccount extends BankAccount {

    // Constructor to take values and pass it to Parent Constructor (Compulsory to implement otherwise error)
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Compulsory OverRide (otherwise error) : because it is abstract methods

    @Override
    public void deposit(double amount) {
        System.out.println("Deposited Saving: "+amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawn Saving "+amount);
    }
}
