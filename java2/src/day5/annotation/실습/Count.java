package day5.annotation.실습;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 특정필드에 붙혀서  정해진 값만큼 가지는 애너테이션을 만들기 


@Retention(  RetentionPolicy.RUNTIME)
public @interface Count {	
	 int value() ;  //
	//int value() default 5;
}
