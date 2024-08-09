package day07;

public class _06_함수5_입력반환연습하기1 {

	public static void main(String[] args) {
		// 매서드안에서 변수를 만든다(지역변수) => main 메서드에서만 유효범위 갖는다
		a();

		b('★');

		String rtn = c();
		System.out.println(rtn);

		int rtn2 = d();
		System.out.println(rtn2);
		
		int[] rtn3 = f();
		for(int i = 0; i<rtn3.length; i++) {
			System.out.println(rtn3[i]);
		}
		
		int rtn4 = getTotal(10);
		
		System.out.println(rtn4);
	}

	// 매서드 만들기1
	// 입력 x 반환x
	public static void a() { // a 메서드에서 만든 변수는 a메서드에서만 유효범위를 갖는다(메서드가 반환될때 변수들을 정리한다)
		System.out.println("이것이 함수다");
	}

	// 입력o, 반환 x

	public static void b(char ch) {
		System.out.println(ch);
	}

	// 입력 x, 반환 o
	public static String c() {
		return "즐거운 금요일";
	}

	// 입력 o, 반환 o
	public static int d() {
		return 7;
	}

	// 입력 o, 반환 o (어떤 수에 대한 약수 구하기)
	public static int[] f() {
		int[] result = new int[6];
		result[0] = 1;
		result[1] = 2;
		result[2] = 3;
		result[3] = 4;
		result[4] = 6;
		result[5] = 12;
		
		return result;
	}
	
	//입력 : o , 수
	//반환 : o, 1~수까지의 합 
	public static int getTotal(int su) { // 1~su까지 합
		
		int sum = 0;
		for(int i = 1; i<=su; i++) {
			sum += i;
		}
		
		return sum;
	}
}
