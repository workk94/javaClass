package day08;

public class _01_함수사용이유1_중복코드제거 {

	public static void main(String[] args) {
		// 양치질하기
		/*
		 * System.out.println("치약을 짠다"); 
		 * System.out.println("이를 닦는다");
		 * System.out.println("헹군다");
		 */
		양치질하기(); 
		
		// 양치질하기
		/*
		 * System.out.println("치약을 짠다"); 
		 * System.out.println("이를 닦는다");
		 * System.out.println("헹군다");
		 */
		양치질하기();
		
		// 양치질하기
		/*
		 * System.out.println("치약을 짠다"); 
		 * System.out.println("이를 닦는다");
		 * System.out.println("헹군다");
		 */
		양치질하기();
	}
	//함수 : 명령의 집합, (명령 덩어리)
	// 양치질하기
	public static void 양치질하기() {
		System.out.println("치약을 짠다");
		System.out.println("이를 닦는다");
		System.out.println("헹군다");
	}
}
