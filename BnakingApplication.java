package BankingSystem;
import java.util.*;
public class BnakingApplication 
{
public static void main(String args[])
{
	BankAccount obj1 = new BankAccount("MRS.BINITA BHATT", "HOUSEWIFE");
	obj1.showMenu();
}
}

class BankAccount
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
     BankAccount(String cname, String cid)
	{
    	 customerName = cname;
    	 customerId = cid;
		
	}
	void deposit(int amount)
	{
		if(amount != 0)
		{
			balance = balance + amount;
			previousTransaction = amount;
		}
		
	}
	void withdraw(int amount)
	{
		if(amount!=0)
		{
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	void getpreviousTransaction()
	{
		if(previousTransaction > 0)
		{
			System.out.println("Deposited : "+previousTransaction);
		}
		if(previousTransaction < 0)
		{
			System.out.println("Withdraw : "+Math.abs(previousTransaction));
		}
		else 
		{
			System.out.println("No Transaction occured");
		}
	}
	void showMenu()
	{
		char option='\0';
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome "+customerName);
		System.out.println("your Id"+customerId);
		System.out.println("\n");
		System.out.println("A. Check_Amount");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous_Transaction");
		System.out.println("E. Exit");
		
		do
		{
			System.out.println("=================================");
			System.out.println("Enter an Option");
			System.out.println("=================================");
			option = sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				System.out.println("===============");
				System.out.println("Balance =:"+balance);
				System.out.println("================");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("================");
				System.out.println("Enter the amount to Deposit = :");
				System.out.println("================");
				int amount= sc.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
			
			case 'C':
				System.out.println("=======");
				System.out.println("Enter the amount you want to withdraw");
				System.out.println("=======");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("=======");
				
				getpreviousTransaction();
				
				System.out.println("=======");
				System.out.println("\n");
				break;
				
				case 'E':
					System.out.println("****************************");
				break;
				
				default:
					System.out.println("Invalid");
					break;
			}
			
		 }
		while(option != 'E');
		System.out.println("ThankYOU");
	}
}
