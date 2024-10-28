package day5.annotation.실습;

public class MyLib2 {
//	@BeforeAndAfter(before="  ----- before ------------------!!!")
	//@BeforeAndAfter(after="  ----- after ------------------!!!")
	@BeforeAndAfter( before =" ---before  after  ---^^^" , after=" ----- after ------------------bye!!!")
	public void myMethod() {
		System.out.println("매서드가 실행된다");
	}
}
