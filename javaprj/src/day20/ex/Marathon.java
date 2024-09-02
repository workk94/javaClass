package day20.ex;

public class Marathon {
	public static void main(String[] args) {
		Turtle t = new Turtle();
		Rabit r = new Rabit();
		
		
		t.start();
		r.start();
	}
}


class Turtle extends Thread {
	@Override
	public void run() {
		setName("거북이");
		int i = 2000;
		while( i > 0) {
			System.out.println(Thread.currentThread() + " : "  +"기어간다");
			System.out.println("남은거리 : " + i + "m");

			i--;
		}
		
	}
}

class Rabit extends Thread {
	
	@Override
	public void run() {
		setName("토끼");
		int i = 2000;
		while( i > 0) {
			System.out.println(Thread.currentThread() + " : "  +"뛰어간다");
			System.out.println("남은거리 : " + i + "m");

			i = i - 5;
		}
		
	}
}
