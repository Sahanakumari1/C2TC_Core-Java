package com.tns.mmb.client;

import com.tns.mmb.application.MMBankFactory;
import com.tns.mmb.application.MMCurrentAcc;
import com.tns.mmb.application.MMSavingAcc;
import com.tns.mmb.framework.BankFactory;
import com.tns.mmb.framework.CurrentAcc;
import com.tns.mmb.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory BF = new MMBankFactory();
		SavingAcc SA = new MMSavingAcc(123, "ABC", 2000.00f, true);
		SA.withdraw(SA.getAccBal());
		CurrentAcc CA = new MMCurrentAcc(234, "XYZ", 15000.00f, 25000.00f);
		CA.withdraw(CA.getCreditLimit());
		CA.toString();
	}

}
