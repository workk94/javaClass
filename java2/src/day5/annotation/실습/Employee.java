package day5.annotation.실습;

import java.lang.reflect.Field;

public class Employee {
	
	String name;
	
	@WeekDaysAvail( {"Monday" ,"Wednesday" ,"Friday" })
	String 쉬는요일;

	
	public Employee(String name, String 쉬는요일) {
		super();
		this.name = name;
		this.쉬는요일 = 쉬는요일;
	}
	 
	
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		//Employee   e = new Employee("길동", "Thirthday");
		
	    Employee   e = new Employee("길동", "Monday");
		
		//객체의 필드정보 가져오기
		Field field  = e.getClass().getDeclaredField("쉬는요일");
		//개체의 필드의 값 가져오
		field.setAccessible(true);
		String value  = (String) field.get(e);
		System.out.println( "쉬는요일" + value);
		
		
		//필드의 애너테이션 정보가져오기
		WeekDaysAvail  annotation  = field.getAnnotation(WeekDaysAvail.class);
		
			
		String[] days = annotation.value();	
		
		boolean flag=false;
		for( String day : days) {
			System.out.println( day);
			
			if( day.equals(value)) {
				flag=true;
			}
		}
		
		
		
		if( flag==false) {
			System.out.println(  "쉴 수 없는 요일이다");
		}else {
			System.out.println(  "쉴 수 있는 요일입니다");
		}
		
		
		
		
	}
}
