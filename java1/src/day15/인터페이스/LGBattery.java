package day15.인터페이스;

public class LGBattery implements Battery{
	@Override
	public void getEnergy() {
		System.out.println("LG 배터리를 얻어온다");
	}
}
