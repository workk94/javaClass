package day15.인터페이스;

public class SMBattery implements Battery{
	@Override
	public void getEnergy() {
		System.out.println("삼성 배터리를 얻어온다");
	}
}
