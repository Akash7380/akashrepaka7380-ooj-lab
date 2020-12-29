import java.util.Scanner;
abstract class Shape{
	int int1,int2;
	abstract double printArea();
}

class Rectangle extends Shape{
	Rectangle(int a, int b){
		int1 = a;
		int2 = b;
	}
	double printArea(){
		System.out.println("For Rectangle");
		return int1*int2;
	}
}

class Triangle extends Shape{
	Triangle(int a, int b){
		int1 = a;
		int2 = b;
	}
	double printArea(){
		System.out.println("For Triangle");
		return (int1*int2)/2;
	}
}

class Circle extends Shape{
	Circle(int a){
        int1 = a;
	}
	double printArea(){
		System.out.println("For Circle");
		return 3.14*int1*int1;
	}
}

class ShapeMain{
	public static void main(String args[]){
		Rectangle r = new Rectangle(10,20);
		Triangle t = new Triangle(20,30);
		Circle c = new Circle(35);

		System.out.println("Area of Rectangle is:" +r.printArea());
		System.out.println("Area of Triangle is:" +t.printArea());
		System.out.println("Area of Circle is:" +c.printArea());
	}
}