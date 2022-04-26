package staticvariable;

public class Student 
{
	int rollno;
	String name;
	static String college = "IIT";
	
	Student(int r, String n)
	{
		rollno = r;
		name = n;
	}
	
	void display()
	{
		System.out.println(rollno + " " +name+ " "+college );
	}
	
	public static void main(String[] args) 
	{
		Student S = new Student(01,"Kate");
		Student S1 = new Student(02,"Edwina");
		S.display();
		S1.display();
		

	}

}
