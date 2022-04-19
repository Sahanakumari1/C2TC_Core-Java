package access_modifiers_demo;

public class Access 
{

	public int i = 100;
	
	public void show() 
	{
		System.out.println("Hello world");
	}

	public static void main(String[] args) 
	{
	Access A = new Access();	
	A.show();
	System.out.println(A.i);
		

	}

}
