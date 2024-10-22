package day09.성적;

public class StudentTest {
	public static void main(String[] args) {
		Student a; // a 참조형 변수, a 객체 
		a = new Student();
		
		a.input("dodo", 100, 99);		
		a.printInfo();
		
//		a.calcTotal();
//		a.calcAvg();
		a.calcGrade();
		
		a.printInfo();
		
		
		Student b = new Student();
		b.input("홍길동", 50, 60);
		b.calcGrade();
		b.printInfo();
	}
}
