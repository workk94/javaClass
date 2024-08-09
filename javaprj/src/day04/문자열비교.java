//12
package day04;

public class 문자열비교 {
	public static void main(String[] args) {
		int su = 90;
		
		if(su == 90) {
			System.out.println("같다");
		}
		
		//문자열
//		String str = "I like java";
		String str= "stop";
		
		//문자열 비교, == (문자열 비교할 때 사용 못함)
		boolean result = str.equals("stop"); //false, 대소문자 구별한다
		
		System.out.println(result);
	}
}
