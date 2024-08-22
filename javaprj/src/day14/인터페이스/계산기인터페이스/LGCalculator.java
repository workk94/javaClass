package day14.인터페이스.계산기인터페이스;

public class LGCalculator implements CalculatorI{

	@Override
	public int add(int su1, int su2) {
		System.out.println("lg");
		return su1 + su2;
	}

	@Override
	public int sub(int su1, int su2) {
		System.out.println("lg");
		return su1-su2;
	}
	
}
