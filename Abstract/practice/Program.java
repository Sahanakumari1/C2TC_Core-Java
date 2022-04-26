package practice;

abstract class Animal
{
	abstract void eat();
}

class Herbivores extends Animal
{
	void eat()
	{
		System.out.println("I am vegetarian");
	}
}

class Carnivores extends Animal
{
	void eat()
	{
		System.out.println("I am non-vegetarian");
	}
}

class Omnivores extends Animal
{
	void eat()
	{
		System.out.println("I eat both veg and non-veg");
	}
}

public class Program {

	public static void main(String[] args) 
	{
		Animal Rabbit = new Herbivores();
		Animal Tiger = new Carnivores();
		Animal Bear = new Omnivores();
		Rabbit.eat();
		Tiger.eat();
		Bear.eat();
		

	}

}
