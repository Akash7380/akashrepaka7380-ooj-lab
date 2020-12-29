import java.util.*;

class WrongAge extends Exception
{
int F, S;
WrongAge(int fatherage,int sonage)
{
F=fatherage;
S=sonage;
}
} 

class Father 
{
int fatherage;
int sonage;
Father (int f, int s) throws WrongAge
 {
 if(f==s)
 throw new WrongAge(fatherage, sonage);
 else
 {
 this.fatherage=f;
 this.sonage=s;
 }
 }
}

class Son extends Father
{

Son(int f, int s) throws WrongAge
{
super(f, s);
if(s>=f)
throw new WrongAge(fatherage, sonage);
System.out.println("Valid Age");
}
void display()
{
   System.out.println(" Father's Age:"+fatherage);
    System.out.println(" Son's Age:"+sonage);
}
}
class AgeMain
{ 
public static void main(String[] args)
{
 int f, s;
 Scanner S=new Scanner(System.in);
 System.out.println("Enter Father's Age:");
 f=S.nextInt();
 System.out.println("Enter Son's Age:");
 s=S.nextInt();
 try
 {
  Son s1=new Son(f, s);
  s1.display();
 }
 catch(WrongAge e)
 {
  System.out.println("Exception"+e);
 }
 
}
}