// Nested if
public class GreatestOfThree 
{

	public static void main(String[] args) 
	{
		int a=50, b=60, c=300;
		if(a>b)
		{
			if(a>c)
			System.out.println(+ a + " is greater");
			
		}else if(b>c)
		{
			System.out.println(+ b + " is greater");
		}else
		{
			System.out.println(+ c + " is greater");
		}
	}

}
