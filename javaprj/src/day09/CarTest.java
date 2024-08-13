package day09;

public class CarTest {

	public static void main(String[] args) {
		Car c; // c객체, 참조형 변수
		c = new Car();	// Car형으로 new에 의해서 메모리 확보하고 확보된 주소를 반환함
						// c라는 참조형변수에 확보된 주소가 기억됨
		
		//객체
		c.input("현대자동차", "산타페", "베이지", 200);
		c.printInfo();
		
		//객체 배열
		
	}

}
