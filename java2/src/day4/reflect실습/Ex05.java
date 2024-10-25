package day4.reflect실습;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Ex05 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class clazz = Class.forName("day4.reflect실습.Member");
		Constructor c = clazz.getDeclaredConstructor();
		Member m = (Member) c.newInstance();
		m.printSquare(3);
	}
}
