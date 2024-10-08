package day06;

public class _05_힙메모리 {
	public static void main(String[] args) {
		// 힙메모리
		// 자바는 배열부터는, (객체) 힙 메모리를 사용하도록 강제되어 있다.
		// 힙메모리 얻어오는 방법
		// 필요할 때 요청하고 사용이 끝나면 즉시 반납할 수 있다.
		// 자바는 직접반납하지 않고 대신해주는 가비지컬렉터를 제공한다.

		// new 연산자를 사용한다
		// new 연산자는 요청한 메모리를 확보하고 확보된 메모리의 주소를 반환한다
		// 그 주소를 반드시 기억하고 공간을 사용해야한다.
		// 주소를 저장할 변수. 참조형변수를 사용하게 된다.

		int[] arr = new int[3];
		// arr : 변수 => 주소를 기억하는 변수(참조형변수)

		// 기본형변수 : 실제 값 자체를 저장하는 변수

		int kor_score = 90; // => 실제 DATA를 저장하는 변수(기본형 변수이다)

	}
}
