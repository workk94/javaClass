package day16.exception.필수;

import java.io.IOException;

public class 실습Ex02 {
	
	// main -> jvm이 호출함 (java virtual machine)
	
	public static void main(String[] args) throws IOException { // 예외를 처리하지 않은 경우와 동일해짐
		
		
		int ch = System.in.read();
		System.out.println((char) ch);
		
		
	}


}
