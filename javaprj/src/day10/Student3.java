package day10;

public class Student3 {

	String name;
	int age;
	
	// 매개변수가 있는 생성자
	public Student3(String name, int age) { 
		this.name = name;
		this.age = age;
	}
	
	//생성자를 만들면 기본생성자는 제공되지 않는다
	//기본생성자를 추가로 만들어 줘야 한다 
	//기본생성자 => 매개변수가 있는 생성자 
	public Student3() {
		
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}
