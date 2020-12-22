/*9. Develop a Java program to create an abstract class named Shape that contains two integers and an 
empty method named printArea( ). Provide three classes named Rectangle, Triangle and Circle such that 
each one of the classes extends the class Shape. Each one of the classes contain only the method printArea( )
 that prints the area of the given shape.*/

import java.util.*;
abstract class Shape{
	int a,b;
	abstract void printArea();
	}
	
class Rectangle extends Shape{
	public void printArea()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Area = " + (a*b));
	}
}
class Triangle extends Shape{
	public void printArea()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Area = " + (0.5*a*b));
	}
}
class Circle extends Shape{
	public void printArea()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		a = sc.nextInt();
		
		System.out.println("Area = " + (3.14*a*a));
	}
}
class Main9{
	public static void main(String args[]){
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("PRESS 1: Rectangle\nPRESS 2: Triangle\nPRESS 3: Circle\n");
		ch = sc.nextInt();
		Shape ref = null;
		switch(ch){
			case 1: ref = new Rectangle();
				break;
			case 2: ref = new Triangle();
				break;
			case 3: ref = new Circle();
				break;
		}
		ref.printArea();
		
	}
}