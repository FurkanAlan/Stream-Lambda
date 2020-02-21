package Codes_InterviewQuestions;
/*
 1.create a class called Shape 
               Actions: Area(), perimeter(), capacity()
 2.create sub classes of Shape:Circle 
                               rectangle 
                               square 
                               cylinder 
              and give the instance variables that are needed to calculate the Area, perimeter, and Volume of those shapes
 3.override super class' Area(), perimeter(), capacity() methods to the sub classes
 */
public class Q20_Shapes_Inherites {
	public static void main(String[] args) {
		Cylinder cyl1=new Cylinder(4, 8);
				cyl1.Perimeter();
				cyl1.Area();
				cyl1.Capacity();
	}

}

class Shape{
	protected void Area() {
		System.out.println("Area is 0");
	}
	
	protected void Perimeter() {
		System.out.println("Perimeter is 0");
	}
	
	protected void Capacity() {
		System.out.println("Capacity os 0");
	}
}

class Circle extends Shape{
	double radius;
	double diameter;
	final double PI=3.14;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
		diameter=2*radius;
	}
	@Override
	protected void Area() {
		double area=PI*Math.pow(radius,2);
		System.out.println("Circle area is :"+area);
	}
	@Override
	protected void Perimeter() {
		double perimeter=PI*diameter;
		System.out.println("Perimeter is : "+perimeter);
	}
	 
}

class Rectangle extends Shape{
	double length;
	double weigth;
	public Rectangle(double length, double weigth) {
		super();
		this.length = length;
		this.weigth = weigth;
	}
	protected void Area() {
		double area=length*weigth;
		System.out.println("Rectagle area is :"+area);
	}
	protected void Perimeter() {
		double perimeter=2*(length+weigth);
		System.out.println("Rectangle perimeter is :"+perimeter);
	}
}

class Square extends Shape{
	double side;

	public Square(double side) {
		super();
		this.side = side;
	}
	
	protected void Area() {
		double area=Math.pow(side, 2);
		System.out.println("Squre area is "+area);
	}
	
	protected void Perimeter() {
		double perimeter=4*side;
		System.out.println("Square perimeter is "+perimeter);
	}
}
class Cylinder extends Shape {
	double radius;
	double heigth;
	final double PI=3.14;
	
	public Cylinder(double radius, double heigth) {
		super();
		this.radius = radius;
		this.heigth = heigth;
		
	}
	@Override
	protected void Area() {
		double area=2*(PI*Math.pow(radius, 2))+2*PI*radius*heigth;
		
		System.out.println("area of the cylindir  is "+area);
	}
	protected void Perimeter() {
		double perimeter=2*(2*PI*radius+heigth);
		System.out.println("perimeter of the cylinder  is "+perimeter);
	}
	protected void Capacity() {
		double volume=PI*Math.pow(radius, 2)*heigth;
		System.out.println("capacity of the cylinder is "+volume);
	}
	
	
}