package day3.람다복습;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 람다복습 {

	public static void main(String[] args) {
		
		// 함수형 인터페이스: 구현해야 하는 추상매서드가 한 개인 인터페이스
		
		// 인터페이스를 구현하는 방법
		// 1. 이름있는 클래스로 인터페이스 상속
		// 2. 익명으로 인터페이스 상속해서 클래스 만들기
		// 3. 람다식으로 작성할 수 있다.
		
		/*
			interface Runnable{
				void run();
		 */
		
		Runnable r = ()->{
			System.out.println("놀기");
			System.out.println("건물사기");
		};
		
		r.run();
		//
		
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("놀기");
				System.out.println("건물사기");
			}};
			
		r2.run();
		//
		
		Consumer<Integer> c = (amt)->{
			System.out.println(amt);
			System.out.println("초콜릿 구매: 2000원");
			amt -= 2000;	// amt = amt-2000;
		
			System.out.println("빵 구매: 2000원");
			amt -= 2000;	// amt = amt-2000;
			System.out.println(amt);
		};
		
		c.accept(30000);
		//
		
		
		// 입력: X , 반환: O
		Supplier<String> s = ()->{
			return "솥뚜껑삼겹살";
		};
		
		String rtn = s.get();
		System.out.println(rtn);
		//
		
		
		
		// 판별
		// 매개변수: O , 반환: boolean
		/*
			interface Predicate<T>{
				boolean test(T t);
			}
		 */
		Predicate<String> p = (item)->{
			if(item.equals("솥뚜껑삼겹살")) {
				return true;
			}else {
				return false;
			}
		};
		
		boolean rtn2 = p.test("솥뚜껑삼겹살");
		boolean rtn3 = p.test("삼겹살라면");
		
		if(rtn2 == true) {
			System.out.println("네 이 요리가 맞습니다");
		}
		
		/*
							T: 입력 , R: 반환
			interface Function<T,R>{
				R apply(T t);
			}
		 */
		
		Function<Integer, Integer> f = (t)->{
			return t*t;
		};
		int result = f.apply(1000);
		System.out.println(result);
		
		
	}

}
