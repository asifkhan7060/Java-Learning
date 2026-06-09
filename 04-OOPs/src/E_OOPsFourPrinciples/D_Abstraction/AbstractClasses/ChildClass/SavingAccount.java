package E_OOPsFourPrinciples.D_Abstraction.AbstractClasses.ChildClass;

import E_OOPsFourPrinciples.D_Abstraction.AbstractClasses.ParentClass.BankAccount;

public class SavingAccount extends BankAccount {

    @Override
    public void deposit(double amount) {
        System.out.println("Deposited");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawn");
    }
}
