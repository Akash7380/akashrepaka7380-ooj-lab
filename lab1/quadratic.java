import java.util.Scanner;

public class quadEquation{


static double findDiscriminate(float a,float b,float c){

double D=b*b-(4*a*c);
return D;
}


static void checkD(float a,float b,double D){
if(a==0)
{
  System.out.println("Not a valid quadratic equation");
}
else if(D<0)
{
  System.out.println("The roots are imaginary");
  System.out.println("The imaginary roots are "+(-b/2*a)+"+i"+(Math.sqrt(-D)/(2*a))+" and "+(-b/2*a)+"-i"+(Math.sqrt(-D)/(2*a)));
}

else
{
  double r1=(-b+Math.sqrt(D))/(2*a);
  double r2=(-b-Math.sqrt(D))/(2*a);
  System.out.println("The roots are "+r1+" and "+r2);
}
}



public static void main(String args[]){

Scanner s= new Scanner(System.in);

System.out.println("The equation is of the form ax^2+bx+c.");
System.out.println("Enter the value of a,b and c respectively");
float a=s.nextFloat();
float b=s.nextFloat();
float c=s.nextFloat();
double D=findDiscriminate(a,b,c);
checkD(a,b,D);
}
}