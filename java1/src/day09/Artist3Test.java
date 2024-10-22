package day09;

public class Artist3Test {

	public static void main(String[] args) {
		
		Artist3 a = new Artist3("김범수", 44, 1999, "보고싶다");
		a.printArtist();

	}

	// a 객체(Artist객체라고 부름)
	// a 객체의 값이 임의로 변경될 일이 없다.
	// 생성자는 임의로 호출 할 수 없다.
	// new로 생성될 때 단 한번 호출됨
	// 생성된 객체의 초기화를 담당함
	
}
