package day11.스태틱변수;

public class Customer {

	//인스턴스 변수     => new에 의해서 메모리 확보됨 
	String id;
	String pw;
	String name;
	
	//static변수
	static int cnt;
	
	
	//생성자
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String id, String pw, String name) {	 
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
 
	
	//객체의 정보를 반환하는 매서드 
	public String toString() {
		return "Customer [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
		
	
	 
	
	
}
