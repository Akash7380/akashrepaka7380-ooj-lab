STUDENT CLASS!!
package cie;
import java.util.*;

public class Student
{
public String usn;
public String name;
public int sem;

public void studentDetails()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter USN of Student:");
usn=s.next();
System.out.println("Enter Name of Student:");
name=s.next();
System.out.println("Enter Semester of Student:");
sem=s.nextInt();
} 
}


INTERNALS CLASS!!
package cie;
import java.util.*;

public class Internals
{
public int i;
public int internalmarks[];

public void internals()
{
Scanner s=new Scanner(System.in);
internalmarks=new int[5];
System.out.println("Enter Marks of obtained by Student in Internals in 5 subjects ");
for( i=0; i<5; i++)
 {
 System.out.println("Enter Internal Marks of Student in subject "+(i+1)+" :");
 internalmarks[i]=s.nextInt();
 }
}

}



EXTERNALS CLASS!!
package see;
import cie.*;
import java.util.*;


public class Externals extends cie.Student
{
public int i;
public int external[];

public void externals()
{
Scanner s=new Scanner(System.in);
external=new int[5];
System.out.println("Enter Marks of obtained by Students in Externals in 5 subjects ");
for( i=0; i<5; i++)
 {
 System.out.println("Enter External Marks of Student in subject "+(i+1)+" :");
 external[i]=s.nextInt();
 }
}
}



DRIVER CLASS!!
import cie.*;
import see.*;
import java.util.*;

class FinalMarks
{
public static void main(String[] args)
{
int total[];
Scanner S=new Scanner(System.in);
total= new int[5];
System.out.println("Enter the number of students:");
int n=S.nextInt();
cie.Student s[]=new cie.Student[n];
cie.Internals c[]=new cie.Internals[n];
see.Externals e[]=new see.Externals[n];
System.out.println("Enter Details of Students");
for(int i=0; i<n; i++)
{
s[i]=new cie.Student();
c[i]=new cie.Internals();
e[i]=new see.Externals();
s[i].studentDetails();
c[i].internals();
e[i].externals();
}
for(int i=0;i<n;i++)
   {
	for(int j=0;j<5;j++)
	{
	total[j]=c[i].internalmarks[j]+e[i].external[j]/2;
	}
	  System.out.println("Total marks for student "+(i+1)+" in each subject are :");
	for(int j=0;j<5;j++)
        {
	  System.out.println("Total marks in subject "+(j+1)+" for student "+(i+1)+" is :"+total[j]);
	}
   }
}
}