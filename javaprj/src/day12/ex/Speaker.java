package day12.ex;

public class Speaker extends Audio{

	
	@Override
	public void sound() {
		if(volume>0)
			System.out.println("스피커에서 소리가 나온다");
		else 
			System.out.println("스피커 음소거");
	}
	
	
}
