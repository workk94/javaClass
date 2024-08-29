package com.mybank.acorn;

import com.mybank.bank.Account;

public class AcornAccount extends Account {
	

	public AcornAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String accountNumberGenerator() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 6; i++) {
			int randNum = (int) (Math.random() * 9) + 1;
			sb.append(randNum);
		}
		return sb.toString();
	}
	
}
