package day10;

public class 생성자 {
	public static void main(String[] args) {
		
		
		//생성자란?
		//객체가 생성될 때 단 한 번 호출되어 객체의 값을 초기화 한다(객체의 초기화 담당 한다)
		//생성자를 하나라도 만들지 않으면 기본 생성자를 제공한다.
		//생성자 두는 이유?
		
		Student s = new Student(); // () => 생성자 
		s.printInfo();
		
		
		Student s2 = new Student("홍길동", 25);
		s2.printInfo();
		
		Student s3 = new Student("김길동");
		s3.printInfo();
	}
	
}
