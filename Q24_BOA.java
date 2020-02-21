 package Codes_InterviewQuestions;
/*
 1. create an abstract class called ScrumTeam  
                        Data: Name  JobTitile  Salary 
                        Actions: DailyStandUp(); Demo();
     2. Create the following sub classes of ScrumTeam:
      					1. Testers:    Actions: FindBug
      					2. Developers:  Actions: FixBug
      					3. Create a class called BOA 
      					   create Array of Testers named sdets, at leats store two objects
      					   create array of Developers named dev, at least store three objects
      					   create ArrayList of ScrumTeam:store all the developer' and testers' objects
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface BOFA<B extends ScrumTeam>{
	 B create(String name, String jobTitle, double salary);
 }
public class Q24_BOA {
	public static void main(String[] args) {
		
		BOFA<ScrumTeam> tester=Testers::new,
				        developer=Developers::new;
		ScrumTeam Michail=tester.create("Michail","SDET",200000); 
		ScrumTeam Mevlut=tester.create("Mevlut","Aoutomation", 1500000);
		ScrumTeam Suad=tester.create("Suad", "Manual Tester",50000);

		
		
		ScrumTeam Umit=developer.create("Umit","Developer", 300000);
		ScrumTeam Steve=developer.create("Steve", "Junior Developer", 12000);
		ScrumTeam John=developer.create("John", "Medium Developer", 15000);
		ScrumTeam Firdevs=developer.create("Firdevs", "Master Developer",350000);
		
		List<ScrumTeam> testers=new ArrayList<>(Arrays.asList(Michail,Mevlut,Suad));
		List<ScrumTeam> developers=new ArrayList<>(Arrays.asList(Umit,Steve,John,Firdevs));
		
		List<ScrumTeam> all=new ArrayList<>(Arrays.asList(Michail,Mevlut,Suad,Umit,Steve,John,Firdevs));
		List<ScrumTeam> scrumList=Stream.of(testers,developers)
								         .flatMap(x->x.stream())
								         .sorted((x,y)->x.Name.compareTo(y.Name))
								         .collect(Collectors.toList());
		
		                 
		  all.stream()
		           .sorted((x,y)->x.Name.compareTo(y.Name)).forEach(x->x.getInfo());
		           //.collect(Collectors.toList()).forEach(x->x.toString());;
		         //  .forEach(x->x.getInfo());
		  
		
		         
		
	}

}
abstract class ScrumTeam {
	    public  String Name;
	    public  String JobTitle;
	    public   double Salary;
	     
	     
	     public ScrumTeam(String name, String jobTitle, double salary) {
			super();
			Name = name;
			JobTitle = jobTitle;
			Salary = salary;
		}
		public abstract void DailyStandUp();
	    public abstract void Demo();
	    
	    public void getInfo() {
	    	System.out.println("Name     : "+Name+"\nJob Title: "+JobTitle+"\nSalary :"+Salary);
	    	System.out.println("===========================");
	    }
	     
	
}

class Testers extends ScrumTeam{

	public Testers(String name, String jobTitle, double salary) {
		super(name, jobTitle, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void DailyStandUp() {
		System.out.println("Tester "+Name+" is talking");
		
	}

	@Override
	public void Demo() {
		System.out.println("Tester "+Name+" is demostration");
		
	}
	public void FindBug() {
		System.out.println("Testers "+Name+" was find bug");
		
	}
}

class Developers extends ScrumTeam{

	public Developers(String name, String jobTitle, double salary) {
		super(name, jobTitle, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void DailyStandUp() {
		System.out.println("Developer "+Name+" is talking");
		
	}

	@Override
	public void Demo() {
		System.out.println("Developer "+Name+" is demostration");
		
	}
	
	public void FixBug() {
		System.out.println("Developer "+Name +" is fixed bug");
	}
	
}