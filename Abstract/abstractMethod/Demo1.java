package abstractMethod;

abstract class Bank
{
	abstract double rateofintrest();
}

class SBI extends Bank
{
	double rateofintrest()
	{
		return 7;
	}
}

class CANARA extends Bank
{
	double rateofintrest()
	{
		return 7.99;
	}
}

public class Demo1 
{

	public static void main(String[] args) 
	{
		SBI s = new SBI();
		CANARA c = new CANARA();
		c.rateofintrest();
		System.out.println("The Rate Of Intrest in SBI is ="+s.rateofintrest());
		System.out.println("The Rate Of Intrest in CANARA is ="+c.rateofintrest());
	}

}
