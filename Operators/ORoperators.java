
public class ORoperators {

	public static void main(String[] args) 
	{
		int a=10, b=20;  
		
		if (a == 10 || b == 20)  // a=T && b=T so o/p is T
		
		System.out.println("true");  
		else  
		{
		System.out.println("false");  
		}
		
		
		int c=78, d=90;  
		if (a < c | b > d)  // T & F = T
		
		System.out.println("true");  
		else 
		{ 
		System.out.println("false");  
		}

	}

}

//      			||      |
//		0   0		0		0
//		0	1		1		1
//		1	0		1		1	
//		1	1		1		1
