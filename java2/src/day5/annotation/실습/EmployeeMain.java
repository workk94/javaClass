package day5.annotation.실습;

import java.lang.reflect.Field;

public class EmployeeMain {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
	
		
		Employee e  = new Employee("홍길동" ,"목요일"); 
		//객체의 필드검증 	
		
		검증하기(e);
	}
	
	
	public static void 검증하기( Object obj ) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		
		
		//
		Class clazz  = obj.getClass();
		//특정필드 가져오기
		Field  field  = clazz.getDeclaredField("쉬는요일");
		
		
		//필드 
		// 필드의 값 가져오기 
		// 필드의 애너테이션 값 가져오기 
		// 두 값을 비교 
		
		//필드의 값 
		String value  =(String) field.get(obj);
		
		//필드의 애너테이션의 값		
		WeekDaysAvail  annotation  = field.getAnnotation( WeekDaysAvail.class);		
		String[] 기대값  = annotation.value();
		
		
		boolean flag=false;
		for( String day :  기대값) {
			
			if( day.equals(value)) {
				flag =true;
			}
		}
		 
		
		
		if( flag ) {
			System.out.println(value +"요일 쉴 수 있어요"  );
			
		}else {
			System.out.println(value +"요일 쉴 수 없어요"  );
		}
		
		
	}
	
	

}
