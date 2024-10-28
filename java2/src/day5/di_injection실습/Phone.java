package day5.di_injection실습;

public class Phone {

	// 의존성
	Battery battery; // 참조형변수의 기본값 null

	// 의존성 주입 (생성자, 세터를 이용)

	//

	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(Battery battery) {
		super();
		this.battery = battery;
	}

	public void powerOn() {
		// 배터리 통해서 에너지 얻어오기
		battery.getEnergy();
		System.out.println("파워가 켜집니다");
	}

	public void displayMenu() {
		System.out.println("1. 전화걸기 2. 문자보내기");
	}
}
