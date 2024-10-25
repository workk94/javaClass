package day4.reflect실습;

public class Ex04 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class clazz = Class.forName("day4.reflect실습.Member");
		Member member = (Member)clazz.newInstance();
		
		member.printSquare(6);
	}
}
