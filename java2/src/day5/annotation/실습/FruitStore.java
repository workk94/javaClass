package day5.annotation.실습;


 
public class FruitStore {
	
	
	@Count(10)
	int apples;
	
	@Count(value =6)    // value 생략할 수  있음 
	int bananas;


	public int getApples() {
		return apples;
	}


	public void setApples(int apples) {
		this.apples = apples;
	}


	public int getBananas() {
		return bananas;
	}


	public void setBananas(int bananas) {
		this.bananas = bananas;
	}


	public FruitStore(int apples, int bananas) {
		super();
		this.apples = apples;
		this.bananas = bananas;
	}
	
	public FruitStore() {
		// TODO Auto-generated constructor stub
	}
	
	

}
