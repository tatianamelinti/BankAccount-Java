import java.util.Scanner;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name=name;
        if(balance>0.0) { this.balance = balance; }
    }
    public void setName(){ this.name=name;}
    public String getName(){return  name;}

    public double getBalance(){return balance;}


    public void deposit(double depositAmount){
        if(depositAmount>0.0) { balance += depositAmount; }
    }

    public void withdrawal(double withdraw){
        if(withdraw<balance){balance-=withdraw;}
        else{
            System.out.println("ERROR! Withdrawal amount exceeded account balance!"); }
    }


    public static void displayAccount(Account accountToDisplay){
        Scanner input = new Scanner(System.in);

        System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
        System.out.println("Enter deposit amount for this account: " );
        double depositAmount = input.nextDouble();
        System.out.printf("%nAdding %.2f to account balance%n%n", depositAmount);
        accountToDisplay.deposit(depositAmount);
        System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(),accountToDisplay.getBalance() );
        System.out.println("Enter withdrawal amount for account: ");
        double withdraw = input.nextDouble();
        System.out.println("Withdrawing " +withdraw+" from account balance");
        accountToDisplay.withdrawal(withdraw);
        System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(),accountToDisplay.getBalance() );
    }
}
