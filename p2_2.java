// 2.. Write a BankAccount class with the following properties: accountNumber, balance, 
// and owner. Implement methods to deposit, withdraw, and check the account balance.
import java.util.Scanner;
class BankAccount{
    private String accountNumber;
    private double balance;
    private String owner;
    public BankAccount(String owner, String accountNumber, double balance)
    {
        this.owner=owner;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the amount you want to deposit :: ");
        double add=s.nextDouble();
        this.balance=this.balance+add;
        System.out.println(add + " added to your account.\ncurrent balance :: "+this.balance);
    }
    public void withdraw()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the amount you want to withdraw :: ");
        double withdraw=s.nextDouble();
        if(this.balance<withdraw)
        {
        System.out.println("insufficient balance.");
        return;
        }
        this.balance=this.balance-withdraw;
        System.out.println(withdraw + " is withdrawn from your account.\ncurrent balance :: "+this.balance);
    }
    public void balance()
    {
        System.out.println("owner :: "+this.owner);
        System.out.println("accountNumber :: "+this.accountNumber);
        System.out.println("balance :: "+this.balance);
    }
}
class implimentation{
    public static void main (String args[])
    {
        BankAccount b=new BankAccount("ritika","67780302",3330);
        b.balance();
        b.deposit();
        b.balance();
        b.withdraw();
        b.balance();
    }
}
//output :: 
// PS C:\ritika\sem 5\java> javac p2_2.java    
// PS C:\ritika\sem 5\java> java implimentation
// owner :: ritika
// accountNumber :: 67780302
// balance :: 3330.0
// enter the amount you want to deposit :: 30
// 30.0 added to your account.
// current balance :: 3360.0
// owner :: ritika
// accountNumber :: 67780302
// balance :: 3360.0
// enter the amount you want to withdraw :: 360
// 360.0 is withdrawn from your account.
// current balance :: 3000.0
// owner :: ritika
// accountNumber :: 67780302
// balance :: 3000.0