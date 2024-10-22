package day09;

// Artist 정보를 담기 위한 자료형 설계하기
// Artist 정보(데이터) + Artist데이터를 다루는 함수(매서드)를 하나의 단위로 설계한다.(캡슐)
public class Artist2 {

	// 멤버 변수(변수가 생성된건 아님!!)
	private String newName; 
	private int age;
	private int debut;
	private String titleSong;

	
	// 멤버 매서드: 멤버변수를 다루는 기능(함수, 매서드)
	public void input(String newName, int age, int debut, String titleSong) {
		
		this.newName = newName;
		this.age = age;
		this.debut = debut;
		this.titleSong = titleSong;
	}
	
	
	// 멤버 매서드
	public void printArtist() {
		System.out.println(this.newName);	// this 생략할 수 있다.
		System.out.println(this.age);
		System.out.println(this.debut);
		System.out.println(this.titleSong);
	}
	
}
