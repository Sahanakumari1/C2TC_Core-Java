package invokecurrentClassConstructor;

class Demo 
{
	Demo()
	{
		System.out.println("Hello A");
	}
	
	Demo(int x)
	{
		this();
		System.out.println(x);
	}
	
	class Test
	{
		public static void main(String[] args) 
		{
			Demo a = new Demo(10);

		}
	}
	
	class hello
	{
		hello()
		{
			this(10);
			System.out.println("Hello B");
		}

		hello(int x)
		{
			System.out.println(x);
		}

		
	}
	
	class Main
	{
		public static void main(String args[]) 
		{
			//hello a = new hello();
		}
	}
	

}
