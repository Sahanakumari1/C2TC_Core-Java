package basic;

interface Inf1
{
	public void method1();
}
public class Interface implements Inf1
{
	public void method1()
	{
		System.out.println("method1");
	}
	public static void main(String[] args) 
	{
		Interface I = new Interface();
		I.method1();

	}

}
