package day14.ex;

public class Main {
	public static void main(String[] args) {
		LegoApp app = new LegoApp();
		app.setLego(new Maker());
		app.run();
	}
}
