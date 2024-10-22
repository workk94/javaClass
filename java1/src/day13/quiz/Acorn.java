package day13.quiz;

public class Acorn {
	String id;
	String name;
	String phone;
	
	public Acorn(String id, String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	public void printInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
	}
}