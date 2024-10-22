package day03;

public class _10_연산자2_산술연산자 {

	public static void main(String[] args) {
		int su1 = 10;
		int su2 = 3;
		
		
		// 연산은 정수연산과 실수연산으로 수행된다.
		System.out.println(su1+su2); // 10 + 3
		System.out.println(su1-su2); // 10 - 3
		System.out.println(su1*su2); // 10 * 3
		// 주의 연산의 결과가 정수로 계산됨 
		// 연산의 결과를 실수연산으로 수행하고 싶다면 double 형변환을해서 사용할 수 있다.(cast연산, 형변환연산)
		System.out.println(su1/su2); // 10 / 3(몫)
		System.out.println(su1/(double)su2); 
		System.out.println(su1%su2); // 10 / 3(나머지)
	}

}
