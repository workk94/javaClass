package day14.인터페이스;

public class 김정석 implements 나는게가능한, 변신가능한 {
	// field
	김정석 k;
	boolean stateFly = false;

	// method
	@Override
	public void 변신하기() {
		System.out.println("날개달음");
	}

	public void 변신하기(김정석 k) {
		System.out.println("김정석 : 날개달음");
		k.setFly(true);
	}

	@Override
	public void 날수있다() {
		System.out.println("날수있다");
	}

	public void 날수있다(김정석 k) {
		String str = "\\\\\r\n" + " \\\\\r\n" + "  \\\\ \r\n" + "   <(')";
		if (k.getFly() == true) {

			System.out.println("김정석 : ");
			System.out.println(str);
		} else {
			System.out.println("김정석 : 하늘을 못난다");
		}
	}

	// getter,setter
	public boolean getFly() {
		return stateFly;
	}

	public void setFly(boolean state) {
		this.stateFly = state;
	}

	// test

	public static void main(String[] args) {
		김정석 a = new 김정석();
		a.변신하기(a);
		a.날수있다(a);
	}

}
