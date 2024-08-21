package day09;

public class Artist2Test {

	public static void main(String[] args) {
		
		// 변수	(참조형변수) -> 객체
		Artist2 a2 = new Artist2();		// 변수
		
		
		// Artist2 객체가 생성된 이후부터 멤버 매서드를 사용할 수 있다.
		a2.input("김범수", 45, 1999, "보고싶다");
		a2.printArtist();
		
		// a2.age = 44;
		
		// 단단한 캡슐을 만들기 위한 도구 1. 접근제어자
		// 접근제어자 :
		// public: 모두공개
		// private: 클래스 내부에서만 접근가능 
		// default(접근 생략하면): 같은 패키지에서만 접근 가능(같은 폴더를 의미함)
		
		// 멤버변수 => private 으로 변경
		
		
		// 단단한 캡슐을 만들기 위한 도구 2. 생성자
		a2.input("김범수", 44, 1999, "보고싶다");
		a2.printArtist();
		
		// 생성자: 매서드(특별한 매서드)
		// 객체가 new 생성될 때 단 한번 호출되어 객체의 초기화를 담당한다.
		
	}



}
