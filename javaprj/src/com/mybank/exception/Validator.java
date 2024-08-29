package com.mybank.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	public static boolean ssnValidator(String ssn) throws InvalidSSNFormatException{
		
		// "\d" 숫자, "{6}" 앞의 패턴이 6번 반복, "[-]?" -가 있을수도 있고 아닐수도 있음 
		// "[1-4]" 1에서 4까지의 범위 숫자(성별), "\d" 숫자, "{6}" 앞의 패턴이 6번 반복
		String patternType = "\\d{6}[-]?[1-4]\\d{6}";
		
		//정규식 입력
		Pattern pattern = Pattern.compile(patternType);
		
		//입력된 주민번호가 정규식과 일치하는지 검사 
		Matcher matcher = pattern.matcher(ssn);
		
		
		//패턴 전체 문자열이 일치하면 true를 반환
		if(matcher.matches()) {
			return true;
		} else {
			throw new InvalidSSNFormatException();
		}
		
		
	}
	
	
	public static boolean passwordValidator(String password) throws InvalidPasswordFormatException{
		
		// "\d" 숫자, "{4}" 앞의 패턴이 4번 반복 
		String patternType = "\\d{4}";
		
		//정규식 입력
		Pattern pattern = Pattern.compile(patternType);
		
		//입력된 password가 정규식과 일치하는지 검사  
		Matcher matcher = pattern.matcher(password);
		
		if(matcher.matches()) {
			return true;
		} else {
			throw new InvalidPasswordFormatException();
		}
		
		
	}
}

