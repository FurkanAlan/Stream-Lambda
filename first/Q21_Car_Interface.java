package Codes_InterviewQuestions.first;



/*
create an interface called Cars              Actions: start() 
create an interface called ElectricVehicles  Actions: Charge() SelfDrive()
create an interface called GasVehicles       Actions: PumpGas()
create classes:1. Tesla_Model3:implement Cars and  ElectricVehicles Interfaces
               2. Jeep_wrangler:implement Cars and GasVehicles Interfaces
               3. ToyotaHybird:implement Cars, GasVehicles, and  ElectricVehicles Interfaces

*/

interface Cars{
	void Start();
}
interface ElectricVehicles{
	void Charge();
	void SelfDrive();
}

interface GasVehicles{
	void PumpGas();
}

class Tesla_Model3 implements Cars,ElectricVehicles{

	@Override
	public void Charge() {
		System.out.println("Tesla is charging.......");
		
	}

	@Override
	public void SelfDrive() {
		System.out.println("Tesla is driving.......");
		
	}

	@Override
	public void Start() {
		System.out.println("Tesla is starting......");
		
	}
	
}
class Jeep_Wrangler implements Cars,GasVehicles{

	@Override
	public void PumpGas() {
		System.out.println("Wrangler is Pumping....");
		
	}

	@Override
	public void Start() {
		System.out.println("wrangler starting...");
		
	}
	
}

class ToyotaHybrid  implements Cars,GasVehicles,ElectricVehicles{

	@Override
	public void Charge() {
		System.out.println("Toyota is cahrging.....");
		
	}

	@Override
	public void SelfDrive() {
		System.out.println("Toyota is self driving....");
		
	}

	@Override
	public void PumpGas() {
     System.out.println("toyota is pumping......");		
	}

	@Override
	public void Start() {
		System.out.println("Toyota is starting.....");
		
	}
	
}

public class Q21_Car_Interface{
	
	public static void main(String[] args) {
		Cars tesla3=new Tesla_Model3();
		Cars wrangler=new Jeep_Wrangler();
		Cars toyota=new ToyotaHybrid();
		
		tesla3.Start();
		wrangler.Start();
		
	    toyota.Start();
	}

}
