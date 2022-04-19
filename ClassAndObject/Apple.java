
public class Apple // This is created and used to store the values
{
	int weight ;
}

class Weight  // it is a class from where we can execute the program
{

	public static void main(String[] args) 
	{
		Apple a1 = new Apple() ; // here new Apple() is the object which got created and a1 is the reference which is pointing to it
		Apple a2 = new Apple() ;
		a1.weight = 1;
		a2.weight = 2;
		a2 = a1 ; // value of a1 is assigned to a2.
		System.out.println(a2.weight);
		

	}

}
