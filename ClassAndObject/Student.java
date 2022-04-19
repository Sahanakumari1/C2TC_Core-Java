// Initializing object by Reference Variable

public class Student 
{
	int id;
	String name;
}

class Main
{
	public static void main(String[] args) 
	{
		Student S1 = new Student();
		S1.id = 100;
		S1.name = "Adil";
		
		System.out.println(S1.id + "\n" +S1.name);

	}

}
