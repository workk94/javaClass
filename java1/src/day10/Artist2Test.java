package day10;

import day09.Artist2;

public class Artist2Test {

	public static void main(String[] args) {
		// 클래스 이름은 패키지 정보를 포함한다
		// 다른 패키지(폴더)에 있는 클래스를 사용할 때는 패키지를 명시해야한다
		// 패키지 이름을 명시하는 대신 import 문을 사용할 수 있다
		// day09.Artist2 a = new day09.	Artist2();
		
		Artist2 a = new  Artist2();
		
		a.input("아이유", 30, 2002, "좋은날");
		a.printArtist();
	}

}
