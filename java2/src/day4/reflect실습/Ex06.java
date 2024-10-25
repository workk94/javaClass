package day4.reflect실습;

import java.lang.reflect.Method;

public class Ex06 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("day4.reflect실습.Member");
		
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
	}
}
