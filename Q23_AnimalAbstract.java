package Codes_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
  create an Animal abstract class
			data/attributes: gender, age, color, name
			create one constructor that can set the gender, name, color and age
			Actions: Speak(), Eat(), Sleep(), Drink();
		create sub classes of the Animal and override those actions:
					dog: Speak()	==> woof
						 Sleep()	==> 8 hours
						 Eat()		==> KFC
						 Drinks()	==> Milk Shake
					Cat: Speak()	==> meow
						 Sleep()	==> 14 hours
						 Eat()		==> m&m
						 Drinks()	==> Hot chocolate
					cow: Speak()	==> moo
						 Sleep()	==> 5 hours
						 Eat()		==> grace
						 Drinks()	==> Coffee with sugar
		create  zoo class and store some of those animals' objects
 */
interface Animals <A extends dog >{
	A create(String name, String gender, byte age, String color);
	
}
public class Q23_AnimalAbstract {
	
	public static void main(String[] args) {
		
	
	Animals<dog> dogs=dog::new;
	           dog d1=dogs.create("Hsky", "male", (byte) 3, "Black");
	              d1.Drink("Milk shake"); 
	              d1.Sleep(8);
	              d1.Eat("KFC");
	              d1.Speak("woof");
	              
	              
	           dog d2=dogs.create("Kangal", "female", (byte) 6, "Black");
	           
	             d2.getInfo();
	           dog d3=dogs.create("Van", "male", (byte) 9, "Gray");
	    
	    
	           
	          List<dog> doglist=new ArrayList<>(Arrays.asList(d1,d2,d3));
	               doglist.get(0).getInfo();
	}

}

abstract class Animall{
	String name;
	String gender;
	byte age;
	String color;
	public Animall(String name, String gender, byte age, String color) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.color = color;
	}
	
	public abstract void Speak(String language);
	public abstract void Eat(String food);
	public abstract void Sleep(int hour );
	public abstract void Drink(String drinks);
	
	
	public void getInfo() {
		System.out.println("NickName :"+name);
		System.out.println("Gende :"+gender);
		System.out.println("Age: "+age);
		System.out.println("Color :"+color);
		System.out.println("=================");
	}
	
}

class dog extends Animall{

	public dog(String name, String gender, byte age, String color) {
		super(name, gender, age, color);
		 
	}

	@Override
	public void Speak(String language) {
		System.out.println(name+" Speaking "+language);
		
	}

	@Override
	public void Eat(String food) {
		System.out.println(name+" eating "+food);
		
	}

	@Override
	public void Sleep(int hour) {
		System.out.println(name+" sleeping "+hour+" hours");
		
	}

	@Override
	public void Drink(String drinks) {
		System.out.println(name+" drinkng "+drinks);
		
	}
	
}
class cat extends Animall{

	public cat(String name, String gender, byte age, String color) {
		super(name, gender, age, color);
		 
	}

	@Override
	public void Speak(String language) {
		System.out.println(name+" Speaking "+language);
		
	}

	@Override
	public void Eat(String food) {
		System.out.println(name+" eating "+food);
		
	}

	@Override
	public void Sleep(int hour) {
		System.out.println(name+" sleeping "+hour+" hours");
		
	}

	@Override
	public void Drink(String drinks) {
		System.out.println(name+" drinkng "+drinks);
		
	}
	
}

class cow extends Animall{

	public cow(String name, String gender, byte age, String color) {
		super(name, gender, age, color);
		 
	}

	@Override
	public void Speak(String language) {
		System.out.println(name+" Speaking "+language);
		
	}

	@Override
	public void Eat(String food) {
		System.out.println(name+" eating "+food);
		
	}

	@Override
	public void Sleep(int hour) {
		System.out.println(name+"sleeping "+hour+" hours");
		
	}

	@Override
	public void Drink(String drinks) {
		System.out.println(name+" drinkng "+drinks);
		
	}
	
}
