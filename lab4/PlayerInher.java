import java.util.Scanner;
class Player{
	private String name;
	private int matches_played;
    private double average;

	void setdata()
	{
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the name of the player : ");
		name=xx.next();
		xx.nextLine();
		System.out.print("Enter the number of matches played by the palyer : ");
		matches_played=xx.nextInt();
	}
	
	void setaverage(double x)
	{
		average=x;
	}
	int returnmatchesplayed()
	{
		return matches_played;
	}
	void displayaverage()
	{
		System.out.println("The name of the student is : "+name);
		System.out.println("The average of the player is : "+average);
	}
}

class batsman extends Player{
	private int runs_scored[];
	private int n;
	
	void setdata1()
	{
		setdata();
		Scanner xx=new Scanner(System.in);
		n=returnmatchesplayed();
		runs_scored=new int[n];
		System.out.println("Enter the runs scored : ");
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the runs scored in "+(i+1)+" match : ");
			runs_scored[i]=xx.nextInt();
		}
	}
	void calculateaverage()
	{
		double temp=0;
		for(int i=0;i<n;i++)
		{
			temp=temp+runs_scored[i];
		}
		temp=temp/returnmatchesplayed();
		setaverage(temp);
	}
	
}
class bowler extends Player{
	private int runs_scored[];
	private int n;
	
	void setdata1()
	{
		setdata();
		Scanner xx=new Scanner(System.in);
		n=returnmatchesplayed();
		runs_scored=new int[n];
		System.out.println("Enter the runs given : ");
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the runs given in "+(i+1)+" match : ");
			runs_scored[i]=xx.nextInt();
		}
	}
	void calculateaverage()
	{
		double temp=0;
		for(int i=0;i<n;i++)
		{
			temp=temp+runs_scored[i];
		}
		temp=temp/returnmatchesplayed();
		setaverage(temp);
	}
	
}

public class PlayerInher{
	public static void main(String args[]){
		int n,m;
		Scanner xx=new Scanner(System.in);
		System.out.println("Enter the number of batsman : ");
		n=xx.nextInt();
		System.out.println("Enter the number of bowlers : ");
		m=xx.nextInt();
		batsman p1[]=new batsman[n];
		bowler p2[]=new bowler[m];
		
		System.out.println("Enter the details of the batsman : ");
		for(int i=0;i<n;i++)
		{
			p1[i]=new batsman();
			p1[i].setdata1();
			p1[i].calculateaverage();
		}
		System.out.println("Enter the details of the bowlers : ");
		for(int i=0;i<m;i++)
		{
			p2[i]=new bowler();
			p2[i].setdata1();
			p2[i].calculateaverage();
		}
		System.out.println("The details of the batsman are : ");
		for(int i=0;i<n;i++)
		{
			p1[i].displayaverage();
		}
		System.out.println("The details of the bowler are : ");
		for(int i=0;i<m;i++)
		{
			p2[i].displayaverage();
		}
	}
}