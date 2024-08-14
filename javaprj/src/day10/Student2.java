package day10;

public class Student2 {
	String name;
	int age;
	
	
	
	public Student2() {    // 생성자끼리는 호출이 가능, 맨 앞줄에서만 가능하다 
		//name="아무개";
		//age=20;
		
		this("아무개", 20);    // 다른 생성자를 호출하는 코드   
	}

	public Student2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student2(String name) {
		//this.name = name;
		//this.age = 10;
		this(name, 10);
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}
