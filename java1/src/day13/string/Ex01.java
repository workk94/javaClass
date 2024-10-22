package day13.string;

public class Ex01 {
	public static void main(String[] args) {
		//문자열 : 문자 여러개, 문자집합 (문자를 연속적으로 여러개 사용), 문자배열
		//문자 : 문자 한 개
		
		char ch = 'a';
		
		//hello
		
		char[] hi = new char[5];
		hi[0] = 'h';
		hi[1] = 'e';
		hi[2] = 'l';
		hi[3] = 'l';
		hi[4] = 'o';
		
		for(int i = 0; i < hi.length; i++) {
			System.out.print(hi[i]);
		}
	}
}
