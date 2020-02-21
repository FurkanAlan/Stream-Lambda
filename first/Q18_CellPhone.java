package Codes_InterviewQuestions.first;
/*
create  a custom class for CellPhones instance variables:  brand,model, Screensize, color, price
    instance methods: call, message, takePhoto
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface CellPhoneFactory<C extends CellPhone>{
	C create(String brand,String model,String color,float screenSize,double price);
}

class CellPhone{
	String brand;
	String model;
	String color;
	float screenSize;
	double price;
	
	public CellPhone(String brand,String model,String color,float screenSize,double price) {
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.screenSize=screenSize;
		this.price=price;
	}

	@Override
	public String toString() {
		return "CellPhone [brand=" + brand + ", model=" + model + ", color=" + color + ", screenSize=" + screenSize
				+ ", price=" + price + "]";
	}
	
	public void call(long phoneNumber) {
		System.out.println(brand+" "+model+" is calling "+phoneNumber);
		
	}
	public void message(long phoneNumber) {
		System.out.println(brand+" "+model+" sending message to "+phoneNumber);
		
	}
	public void takePhoto() {
		System.out.println(brand+" "+model+ "is taking photo");
	}
	
}

public class Q18_CellPhone {
	public static void main(String[] args) {
		CellPhoneFactory<CellPhone> cellPhone=CellPhone::new;
		
		          CellPhone samsung1=cellPhone.create("Samsung","S10", "Black",  5.5f, 789);
		          CellPhone iphone1=cellPhone.create("Iphone", "XMax", "White", 4.7f, 999);
		          
		          List<CellPhone> cellPhonelist=new ArrayList<>(Arrays.asList(samsung1,iphone1));
		          
		          cellPhonelist.forEach(x->System.out.println(x.toString()));
		
	}

}
