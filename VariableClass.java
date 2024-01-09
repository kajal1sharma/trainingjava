// two types of variables => refernce variable , primitive
// three categories in which these variable can lie =>
// instance, static,local variable (no initialization is done for local ) 

// ins
class Account{
    static String bank="sbi";
    String name;
    int accountNumber=71267;
    int pin;
    boolean isAccount;
    //...
}

public class VariableClass {
    public static void main(String[] args) {
        // only one copy is created for statric variables
        // static variables resides in method area 
        // static variable are created at the time of class loading
        System.out.println(Account.bank);
        Account.bank ="pnb";
         System.out.println(Account.bank);
        Account acc1= new Account();
        System.out.println(acc1.bank);
        Account acc2 = new Account();
        acc2.bank="xyz";
        Account acc3 = new Account();
        System.out.println(acc3.bank);
        // local variable is defined inside a function

        // refernce variable , primitive
        // Account ref =null;
        // System.out.println(ref);
        // int a=90;
        // a=a+10;
        // System.out.println(a);

        // Account obj1 = new Account();
        // System.out.println(obj1.bank);
        // System.out.println(obj1.accountNumber);
        // System.out.println(obj1.isAccount);
        // Account obj2 = new Account();
    }
}
