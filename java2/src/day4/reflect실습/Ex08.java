package day4.reflect실습;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex08 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, InvocationTargetException {

		Member m = new Member();
		m.printInfo(); // 매개변수로 객체의 정보가 전달됨
		m.printSquare(3); // 매개변수로 객체의 정보가 전달됨

		Class clazz = Class.forName("day4.reflect실습.Member");

		// 매개변수 없음
		Method method = clazz.getDeclaredMethod("printInfo");
		System.out.println("---------------------");
		method.invoke(m);

		Method method2 = clazz.getDeclaredMethod("printSquare", int.class);
		System.out.println("---------------------");
		method2.invoke(m, 10);
	}
}
