package inheritance;

class Birds
{
	void wing()
	{
		System.out.println("Flying...!");
	}
}

class Sprrow extends Birds
{
	void chirp()
	{
		System.out.println("Chirping...!");
	}
}

class Pengwin extends Birds
{
	void walk()
	{
		System.out.println("Walking...!");
	}
}

public class Hierarchical 
{

	public static void main(String[] args) 
	{
		Pengwin p = new Pengwin();
		p.walk();
		p.wing();
		

	}

}
