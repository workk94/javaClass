package day08;

public class _03_함수안에서변수만들기_지역변수_유효범위 {
	
	//main : 클래스를 실행할 목적
	//지역변수 (local variable) : 매서드안에서 만들어지는 함수, 유효범위 : 매서드안에서만 유효한다 
	public static void main(String[] args) {
		int su1;
		int su2;
		
		su1 = 10;
		su2 = 5;
		
		int result = adder(su1, su2);
		System.out.println(result);
	}
	
	//더하는 기능
	//입력 : 두 수
	//반환 : 두 수의 합 
	public static int adder(int su1, int su2) {
		int result;
		result = su1 + su2;
		return result;
	}
}
