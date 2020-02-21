package Codes_InterviewQuestions;
/*
     create an interface called Cars              Actions: start() 
     create an interface called ElectricVehicles  Actions: Charge() SelfDrive()
     create an interface called GasVehicles       Actions: PumpGas()
     create classes:1. Tesla_Model3:implement Cars and  ElectricVehicles Interfaces
                    2. Jeep_wrangler:implement Cars and GasVehicles Interfaces
                    3. ToyotaHybird:implement Cars, GasVehicles, and  ElectricVehicles Interfaces
  
 */
interface Cars{
	void start();
}
interface ElectricVehicles{
	abstract void charge();
	void selfDrive();
	void fly();
}
interface GasVehicles{
	void pumpGas();
}
interface FUNC<T extends ToyotaHybrid>{
	T create();
}

public class Q21_Car_Interfaces {
	public static void main(String[] args) {
		Tesla_Model3 tesla1=new Tesla_Model3();
					 tesla1.charge();
					 tesla1.selfDrive();
					 tesla1.fly();
		FUNC<ToyotaHybrid> toyota=ToyotaHybrid::new;
		
		
		  ToyotaHybrid        t1=toyota.create(),
				              t2=toyota.create();
		          t1.charge();
		          t1.selfDrive();
		          t1.fly();
		          t1.pumpGas();
		          t2.charge();
		          t2.selfDrive();
		          t2.fly();
		          t2.pumpGas();
		          
	}

}
class Tesla_Model3 implements Cars,ElectricVehicles{

	@Override
	public void charge() {
		System.out.println("tesla is charging....");
		
	}

	@Override
	public void selfDrive() {
		System.out.println("Tesla is selfdriving.....");
		
	}

	@Override
	public void start() {
		System.out.println("tesla is starting.....");
		
	}

	@Override
	public void fly() {
		System.out.println("tesla is flying....");
		
	}
	
}

class Jeep_wrangler implements Cars,GasVehicles{

	@Override
	public void pumpGas() {
		System.out.println("Jeep is pamping");
		
	}

	@Override
	public void start() {
		    System.out.println("Call Mechanic");
	        System.out.println("Oild change");
	        System.out.println("Jump Start");
		
	}
	
}

class ToyotaHybrid implements Cars,ElectricVehicles,GasVehicles{

	@Override
	public void pumpGas() {
		System.out.println(" pumping gas");
		
	}

	@Override
	public void charge() {
		System.out.println("charging ");
		
	}

	@Override
	public void selfDrive() {
		System.out.println("selfdriving");
		
	}

	@Override
	public void fly() {
		System.out.println("flying ");
		
	}

	@Override
	public void start() {
		System.out.println("Starting ");
		
	}
	
}