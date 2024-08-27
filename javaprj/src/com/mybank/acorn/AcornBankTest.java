package com.mybank.acorn;

import com.mybank.exception.Validator;

public class AcornBankTest {
	public static void main(String[] args) {
		
//		AcornBankApp app = new AcornBankApp();
		
//		app.run();
		
		String txt = "a";
		boolean result1 = txt.matches("all*");
		
		//? 앞의 표현식이 없거나 최대 한개
		// * 앞의 표현식이 없거나 있거나 (여러개)
		// + 앞의 표현식이 1개이상 or 여러개
		//{n} 딱 n개
		//{n,m} n개 이상 m개 이하 
		//{n,} m개 이상 
		System.out.println(result1);
		
	}
}
