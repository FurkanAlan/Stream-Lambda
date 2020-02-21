package Codes_InterviewQuestions.first;

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


interface AnimalFactory<T extends Anima>{
	T create(String gender,byte age,String color,String name);
	
}
class zoo{
	public static void main(String[] args) {
		AnimalFactory<Anima>  dogs=Dog::new,
				 			   cats=Cat::new,
				 			   cows=Cow::new;
		              Anima husky=(Dog) dogs.create("Male",(byte) 7, "White", "Husky");    
		                 
		                 
		              Anima van=(Cat) cats.create("Female", (byte)7, "Black", "Van");
		              
		              
		          List<Anima> animalList=new ArrayList<>(Arrays.asList(husky,van));
		          
		          animalList.stream().sorted().forEach(x->x.getInfo());
		                 
	}
}
abstract class Anima{
	String gender;
	byte age;
	String color;
	String name;
	public Anima(String gender,byte age,String color,String name) {
		this.gender=gender;
		this.age=age;
		this.name=color;
		this.color=color;
		
	}
	
	public  abstract void Speak(String language);
	
	public abstract void Eat(String food);
		
	
	public abstract void Sleep(int hour);
	
	public abstract void Drink(String drinks);
	
	
	public void getInfo() {
		System.out.println("Nick Name: "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender :"+gender);
		System.out.println("Color  : "+color);
	}
}
class Dog extends Anima{

	public Dog(String gender, byte age, String color, String name) {
		super(gender, age, color, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Speak(String language) {
		System.out.println(name+"is speaking "+language);
		
	}

	@Override
	public void Eat(String food) {
		System.out.println(name+" is eating "+food);
		
	}

	@Override
	public void Sleep(int hour) {
		System.out.println(name+" is sleeping "+hour+" hours");
		
	}

	@Override
	public void Drink(String drinks) {
		System.out.println(name+" is drinking "+drinks);
		
	}

	
	
}
class Cat extends Anima{

	public Cat(String gender, byte age, String color, String name) {
		super(gender, age, color, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Speak(String language) {
		System.out.println(name+" is peaking "+language);
		
	}

	@Override
	public void Eat(String food) {
		System.out.println(name+" is eating "+ food);
		
	}

	@Override
	public void Sleep(int hour) {
		System.out.println(name+" is sleeping "+hour+" hours");
		
	}

	@Override
	public void Drink(String drinks) {
		System.out.println(name+" is drinking "+drinks);
		
	}
	
}

class Cow extends Anima{

	public Cow(String gender, byte age, String color, String name) {
		super(gender, age, color, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Speak(String language) {
		System.out.println(name+" is speaking "+language);
		
	}

	@Override
	public void Eat(String food) {
		System.out.println(name+" is eating "+food);
	}

	@Override
	public void Sleep(int hour) {
		System.out.println(name+" is sleeping "+hour);
		
	}

	@Override
	public void Drink(String drinks) {
		System.out.println(name+" is drinking "+drinks);
		
	}
	
}

public class Q23_AnimalAbstract {
	

}
