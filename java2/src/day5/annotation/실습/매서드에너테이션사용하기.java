package day5.annotation.실습;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class 매서드에너테이션사용하기 {
	public static void main(String[] args)
			throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {

		MyLib2 lib = new MyLib2();

		검증하기(lib);

	}

	private static void 검증하기(Object obj)
			throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		// TODO Auto-generated method stub

		Class clazz = obj.getClass();
		Method method = clazz.getDeclaredMethod("myMethod");

		// 매서드의 실행
		// 매서드의 애너테이션 가져오기
		// 매서드실행 전 후에 애너테이션 before, after 실행되게 하기
		BeforeAndAfter annotation = method.getAnnotation(BeforeAndAfter.class);

		// 해당애너테이션이 있는 경우
		if (annotation != null) {
			String before = annotation.before();
			if (before != null) {
				System.out.println(before);
			}
			
			//매서드 실행하기
			//첫번째는 호출할 객체, 두번째는 매개변수 
			method.invoke(obj); // 객체.매서드()

			String after = annotation.after();
			if (after != null) {
				System.out.println(after);
			}
		}
	}
}
