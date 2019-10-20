class SavingsAccount
{
	private static double annualInterestRate=0;
	private double savingsBalance;
	
public SavingsAccount (double balance)
{
	savingsBalance=balance;
}
public void calculateMonthlyInterest()
{
	savingsBalance+= savingsBalance * (annualInterestRate/12.0);
}
public static void modifyInterestRate (double newRate)
{
	annualInterestRate = (newRate>=0 && newRate<=1.0)?newRate:0.04;
	
}
public String toString()
{
	return String.format("$%.2f", savingsBalance);
}
}


public class SavingsAccountTest
{
	public static void main(String args[])
	{
		SavingsAccount saver1=new SavingsAccount (2000);
		SavingsAccount saver2=new SavingsAccount (3000);
		SavingsAccount.modifyInterestRate (0.04);
		System.out.println("Monthly balances for one year at 0.04");
		System.out.println("Balances:");
		System.out.printf("%20s%10s\n","saver1","saver2");
		System.out.printf("%-10s%10s%10s\n","Base", saver1.toString(),saver2.toString());
		
	for(int month=1;month<=12;month++)
	{
		String monthLabel = String.format("Month%d:",month);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf("%-10s%10s%10s\n",monthLabel,saver1.toString(),saver2.toString());
	}
		SavingsAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("\nAfter setting interest rate to .05");
		System.out.println("Balances:");
		System.out.printf("%-10s%10s\n","saver1","saver2");
		System.out.printf("%-10s%10s\n",saver1.toString(),saver2.toString());
	}

		
	}
		
		
	}
}