package abstractConstructor;

abstract class car
{
	car()
	{
		System.out.println("Car is created");
	}
	
	abstract void run();
	
		void changeGear()
		{
			System.out.println("Gear is changed");
		}
	
}

class Maruthi extends car
{
	void run() 
	{
		System.out.println("Running Safely");
	}
}

public class Vehicle {

	public static void main(String[] args) 
	{
		Maruthi m = new Maruthi();
		m.run();
		m.changeGear();

	}

}
