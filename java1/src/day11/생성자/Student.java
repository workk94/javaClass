package day11.생성자;

public class Student extends Person {
	int classNo;
	
	//생성자
	
	//기본 생성자
	public Student() {
		
	}
	
	public Student(String name, String id, int classNo) {
		//부모의 생성자를 호출하게 강제되어 있다, 부모의 기본생성자가 없으면 오류가 발생함!
		//부모의 생성자 호출방법 : super()
		super(name, id);
//		부모의 매개변수가 있는 생성자를 통해서 초기화 될 수 있도록 한다
//		this.name = name;
//		this.id = id;
		this.classNo = classNo;
	}
	
	
	public void output() {
		System.out.println("이름=" + name);
		System.out.println("아이디=" + id);
		System.out.println("반=" + classNo);
	}
	
	public static void main(String[] args) {
		Student s = new Student("김정석", "ddd", 304);
		s.output();
	}
}
