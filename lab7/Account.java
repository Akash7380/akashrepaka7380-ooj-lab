import java.util.Scanner;

class Account
{
	private String name;
	private double account_no;
	private char account_type;
	private double balance;
	
	void getdata(char ch)
	{
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the name of the customer : ");
		name=xx.next();
		xx.nextLine();
		System.out.print("Enter the account number of the customer : ");
		account_no=xx.nextDouble();
		System.out.print("Enter the balance of the customer : ");
		balance=xx.nextDouble();
		account_type=ch;

	}
	void updatebalance(double x)
	{
		balance=balance+x;
	}
	void updatebalance1(double x)
	{
		balance=balance-x;
	}
	double getbalance()
	{
		return balance;
	}
	void displaybalance()
	{
		System.out.println("The balance is : "+balance);
	}
}

class Saving_Account extends Account{
	private double interest_rate;
	Saving_Account()
	{
		Scanner xx=new Scanner(System.in);
		getdata('S');
		System.out.print("Enter the interest rate : ");
		interest_rate=xx.nextDouble();
	}
	
	void getdeposit()
	{
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the amount to be deposited : ");
		double x=xx.nextDouble();
		updatebalance(x);
	}
	void computeinterest()
	{
		double x=(getbalance()*interest_rate)/100;
		updatebalance(x);
		System.out.println("The computed interest is : "+x);
		displaybalance();
	}
	void withdrawl()
	{
		System.out.print("Enter the amount to be withdrawn : ");
		Scanner xx=new Scanner(System.in);
		double x=xx.nextDouble();
		while(x>getbalance())
		{
			System.out.println("The amount withdran is more than the balance enter again : ");
			x=xx.nextDouble();
		}
		updatebalance1(x);
		displaybalance();
	}
}

class Current_Account extends Account{
	private double min_balance;
	private int cheque_book;
	Current_Account()
	{
		Scanner xx=new Scanner(System.in);
		getdata('C');
		System.out.print("Enter the minimum balance : ");
		min_balance=xx.nextDouble();
	}
	
	void getdeposit()
	{
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the amount to be deposited : ");
		double x=xx.nextDouble();
		updatebalance(x);
	}
	void issuecheck()
	{
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the amount of the check : ");
		double x=xx.nextDouble();
		if(x>(getbalance()-min_balance))
		{
			System.out.println("You have issued check of more than the minmum balance and you have been charged the penalty of 100 rupees");
			updatebalance1(100);
		}
		else
		{
			updatebalance1(x);
		}
		displaybalance();
	}
	void withdrawl()
	{
		System.out.print("Enter the amount to be withdrawn : ");
		Scanner xx=new Scanner(System.in);
		double x=xx.nextDouble();
		while(x>(getbalance()-min_balance))
		{
			System.out.println("The amount withdran is more than the balance enter again : ");
			x=xx.nextDouble();
		}
		updatebalance1(x);
		displaybalance();
	}	
}

class AccountMain{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		char ch;
		System.out.println("Ebter the type of account you want (C/S) : ");
		ch=input.next().charAt(0);
		if(ch=='S'||ch=='s')
		{
			Saving_Account s=new Saving_Account();
			int x=1;
			while(x!=0)
			{
				System.out.println("Enter 0 for exit : ");
				System.out.println("Enter 1 for deposit : ");
				System.out.println("Enter 2 for balance enquiry : ");
				System.out.println("Enter 3 to claculate interest : ");
				System.out.println("Enter 4 for withdrawl : ");
				x=input.nextInt();
				if(x==0)
						break;
				else if(x==1)
				{
					s.getdeposit();
				}
				else if(x==2)
				{
					s.displaybalance();
				}
				else if(x==3)
				{
					s.computeinterest();
				}
				else if(x==4)
				{
					s.withdrawl();
				}
			
			}
		}
		else
		{
			Current_Account s=new Current_Account();
			int x=1;
			while(x!=0)
			{
				System.out.println("Enter 0 for exit : ");
				System.out.println("Enter 1 for deposit : ");
				System.out.println("Enter 2 for balance enquiry : ");
				System.out.println("Enter 3 to apply for cheque : ");
				System.out.println("Enter 4 for withdrawl : ");
				x=input.nextInt();
				if(x==0)
						break;
				else if(x==1)
				{
					s.getdeposit();
				}
				else if(x==2)
				{
					s.displaybalance();
				}
				else if(x==3)
				{
					s.issuecheck();
				}
				else if(x==4)
				{
					s.withdrawl();
				}
			
			}
		}
	}
}