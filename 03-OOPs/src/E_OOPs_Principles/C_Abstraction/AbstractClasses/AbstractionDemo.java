package E_OOPs_Principles.C_Abstraction.AbstractClasses;

import E_OOPs_Principles.C_Abstraction.AbstractClasses.B_ChildClass.B_CurrentAccount;
import E_OOPs_Principles.C_Abstraction.AbstractClasses.B_ChildClass.A_SavingAccount;
import E_OOPs_Principles.C_Abstraction.AbstractClasses.A_ParentClass.BankAccount;

// A normal parent class can be instantiated.
// Interfaces (multiple Inheritance) and abstract classes cannot be instantiated directly.

public class AbstractionDemo {
    public static void main(String[] args) {

        // BankAccount bankAccount = new BankAccount() {} Cannot implemented as We cannot create objects of abstact class

        A_SavingAccount savingAccount = new A_SavingAccount("892766423",6000);
        savingAccount.deposit(5000);
        System.out.println(savingAccount.getAccountNumber());
        System.out.println(savingAccount.getBalance());

        System.out.println();

        // Another Object of saving account (Taking reference type of Parent)
        BankAccount savingAccount1 = new A_SavingAccount("98367934",890); // BankAccount savingAccount2 or SavingAccount savingAccount2 both implementation are same
        savingAccount1.deposit(5000);
        System.out.println(savingAccount1.getAccountNumber());
        System.out.println(savingAccount1.getBalance());

        System.out.println();


        // Polymorphism: A Parent class reference can refer to different Child class objects.
        // The same reference can be reused to point to different Child objects.

        BankAccount anotherSavingAccount = new A_SavingAccount("09877890", 870);
        // BankAccount → Parent reference
        // A_SavingAccount → Child object
        // We cannot use new BankAccount(...) because BankAccount is an abstract class.

        anotherSavingAccount.deposit(900);

        // The same Parent reference now points to a different Child object.
        anotherSavingAccount = new B_CurrentAccount("2313254", 3400);
        System.out.println(anotherSavingAccount.getAccountNumber());

        // The same reference can be reassigned again to another Child object.
        anotherSavingAccount = new B_CurrentAccount("90219021", 1000);
        System.out.println(anotherSavingAccount.getAccountNumber());

        anotherSavingAccount.deposit(1230);

    }
}
