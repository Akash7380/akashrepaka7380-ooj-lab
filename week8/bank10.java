/*10.Develop a Java program to create a class Bank that maintains two kinds of account for its customers, 
one called savings account and the other current account. The savings account provides compound interest 
and withdrawal facilities but no cheque book facility. The current account provides cheque book facility 
but no interest. Current account holders should also maintain a minimum balance and if the balance falls 
below this level, a service charge is imposed. Create a class Account that stores customer name, account 
number and type of account. From this derive the classes Curr-acct and Sav-acct to make them more specific
 to their requirements. Include the necessary methods in order to achieve the following tasks: a) Accept 
deposit from customer and update the balance. b) Display the balance. c) Compute and deposit interest d) 
Permit withdrawal and update the balance 
Check for the minimum balance, impose penalty if necessary and update the balance.*/

import java.util.*;
import java.lang.*;

class Account{
	String name="";
	String acc_no="";
	String type = "";
}

class CurrAct extends Account{
	
	double balance = 0;
	Scanner vs = new Scanner(System.in);
	
	void getdata(){
		System.out.println("NAME:\n");
		name = vs.nextLine();
		System.out.println("ACCOUNT NUMBER:\n");
		acc_no = vs.nextLine();
	}
	

	void deposit(){
		System.out.println("DEPOSIT = ");
		double dep = vs.nextDouble();
		balance+= dep;
		System.out.println("NEW BALANCE = "+balance);
	}
	
	void display(){
		System.out.println("Your CURRENT BALANCE is "+ balance);
	}
	
	void intrest(){
		System.out.println("NO INTEREST AVAILABE FOR CURRENT DEPOSIT");
	}
	
	void withdraw(){
		if(balance>500){
			System.out.println("WITHDRAW AMOUNT:\n");
			double withd = vs.nextDouble();
			if(balance-withd<0){
				System.out.println("INSUFFICINET BALANCE\n");
			}
			
			else{
				balance-=withd;
			
				if(balance<2000){
					System.out.println("Service charge of 5% Current Balance is applied.\n Service Cahrge = " + (0.05*balance));
					balance-=(0.05*balance);
				}
				System.out.println("Your BALANCE AFTER WITHDRAWAL OF "+withd+" = "+ balance);
			}
			
		}
		else{
			System.out.println("INSUFFICIENT BALANCE: min balace is 500");
		}
		
	}
}


class SavingAct extends Account{

	int flag = 0;	
	double balance = 0;
	Scanner vs = new Scanner(System.in);
	
	void getdata(){
		System.out.println("NAME:\n");
		name = vs.nextLine();
		System.out.println("ACCOUNT NUMBER:\n");
		acc_no = vs.nextLine();
	}
	
	

	void deposit(){
		System.out.println("Deposit Amount:\n");
		double dep = vs.nextDouble();
		balance+= dep;
		System.out.println("NEW BALANCE = "+balance);
	}
	
	void display(){
		System.out.println("Current Balance is "+ balance);
	}
	
	void intrest(){
		if(flag == 0){
		//begin
			System.out.println("Enter Rate and Number of months");
			double r = vs.nextDouble();
			int months = vs.nextInt();
			double i = 0;
			i = balance*Math.pow((r/100), months);
			balance+=i;
			System.out.println("Your Intrest is = "+ (double)Math.round(i));
			flag = 1;
		//end
		}
		
		
		/**System.out.println("Enter Rate and Number of months");
		double r = vs.nextDouble();
		int months = vs.nextInt();
		double i = 0;
		i = balance*Math.pow((1+r/100), months);**/
		
		
		System.out.println("Your balance after intrest = "+balance);
	}
	
	void withdraw(){
		if(balance>0){
			System.out.println("Enter the amount to withdraw");
			double withd = vs.nextDouble();
			if(balance-withd <0){
				System.out.println("You dont have enough balance");
			}
			else{
				balance-=withd;
			}
			
			System.out.println("Your BALANCE AFTER WITHDRAWAL OF "+withd+" = "+ balance);
		}
		else{
			System.out.println("INSUFFICEINT BALANCE : min balace is 0");
		}
		
	}
}


class Bank{
	public static void main(String args[]){
		Scanner vs = new Scanner(System.in);
		int choice=0;
		do{
			System.out.println("1. Current Account\n2. Savings Account\n3. Exit");
			System.out.println("---------------------------------------------------");
			choice = vs.nextInt();
			switch(choice){
				case 1:
				CurrAct objc = new CurrAct();
				int choice2=0;
				objc.getdata();
				do{
					
					System.out.println("-----------------------------------------------------------");
					System.out.println("1.Deposit\n2. Display\n3. Interest\n4. Withdraw\n5. EXIT");
									System.out.println("---------------------------------------------------");					
					choice2 = vs.nextInt();
					switch(choice2){
						case 1: objc.deposit();
						break;
						
						case 2: objc.display();
						break;
						
						case 3: objc.intrest();	
						break;
						
						case 4: objc.withdraw();
						break;					
					}
				}while(choice2!=5);
				break;
				
				case 2:
				//BEGIn
				SavingAct objs = new SavingAct();
				objs.getdata();
				do{
					
					System.out.println("1. Deposit\n2. Display\n3. Interest\n4. Withdraw\n5. EXIT");					
					choice2 = vs.nextInt();
					switch(choice2){
						case 1: objs.deposit();
						break;
						
						case 2: objs.display();
						break;
						
						case 3: objs.intrest();	
						break;
						
						case 4: objs.withdraw();
						break;					
					}
				}while(choice2!=5);
				// END
				break;
			}
		}while(choice !=3);
	}
}
