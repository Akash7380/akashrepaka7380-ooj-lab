import java.util.Scanner;
class Student
{
String name;
String usn;
int sem;
}
class Test extends Student
{
int cie[];
int credits[];
}
class Exam extends Test
{
int see[];
int i, n;
void getData()
{
Scanner s=new Scanner(System.in);
System.out.println("enter name");
name=s.next();
System.out.println("enter usn");
usn=s.next();
System.out.println("enter sem");
sem=s.nextInt();
System.out.println("enter number of subjects:");
n=s.nextInt();
for(i=0; i<n; i++)
  {
   System.out.println("Enter cie marks in sub "+(i+1));
   cie[i]=s.nextInt();
   System.out.println("Enter credits in sub "+(i+1));
   credits[i]=s.nextInt();
   System.out.println("Enter see marks in sub "+(i+1));
   see[i]=s.nextInt();
  }
}
void display()
{
System.out.println("Name: "+name);
System.out.println("USN: "+usn);
System.out.println("SEM: "+sem); 
for(i=0; i<n; i++)
{
System.out.println("Cie Marks: "+cie[i]);
System.out.println("Credits: "+credits[i]);
System.out.println("SEE Marks: "+see[i]);
}
}
}

class MarksInher
{
 public static void main(String[] args)
 {
  int j;
  Scanner s1=new Scanner(System.in);
  System.out.println("Enter number of students");
  int m=s1.nextInt();
  Exam e[]=new Exam[m];
  System.out.println("Enter the details of the Students: ");
		for(j=0;j<m;j++)
		{
			System.out.println("Enter the details of the "+(j+1)+" Student");
			e[j]=new Exam();
	     		e[j].getData();
		}
 
  System.out.println("The details of the Students are : ");
		for(j=0;j<m;j++)
		{
			System.out.println("The details of the "+(j+1)+" Student is : ");
			System.out.println(e[j]);
		}
	}	
}
   