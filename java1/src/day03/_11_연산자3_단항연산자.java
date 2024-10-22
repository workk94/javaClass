package day03;

public class _11_연산자3_단항연산자 {

	public static void main(String[] args) {
		
		// 부호 연산자 - 
		
		int a = 10;
		int b = -10;
		System.out.println(-a);
		System.out.println(-b);
		
		// 증감연산자 ++, -- 전위, 후위 연산자 
		
		int c = 10;
		int d = 10;
		
		System.out.println(c++);
		System.out.println(++d); 
		// c:11
		// d:11
		int e = 20;
		int f = 20;
		int result1;
		int result2;
		
		result1 = --e; 
		result2 = f--; 
		// e:19
		// f:19
		System.out.println(result1); 
		System.out.println(result2); 
		
		System.out.println(e);
		System.out.println(f); 
		
		// 연산자 우선순위 : 사칙연산하기전에 증감연산자를 먼저 생각해줌
		int result3 = ++c + d-- + e++ + --f; // 12 + 11 + 19 + 18
		//윗줄 이후 변화 c: 12, d:10, e:20, f:18
		
	}

}
