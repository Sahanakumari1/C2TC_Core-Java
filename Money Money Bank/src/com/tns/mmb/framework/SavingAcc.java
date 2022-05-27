package com.tns.mmb.framework;

public abstract class SavingAcc extends BankAcc
{
	private boolean isSalary;
	private static final float MINBAL = 100;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) 
	{
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}

	public void withdraw(float accBal) 
	{
		System.out.println("Balance is "+accBal);
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}

	


}
