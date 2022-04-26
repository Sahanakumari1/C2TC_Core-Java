package instanceVariable;

public class Employee 
{
	int EmpID;
	String Name;
	int Contact;
	
	Employee(int EmpID, String Name, int Contact )
	{
		this.EmpID = EmpID;
		this.Name = Name;
		this.Contact = Contact;
	}
	
	void display()
	{
		System.out.println(EmpID+" "+Name+" "+Contact);
	}
	
	class TestThis
	{
		public static void main(String[] args) 
		{ 
		Employee E1 = new Employee(100,"Raj",1234567890);
		Employee E2 = new Employee(101,"Tina",987456321);
		E1.display();
		E2.display();
		}
		
			

		
	}
}

	


