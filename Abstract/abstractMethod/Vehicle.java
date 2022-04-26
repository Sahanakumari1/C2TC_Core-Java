package abstractMethod;

abstract class Bike
{
	abstract void run();
}

class Honda extends Bike
{
	void run()
	{
		System.out.println("Running Safely");
	}
}

class Vehicle 
{

	public static void main(String[] args) 
	{
		Honda H = new Honda();
		H.run();

	}

}
