package Codes_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 Create a class called Animal (Do not use abstraction for now): Actions: Talk()
       create sub classes of Animal class: 
       1. Tiger: Actions: Hunts() 
       2. Octopus: Actions: Swim() override super class' instance method Talk()
       create a class called Zoo:
                               Create Arrays of Tiger Create Arrays of Octopus
 */
public class Q22_Animals {

}
class Animal{
	public void Talk() {
		System.out.println("Animal talking");
	}
}

class Tiger extends Animal{
	public void Hunts() {
		System.out.println("Tiger hunting ");
	}
}

class Octopus extends Animal{
	public void Swim() {
		System.out.println("OCtopus is swimmig..");
	}
}

class Zoo{
	public static void main(String[] args) {
		Animal tiger1=new Tiger(),
			  tiger2=new Tiger(),
			  tiger3=new Tiger();
		
		List<Animal> listTiger=new ArrayList<>();
				   listTiger.addAll(Arrays.asList(tiger1,tiger2,tiger3));
	}
}