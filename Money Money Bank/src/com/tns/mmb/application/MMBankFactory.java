package com.tns.mmb.application;

import com.tns.mmb.framework.BankFactory;
import com.tns.mmb.framework.CurrentAcc;
import com.tns.mmb.framework.SavingAcc;

public class MMBankFactory extends BankFactory 
{

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		MMSavingAcc mmsaving = new MMSavingAcc(accNo, accNm, accBal, isSalary);
		return mmsaving;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmcurrent = new MMCurrentAcc(accNo, accNm, creditLimit, creditLimit);
		return mmcurrent;
	}

	
	
}
