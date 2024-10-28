package day5.di_injection실습;

public class SMBattery implements Battery{

	@Override
	public void getEnergy() {
			System.out.println("삼성 Battery 에너지 얻어오기 !!");
		
	}
	
}
