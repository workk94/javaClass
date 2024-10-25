package day4.reflect실습;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("day4.reflect실습.Member");

		Field[] fields = clazz.getDeclaredFields();

		for (Field field : fields) {
			System.out.println(field);
		}

		Arrays.stream(fields).forEach(s -> System.out.println(s));
	}
}
