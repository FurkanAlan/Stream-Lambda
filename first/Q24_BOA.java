package Codes_InterviewQuestions.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
interface ScrumFactory<B extends ScrumTeam>{
	 B create(String name, String jobTitle, double salary);
}
abstract class  ScrumTeam{
	String Name;
	String JobTitle;
	double Salary;
	public ScrumTeam(String name, String jobTitle, double salary) {
		super();
		Name = name;
		JobTitle = jobTitle;
		Salary = salary;
	}
	
	public abstract void DailyStandUp();
	public abstract void Demo();
	
	public void getInfo() {
		System.out.println("Name :"+Name+"\nJopTitle :"+JobTitle+"\nSalary :"+Salary);
		System.out.println("=============================");
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
		System.out.println("Tester "+Name+" is demostration ");
		
	}
	
	public void FindBug() {
		System.out.println("Tester "+Name+" found Bug");
	}
	
}
class Developers extends ScrumTeam{

	public Developers(String name, String jobTitle, double salary) {
		super(name, jobTitle, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void DailyStandUp() {
		System.out.println("Developer "+Name+" is talking...");
		
	}

	@Override
	public void Demo() {
		System.out.println("Developer "+Name+" demostration");
		
	}
	
	public void FixBug() {
		System.out.println("Developer "+ Name+" fixed bug");
	}
	
}
public class Q24_BOA {
	public static void main(String[] args) {
		ScrumFactory<ScrumTeam> tester=Testers::new,
								developer=Developers::new;
		ScrumTeam John=tester.create("John", "Automation Tester",90000),
				  Mike=tester.create("Mike", "Manual Tester ", 50000),
				  Stephone=tester.create("Stephone", "SDET Tester", 100000),
				  Jim=developer.create("Jim", "Full stack Developer", 200000),
				  Elen=developer.create("Elen", "Developer", 140000);
		
		 ScrumTeam[] testArr= {John,Mike,Stephone};	
		 ScrumTeam[] developArr= {Jim,Elen};
		 
		 List<ScrumTeam> testlist=new ArrayList<>(Arrays.asList(testArr));
		 List<ScrumTeam> develist=new ArrayList<>(Arrays.asList(developArr));
		 
		 
		 List<ScrumTeam> srumlist=Stream.of(testlist,develist)
				                        .flatMap(x->x.stream())
								         .sorted((x,y)->x.Name.compareTo(y.Name))
								         .collect(Collectors.toList());
		 
		 srumlist.parallelStream()
		         .forEach(x->x.getInfo());
		 
		
		
	}

}
