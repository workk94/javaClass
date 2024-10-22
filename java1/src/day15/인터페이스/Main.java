package day15.인터페이스;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		HandPhone phone = new HandPhone();
		
		//phone.setBattery(new LGBattery());
		//phone.setBattery(new SMBattery());
		//익명클래스 작성 : 상속받으면서 클래스를 만들 때 
						// 객체생성
		phone.setBattery(new Battery() {
			@Override
			public void getEnergy() {
				System.out.println("에이콘 배터리 에너지를 얻어온다");
			}
		});
		
		//3.람다식
		phone.setBattery(()->System.out.println("배터리를 얻어온다"));
		
		phone.powerOn();
		
		//인터페이스를 구현하는 방법
		//1.이름있는 클래스를 만들기(인터페이스를 상속하기)
		//2.익명 클래스 만들기 
		//3.람다식으로 만들기 
	}
}
