package com.tns.mmb.application;

import com.tns.mmb.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc 
{
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) 
	{
		super(accNo, accNm, accBal, creditLimit);
	}

	public void withdraw(float creditLimit) 
	{
		System.out.println();
		System.out.println("Dear user "+getAccNm()+" ,Your A/C No "+getAccNo()+ " has been debited and your current limit is : "+getAccBal()+" from  your total Credit Limit : "+getCreditLimit());
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	

}
