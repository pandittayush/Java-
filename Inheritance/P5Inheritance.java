import java.util.*;

class BankAccount{
    String accountNumber;
    int balance;

public BankAccount(String accountNumber,int balance){
    this.accountNumber=accountNumber;
    this.balance=balance;
}
public void deposite(int amount){
    balance = amount+balance;
}
public void withdraw(int amount){
    if(balance>=amount){
        balance-=amount;        
    }else{
        System.out.println("Insufficient balance.");
    }
}
public int getbalance(){
    return balance;
}
}
class SavingsAccount extends BankAccount{

   public SavingsAccount(String accountNumber, int balance){
    super(accountNumber,balance);
}
    public void withdraw(int amount){
        if((getbalance()-amount)<100){
            System.out.println("Min balace 100 required");
        }else{
            super.withdraw(amount);
        }
    }
}

public class P5Inheritance {
    public static void main(String[] args) {
    BankAccount ba = new BankAccount("BA123", 5000);
    System.out.println("Account number is: "+ba.accountNumber);
    System.out.println(" Balance is: "+ba.balance);
    ba.deposite(3000);
    System.out.println("After deposite the new balance will be: "+ba.getbalance());
    ba.withdraw(4000);
    System.out.println("After withdraw the new balance will be: "+ba.getbalance());

    }
}
