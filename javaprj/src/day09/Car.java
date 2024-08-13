package day09;



//Car 자동차 정보를 담을 수 있는 자료형을 설계
// 속성(데이터, 필드)  +  속성을 사용하는 매서드  => 캡슐  ,  데이터보호 :   접근제어자  , 생성자
public class Car {
	
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	
	//입력하기	
	public void input( String company , String model, String color, int maxSpeed) {
		this.company  = company;
		this.model  = model;
		this.color  = color;
		this.maxSpeed = maxSpeed;
		
		
	}
	
	//출력하기
	//인스턴스 매서드
	//인스턴스 매서드 : 객체가 생성된 이후부터 사용할 수 있다.	
	public   void printInfo() {
		System.out.println( company);
		System.out.println( model);
		System.out.println( color);
		System.out.println( maxSpeed); 
	}

}
