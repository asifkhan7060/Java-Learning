package B_OOPs_Principles.C_Abstraction.AbstractClasses;

import B_OOPs_Principles.C_Abstraction.AbstractClasses.B_ChildClass.B_CurrentAccount;
import B_OOPs_Principles.C_Abstraction.AbstractClasses.B_ChildClass.A_SavingAccount;
import B_OOPs_Principles.C_Abstraction.AbstractClasses.A_ParentClass.BankAccount;

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

        // Another Object of saving account
        // Parent reference refers to a Child object - This is called Upcasting.
        BankAccount savingAccount1 = new A_SavingAccount("98367934",890); // BankAccount savingAccount2 or SavingAccount savingAccount2 both implementation are same
        savingAccount1.deposit(5000);
        System.out.println(savingAccount1.getAccountNumber());
        System.out.println(savingAccount1.getBalance());

        System.out.println();



        // Parent reference refers to a Child object.
        // This is called Upcasting.
        BankAccount anotherSavingAccount = new A_SavingAccount("09877890", 870);

        // BankAccount → Parent reference
        // A_SavingAccount → Actual Child object
        // BankAccount is abstract, so its object cannot be created directly.

        anotherSavingAccount.deposit(900);

        // The same Parent reference now refers to a different Child object.
        // This is also Upcasting.
        anotherSavingAccount = new B_CurrentAccount("2313254", 3400);

        System.out.println(anotherSavingAccount.getAccountNumber());

        // The same reference can be reused again for another Child object.
        anotherSavingAccount = new B_CurrentAccount("90219021", 1000);

        System.out.println(anotherSavingAccount.getAccountNumber());

        anotherSavingAccount.deposit(1230);

    }
}
