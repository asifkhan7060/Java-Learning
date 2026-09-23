package E_OOPs_Principles.C_Abstraction.AbstractClasses.B_ChildClass;

import E_OOPs_Principles.C_Abstraction.AbstractClasses.A_ParentClass.BankAccount;

public class A_SavingAccount extends BankAccount {

    // It take values and pass it to Parent Constructor (Compulsory to implement otherwise error)
    public A_SavingAccount(String accountNumber, double balance) {
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
