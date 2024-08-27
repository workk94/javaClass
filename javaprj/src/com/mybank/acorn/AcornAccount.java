package com.mybank.acorn;

import java.util.ArrayList;

import com.mybank.bank.Account;

public class AcornAccount extends Account {

	public static String accountNumberGenerator() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 6; i++) {
			int randNum = (int) (Math.random() * 9) + 1;
			sb.append(randNum);
		}
		return sb.toString();
	}

}
