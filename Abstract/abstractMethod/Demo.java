package abstractMethod;

abstract class Shape
	{
	  abstract void draw();
	}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}

public class Demo {

	public static void main(String[] args) {
		Shape S = new Rectangle();
		Shape S1 = new Circle();
		S.draw();
		S1.draw();
	}

}
