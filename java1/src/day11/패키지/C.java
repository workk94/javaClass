package day11.패키지;

public class C extends B {
	public void printInfo() {
		//System.out.println(a);
		//not visible
		//System.out.println(b);
		//System.out.println(getB());
		
		//this 생략가능
		System.out.println(this.a);
		System.out.println(this.getB());
	}
}
