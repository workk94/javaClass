package day13.quiz;

public class Main {
	public static void main(String[] args) {
		
		String id1 = "soso";
		String name1 = "student";
		String phone1 = "010-0000-0000";
		
		String id2 = "ddd";
		String name2 = "김정석";
		String phone2 = "010-0000-0000";
		String address2 = "서울시";
		String email2 = "ddd@ddddd.com";
		
		
		
		Acorn student = new Acorn(id1, name1, phone1);
		Jsk jsk = new Jsk(id2, name2, phone2, address2, email2);
		
		student.printInfo();
		jsk.printInfo();
	}
}
