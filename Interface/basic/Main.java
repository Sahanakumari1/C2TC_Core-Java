package basic;

interface Bank
{
	float rateOfIntrest();
	
}

class SBI implements Bank
{
	public float rateOfIntrest()
	{
		return 9.15f;
	}

}
class HDFC implements Bank
{
	public float rateOfIntrest()
	{
		return 9.00f;
	}
}
public class Main 
{

	public static void main(String[] args) 
	{
		Bank b = new SBI();
		Bank b1 = new HDFC();
		System.out.println("ROI is :"+b.rateOfIntrest());
		System.out.println("ROI is :"+b1.rateOfIntrest());
	}

}
