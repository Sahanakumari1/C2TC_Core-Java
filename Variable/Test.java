
public class Test 
{
	static void test(float x)
	{
		System.out.println("float");
	}

	static void test(double x)
	{
		System.out.println("double");
	}
	
	public static void main(String[] args) {
		test(99.9f); // if you remove the f the value will automatically get stored in double.

	}

}
