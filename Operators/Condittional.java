
public class Condittional 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		int value1 = (a>b)?a:b ; // a>b is false so value1 = 20
		int value2 = (a<b)?a:b ; // a<b is true so value2 = 10
		
		System.out.println(value1);
		System.out.println(value2);

	}

}

// Exp1 ? Exp2 : Exp3
// if Exp1 is true then o/p will be Exp2
// if Exxp1 is false then o/p will be Exp3
