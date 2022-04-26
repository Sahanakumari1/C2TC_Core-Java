package staticMethod;

public class Student 
{
	int rollno ;
	String name;
	static String college = "IIT";
	
	Student( int r, String n)
	{
		rollno = r;
		name = n;
	}
	
	static void change()
	{
		college = "NIT";
		
	}
	
	void display()
	{
		System.out.println(rollno + " " +name+ " "+college );
	}
	
	public static void main(String[] args) 
	{
		Student S = new Student(01,"Kate");
		Student S1 = new Student(02,"Edwina");
		change();
		S.display();
		S1.display();
		

	}

}

// by including a static method we can change the value of any static variable.

