
public class Pattern2 
{
	public static void main(String[] args) 
	{
		int n=3, stars;
		for ( int i=0 ; i<3 ;i++ )
		{
			stars = n-i;
			
			for ( int j=0 ; j<stars ;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	
	}

}


//      stars   i 
// ***  3       0
// **	2       1
// *    1       2       stars = n-i
