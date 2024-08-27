package com.mybank.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	public static boolean ssnvalidator(String contests) throws InvalidSSNFormatException{
		String patternType = "\\d{6}[ ,-]-?[1-4]\\d{6})|(\\d{6}[ ,-]?[1-4]\r\n";
		
		//정규식 입력
		Pattern pattern = Pattern.compile(patternType);
		
		//검사할 데이터 
		Matcher matcher = pattern.matcher(contests);
		
		if(matcher.matches()) {
			return true;
		}
		
		
		
		return false;
		
	}
}
