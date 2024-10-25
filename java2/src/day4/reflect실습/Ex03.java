package day4.reflect실습;

public class Ex03 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		
		//객체로부터 클래스 정보 얻어오기
		Member m = new Member();
		Class clazz = m.getClass();
		
		Member member = (Member) clazz.newInstance();
		member.printSquare(5);
		
	}
}
