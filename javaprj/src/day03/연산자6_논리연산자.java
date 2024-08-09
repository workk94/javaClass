package day03;

public class 연산자6_논리연산자 {

	public static void main(String[] args) {
		// 논리연산자
		int kor=80;
//		int kor = 91;
		int eng=90;
		
		//장학금 지급여부 두 과목다 90이상 이여야 한다 
		boolean result = kor>=90 && eng>=90;
		
		String result2 = result==true?"장학금 지급대상자" : "장학금 미대상";
//		String result2 = result ?"장학금 지급대상자" : " ";
		System.out.println(result2);
		
		
		boolean result3 = kor >= 90 || eng >=90;
		String result4 = result3? "장학금 ㅊㅋ" : "다음에";
		System.out.println(result4);
		
		boolean result5 = kor >= 90;
		System.out.println(result5); // false
		boolean result6 = !(kor >=90); // 논리부정 참 -> 거짓, 거짓 -> 참 
		System.out.println(result6); // true
	}

}
