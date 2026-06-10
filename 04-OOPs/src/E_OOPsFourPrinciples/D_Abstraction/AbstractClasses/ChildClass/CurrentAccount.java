package E_OOPsFourPrinciples.D_Abstraction.AbstractClasses.ChildClass;

import E_OOPsFourPrinciples.D_Abstraction.AbstractClasses.ParentClass.BankAccount;

public class CurrentAccount extends BankAccount {

    // Constructor
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // OverRiding abstract methods

    @Override
    public void deposit(double amount) {
        System.out.println("Deposited Current: "+amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdraw Current "+amount);
    }
}
