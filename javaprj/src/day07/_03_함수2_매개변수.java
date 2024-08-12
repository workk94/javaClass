package day07;

public class _03_함수2_매개변수 {
	public static void main(String[] args) {
		//인사하기 메서드(함수) 만들기 : 매개변수 활용하기 
		
		int cnt = 3;
		
		hi2(cnt);
		
	}
	
	//인사하기
	//매개변수 : 외부로부터의 입력, 외부와 매개자역할을 하는 변수
	public static void hi2(int cnt) {
		for(int i = 0; i < cnt; i++) {
			System.out.println("하이! 즐거운 금요일");
		}
	}
	
}
