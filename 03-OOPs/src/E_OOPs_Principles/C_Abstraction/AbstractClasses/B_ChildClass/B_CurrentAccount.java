package E_OOPs_Principles.C_Abstraction.AbstractClasses.B_ChildClass;

import E_OOPs_Principles.C_Abstraction.AbstractClasses.A_ParentClass.BankAccount;

public class B_CurrentAccount extends BankAccount {

    // Constructor
    public B_CurrentAccount(String accountNumber, double balance) {
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
