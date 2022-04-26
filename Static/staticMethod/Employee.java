package staticMethod;

public class Employee 
{
	int empid;
	String name;
	static String Company = "Capgemini";
	
	Employee(int id,String n)
	{
		empid = id;
		name = n;
		
	}
	
	static void change()
	{
		Company = "Amazon";
	}
	
	void display()
	{
		System.out.println(empid+" "+name+" "+Company);
	}
	public static void main(String[] args) 
	{
		Employee E = new Employee(100,"Adil");
		Employee E1 = new Employee(102,"Tim");
		E.display();
		E1.display();
		System.out.println();
		change();
		
		E.display();
		E1.display();
		

	}

}
