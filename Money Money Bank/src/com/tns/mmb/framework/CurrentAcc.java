package com.tns.mmb.framework;

public abstract class CurrentAcc extends BankAcc
{
	private final float creditLimit;
	
	
	public float getCreditLimit() {
		return creditLimit;
	}


	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) 
	{
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	public void withdraw(float creditLimit ) 
	{
		System.out.println("Balance is:"+creditLimit);
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}


}
