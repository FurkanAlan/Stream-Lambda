package Codes_InterviewQuestions.first;
/*
Create a class called Animal (Do not use abstraction for now): Actions: Talk()
      create sub classes of Animal class: 
      1. Tiger: Actions: Hunts() 
      2. Octopus: Actions: Swim() override super class' instance method Talk()
      create a class called Zoo:
                              Create Arrays of Tiger Create Arrays of Octopus
*/

class Animal {
	public void Talk() {
		System.out.println("Animal talking");
	}
}
class Tiger extends Animal{
	public void Hunt() {
		System.out.println("Tiger Hunt...");
	}
	
}
class Octopus extends Animal{
	public void Swim() {
		System.out.println("Octopus is swiming..");
	}
}


public class Q22_Animals {
	
	public static void main(String[] args) {
		Animal tiger=new Tiger();
		tiger.Talk();
		
	}

}
