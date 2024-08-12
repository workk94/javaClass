package day05;

public class _01_변수와배열 {

	public static void main(String[] args) {
		//변수 5개
		//변수는 변수이름으로 접근한다
		//변수는 반복문으로 사용할 수 없다
		
		// 문자열
		String drama1 = "카지노";
		String drama2 = "아이언맨";
		String drama3 = "데스티네이션";
		String drama4 = "눈물의여왕";
		String drama5 = "낮과밤이 다른그녀";
				
		System.out.println(drama1);
		System.out.println(drama2);
		System.out.println(drama3);
		System.out.println(drama4);
		System.out.println(drama5);
		
		//문자열배열
		//배열을 만들 때는 개수를 명시해야 한다 
		String[] dramas  = new String[5];
		
		dramas[0] = "카지노";
		dramas[1] = "아이언맨";
		dramas[2] = "데스티네이션";
		dramas[3] = "눈물의여왕";
		dramas[4] = "낮과밤이 다른그녀";
		
		//배열의 요소에 접근한 수 값을 저장하거나 읽어올 수 있다.
		//배열명[첨자] => 요소에 접근할 수 있다.
		//첨자(index)는 0부터 시작한다
		//0의 의미 : 기준으로부터 떨어진 offset(기준으로부터 자료형의 크기만큼 떨어진 거리)
		//첨자는 변수를 사용할 수 있다.
		//배열은 반복구조에서 다룰 수 있다.
		System.out.println(dramas[0]);
		System.out.println(dramas[1]);
		System.out.println(dramas[2]);
		System.out.println(dramas[3]);
		System.out.println(dramas[4]);
		
		//i변수 : 반복제어변수, 배열의 첨자로 사용되는 변수
		for(int i = 0; i < 5; i++) {
			System.out.println(dramas[i]);
		}
	}

}
