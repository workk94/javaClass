package day08;
 
public class _04_callByValue_값에의한_호출 {

	public static void main(String[] args) {

		// call by value : 매서드(함수)호출할 때 실제data 값이 전달되는 경우를 말한다.

		int su1 = 10;
		int su2 = 3;
		// 인수 , 인자
		int result = adder(su1, su2); // 호출시 실제 data값이 전달됨

	}

	public static int adder(int su1, int su2) { // 매개변수
		int total;
		total = su1 + su2;
		return total;

	}

}