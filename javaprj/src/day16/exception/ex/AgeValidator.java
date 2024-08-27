package day16.exception.ex;

public class AgeValidator {
	public boolean isAudult(int age) throws InvalidSSNFormatException {
		
		if(age < 0 || age > 150) {
			throw new AgeOutOfRangeException();
		}
		
		if(age >= 19) {
			System.out.println("성인입니다");
			return true;
		} else {
			System.out.println("미성년자입니다");
			return false;
		}
		
	}
}
