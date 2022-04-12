package inheritance;

class Pet
{
	void eat()
	{
		System.out.println("Eating....!");
	}
}

class Cat extends Pet
{
	void bark ()
	{
		System.out.println("Mew....!");
	}
}

class Kitten extends Cat // in multilevel inheritance the secondary sub-class should be always extension of primary sub-class
{
	void weep()
	{
		System.out.println("weeping....!");
	}
}

public class MultilevelInheritance 
{

	public static void main(String[] args) 
	{
		Kitten k = new Kitten();
		k.weep();
		k.eat();
		k.bark();
				

	}

}
