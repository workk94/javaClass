package day1.오늘의요리사;

public class 김정석 extends Cook implements 한식가능한{

	public 김정석(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String 비빔밥만들기() {
		String bibim = "전주비빔밥";
		
		return bibim;
	}


}
