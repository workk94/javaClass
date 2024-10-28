package day5.annotation.실습;

import java.lang.reflect.Field;

public class FruitStore검증하기 {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		 
		
	    FruitStore  s = new FruitStore(10,6);		
		
		//FruitStore  s = new FruitStore(8,5);
		
		
		
		// s객체의 필드정보 가져오기 
		// 필드에 붙여있는 애너테이션 정보가져오기 
		// 필드의 값  , 애너테이션의 값 비교 
		// 같은지 판단 !! 
		 
		
		Class clazz  =s.getClass();	
		
		Field[]   fields  = clazz.getDeclaredFields();
		
		
		for( Field  field  : fields) {			
			
			Count  annotation  = field.getAnnotation(Count.class);			
			//int 기대하는값 = annotation.value();
			
			//Count애너테이션이 붙어있는 필드에 대해서 실제 속성값과 애너테이션 값 얻어오기 
			if( annotation  != null) { 
				//
				int  필드의값  = (int)field.get(s) ; 				
				int  기대값  = annotation.value();
				
				if( 필드의값  !=기대값  ) {				
					throw new  RuntimeException(  field.getName()  +" 항목"  + 기대값 +"이어야 해 ");				
				}else {
					System.out.println(" 성공");
				}
			}
			
			
		} 

	} 
	
	
	

}
