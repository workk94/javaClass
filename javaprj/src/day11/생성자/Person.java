package day11.생성자;

public class Person {
	protected String name;
	protected String id;
	
	
	//기본생성자 있음
	public Person() {
		System.out.println("기본 생성자 call");
	}
	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public void disp() {
		System.out.println("이름=" + name + "\t아이디=" + id);
	}
}
