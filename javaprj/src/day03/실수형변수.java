//5
package day03;

public class 실수형변수 {

	public static void main(String[] args) {
		//float : 4byte, 소수이하 7자리 
		//double : 8byte, 소수이하 15자리 
		
//		float f = 35.4; // 소수이하 7자리 // 문제발생
		double d = 35.4; // 소수이하 15자리 
		
		//문제발생 이유
		//35.4 리터럴이 상수영역에 double형 공간에 저장됨
		//float f 변수에 저장될 때 문제가 발생 (큰변수 = 작은변수(ok), 작은변수 = 큰 변수(x)) 
		
		float f = 35.4F; // float형 리터럴을 만들고 싶을 때는 F를 붙힌다.
		
		System.out.println(d);
		System.out.println(f);
	}

}
