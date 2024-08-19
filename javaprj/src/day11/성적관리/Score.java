package day11.성적관리;


public class Score {
	
	//
	//인스턴스변수 ( 인스턴스  멤버변수)
	private String name;
	private int kor;
	private int eng;
	private double avg;
	private char grade;
	
	
	
	//생성자 , 객체의 초기화를 담당  , 기본생성자가 제공됨 
	//매개변수가 없는 생성자 : 디폴트생성자 
	public Score() {
		
	}
	
	
	public Score( String name, int kor, int eng) {
		this.name  = name;
		this.kor = kor;
		this.eng = eng;
		
		calc();
	}
	
	//매서드
	public String toString() {		
		return name + " " + kor + " " + eng + " " + avg + " " + grade ;
	}
	
	//추가적인 매서드
	//인스턴스 매서드  ( 사용시점:객체가 생성된 이후부터 사용) , 약속 : 객체의 정보가 전달되는것이 약속되어있음  this)
	
	private void calc( ) {
		//avg
		//grade
		
		int total  = this.kor + eng;
		avg = total /2.0;
		
		
		if( avg >=90) {
			grade='A';
		}else if( avg>=80) {
			grade='B';
		}else if( avg>=70) {
			grade='C';
		}else {
			grade='F';
		}		
		
	}
	
	
	//멤버변수(필드) 값을 얻어오거나 get, 변화시킬 set때 약속된 메서드를 사용한다
	//setter set필드이름(필드이름 첫글자 대문자로)
	//getter get필드이름(필드이름 첫글자 대문자로)
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
