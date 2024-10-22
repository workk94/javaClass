package day01.연습;

public class Char배열_문자열표현하기 {
	public static void main(String[] args) {
		// 문자열은 내부에 char[]을 가지고 있다

		// 문자열은 문자집합, 문자배열을 의미함

		String str = "hello";
		System.out.println(str);

		char[] str2 = {

				'h', 'e', 'l', 'l', 'o' };

		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
	}
}
