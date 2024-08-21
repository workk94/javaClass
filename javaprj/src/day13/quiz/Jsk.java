package day13.quiz;

public class Jsk extends Acorn {
	private String address;
	private String email;
	
	public Jsk(String id, String name, String phone, String address, String email) {
		super(id, name, phone);
		this.address = address;
		this.email = email;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("주소 : " + address);
		System.out.println("이메일 : " + email);
	}
}
