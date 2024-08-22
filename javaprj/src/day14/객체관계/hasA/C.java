package day14.객체관계.hasA;

public class C {
	D d;
	
	public void setD(D d) {
		this.d = d;
	}
	
	public void C매서드() {
		System.out.println("C매서드");
		d.D매서드();
	}

}
