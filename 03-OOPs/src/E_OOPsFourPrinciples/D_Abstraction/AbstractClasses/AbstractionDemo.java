package E_OOPsFourPrinciples.D_Abstraction.AbstractClasses;

import E_OOPsFourPrinciples.D_Abstraction.AbstractClasses.ChildClass.CurrentAccount;
import E_OOPsFourPrinciples.D_Abstraction.AbstractClasses.ChildClass.SavingAccount;
import E_OOPsFourPrinciples.D_Abstraction.AbstractClasses.ParentClass.BankAccount;

public class AbstractionDemo {
    public static void main(String[] args) {

        // BankAccount bankAccount = new BankAccount() {} Cannot implemented as We cannot create objects of abstact class
        // NOTE : BankAccount is reference type and bankAccount is reference and new BankAccount() is a part of object creation

        // Let's create Object of Child Class and use Parent Class as a template extraction and storing values
        SavingAccount savingAccount = new SavingAccount("892766423",6000);
        savingAccount.deposit(5000);
        System.out.println(savingAccount.getAccountNumber());
        System.out.println(savingAccount.getBalance());

        System.out.println();

        // Polymorphism concept is used
        BankAccount savingAccount1 = new SavingAccount("09877890",870); // NOTE : Reference Type as Parent class can be used but new BankAccount cant be used
        savingAccount1.deposit(900);

        // savingAccount1 declared as reference of Parent Class type now can further be used without it and new Child Class object can be created within same instance name
        savingAccount1 = new CurrentAccount("2313254",3400);
        System.out.println(savingAccount1.getAccountNumber());
        savingAccount1 = new CurrentAccount("90219021",1000);
        System.out.println(savingAccount1.getAccountNumber());
        savingAccount1.deposit(1230);

        System.out.println();

        // Another Object of saving account
        BankAccount savingAccount2 = new SavingAccount("98367934",890); // BankAccount savingAccount2 or SavingAccount savingAccount2 no problem further implementation is same
        System.out.println(savingAccount2.getAccountNumber());
    }
}
