package Codes_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 create  a custom class for CellPhones instance variables:  brand, Screensize, color, price
     instance methods: call, message, takePhoto
 */

interface CellphoneFactory<C extends CellPhones>{
	C create(String brand,double size,String color,double price ,String model);
	
}

public class Q18_ClassCellPhone {
	
	public static void main(String[] args) {
		
		
		CellphoneFactory<CellPhones> cellphone=CellPhones::new;
		
		
		CellPhones ip2=new CellPhones("Iphone", 5.5,"White", 700.9,"6Plus");
		
		CellPhones sam1=cellphone.create("Samsung",6.9, "Black", 879.9,"S10");
		CellPhones ip1=cellphone.create("Iphone", 5.5, "White", 678.9, "XSmax");
		
		ip1.call(2063726668);
		List<CellPhones> cellphoneList=new ArrayList<>(Arrays.asList(sam1,ip1,ip2));
		
		cellphoneList.forEach(x->x.getInfo());
		cellphoneList.forEach(x->x.message(2063726668));
		
	}

}
class CellPhones{
    String brand;
	String model;
	double screenSize;
	String color;
	double price;
	
	
	
	
	public CellPhones(String brand,double screenSize,String color,double price,String model) {
		this.brand=brand;
		this.screenSize=screenSize;
		this.color=color;
		this.price=price;
		this.model=model;
	}
	
	public void call(long phoneNumber) {
		System.out.println(brand+" "+model+" is calling "+phoneNumber);
	}
	
	public void message(long phoneNumber) {
		System.out.println("Sending message to "+phoneNumber);
		
	}
	
	public  void takePhoto() {
		System.out.println(brand+" "+model+" taking photo");
	}

	
	void getInfo() {
		System.out.println(brand+" "+model+" "+color+" "+screenSize+" $"+price);
	}
	
	
	
}
