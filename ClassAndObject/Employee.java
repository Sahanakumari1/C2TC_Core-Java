// Initializing object by Method

class Employee 
{
	int Empid;
	String Name;
	
	void insertRecord (int e, String n)
	{
		Empid = e;
		Name = n;
	}
	
	void displayRecord()
	{
		System.out.println(Empid + "\n" + Name);
	}
	
	class Main 
	{
	  public static void main(String args[])
	  {
		  Employee E1 = new Employee();
		  
		  E1.insertRecord(10, "Sahana");
		  
		  E1.displayRecord();
	  
	}
}
}
