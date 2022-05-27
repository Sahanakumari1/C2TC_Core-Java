package com.tns.mmb.application;

import com.tns.mmb.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{
	private static final float accBal = 500;
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) 
	{
		super(accNo, accNm, accBal, isSalary);
	}
	
	
	public void withdraw(float accBal) 
	{
		System.out.println("Dear "+getAccNm()+" ,Your Saving A/C No "+getAccNo()+" has been debited and your current Balance is : "+accBal);
	}


	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	

}
