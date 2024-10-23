package day1.인터페이스_static_default;

public class C요리사 implements 한식요리가능한{

	@Override
	public void 구절판만들기() {
		System.out.println("구절판 만들기");
		
	}

	@Override
	public void 불고기전골만들기() {
		System.out.println("불고기전골 만들기");
		
	}
	
	
	//default
//	@Override
//	public void 김치만두만들기() {
//		System.out.println("실비김치만두 만들기");
//	}

}
