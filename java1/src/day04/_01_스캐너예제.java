package day04;

import java.util.Scanner;

public class _01_스캐너예제 {

	public static void main(String[] args) {
		 
		//키보드로 입력받을 때  Scanner 클래스의 기능을 사용한다		
		Scanner sc = new Scanner( System.in);
		
		//이름 입력받기 ( 문자열)		
		String name = sc.nextLine();		
		
		//숫자(정수 입력받기)
		int age = sc.nextInt(); 
		
		//숫자( 실수 입력받기)
		double height = sc.nextDouble();  
		
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height); 
		

	}

}