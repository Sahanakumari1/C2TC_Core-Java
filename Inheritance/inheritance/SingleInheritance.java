package inheritance;

class Animal // Super class or parent class
{
	void eat()
	{
	System.out.println("Eating...!");
	}
}

class Dog extends Animal // child class
{
	void bark()
	{
		System.out.println("Barking...!");
	}
}

public class SingleInheritance 
{

	public static void main(String[] args) 
	{
	  Dog d = new Dog();
	  d.eat();
	  d.bark();

	}

}
