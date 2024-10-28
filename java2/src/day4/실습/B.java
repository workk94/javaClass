package day4.실습;

public class B implements Cook {

	@Override
	public void doCook(Dish dish) {
		System.out.println("요리사 B가 '" + dish.getName() + "'를(을) 요리 중입니다.");
	}

}
