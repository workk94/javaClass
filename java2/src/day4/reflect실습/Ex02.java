package day4.reflect실습;

public class Ex02 {
	
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		
		//1.클래스정보 얻어오기, 클래스로 부터 클래스 정보 얻어오기
		
		Class clazz = Member.class; // 
		
		//2. 클래스정보를 가진 clazz객체를 이용해서 객체를 생성할 수 있다
		
		Member m = (Member) clazz.newInstance();
		
		m.printSquare(3);
		
	}
}
