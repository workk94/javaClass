package day5.annotation.실습;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 매서드에 실행전과 실행후에 특정코드를 실행하는 애너테이션 만들기 


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BeforeAndAfter {
	String before() default "";
	String after() default "";
}
