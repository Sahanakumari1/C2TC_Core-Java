
public class PreAndPostIncrement 
{

	public static void main(String[] args) 
	{
		int a = 3;
		int b = 5;
		int c,d;
		
		c = ++b ; //   b=c=6; (increment the value of b then assign it to c)
		d = a++; // d=3 ; a=4 (  first assign the value of a to d then increase the value of a.)
		c++; // c=7
		b--; // b=5
		a++; // a=5
		
		
		System.out.println("a = "+ a + "\nb = "+ b + "\nc = "+ c + "\nd = "+ d);
	}

}
