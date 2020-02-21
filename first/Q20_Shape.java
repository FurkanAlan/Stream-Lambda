package Codes_InterviewQuestions.first;



/*
 **
 1.create a class called Shape 
               Actions: Area(), perimeter(), capacity()
 2.create sub classes of Shape:Circle 
                               rectangle 
                               square 
                               cylinder 
              and give the instance variables that are needed to calculate the Area, perimeter, and Volume of those shapes
 3.override super class' Area(), perimeter(), capacity() methods to the sub classes
 */
  class Shape{
	 protected void Area() {
		 System.out.println("Area is 0)");
	 }
	 
	 protected void Perimeter() {
		 System.out.println("Perimeter is 0");
	 }
	 
	 protected void Capacity() {
		 System.out.println("Capacity is 0");
	 }
 }
 class Circle extends Shape{
	 double radius;
	 final double PI=3.14;
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	 @Override
	 protected void Area() {
		 double area=PI*Math.pow(radius, 2);
		 System.out.println("Circle arae is "+area);
	 }
	 @Override
	 protected void Perimeter() {
		 double perimeter=2*PI*radius;
		 System.out.println("Circle perimeter is "+perimeter);
		 
	 }
 }
	 
 class Rectangle extends Shape{
	 double length;
	 double weigth;
	 
	 public Rectangle(double length,double weigth) {
		 this.length=length;
		 this.weigth=weigth;
		  
	 }
	 @Override
	 protected void Area() {
			double area=length*weigth;
			System.out.println("Rectagle area is :"+area);
		}
	 @Override
	 protected void Perimeter() {
		double  perimeter=2*(length+weigth);
		System.out.println("Rectangle perimeter is "+perimeter);
	 }
 }
 
 class Square extends Shape{
	 double side;

	public Square(double side) {
		super();
		this.side = side;
	}
	@Override
	 protected void Area() {
		 double area=side*side;
		 System.out.println("Square area is "+area);
	 }
	@Override
	 protected void Perimeter() {
		 double perimeter=4*side;
		 System.out.println("Square perimeter is "+perimeter);
	 }
 }
 
 class Cylinder extends Shape{
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
		double area=2*PI*Math.pow(radius, 2)+heigth*2*PI*radius;
		
		System.out.println("Cylnder area is "+area);
	}
	@Override
	protected void Perimeter() {
		double perimeter=2*(2*PI*radius+heigth);
		System.out.println("Cylinder Perimeter "+ perimeter);
	}
	@Override
	protected void Capacity() {
		double capacity=PI*Math.pow(radius, 2)*heigth;
		System.out.println("Cylinder capacity is "+capacity);
	}
	 
 }
	 
 
public class Q20_Shape {
	
	public static void main(String[] args) {
		Shape circle=new Circle(4);
		circle.Area();
		circle.Perimeter();
		
		Shape rec=new Rectangle(4, 5);
		rec.Area();
		rec.Perimeter();
		rec.Capacity();
	}

}
