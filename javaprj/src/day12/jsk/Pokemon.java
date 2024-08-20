package day12.jsk;

public class Pokemon {
	
	// filed
	protected String name = "";
	protected String trainer;
	protected int exp = 0;
	
	// constructor
	public Pokemon () {
	}
	public Pokemon (String trainer) {
		this.trainer = trainer;
	}
	
	// method
	
	public void eat() {
		System.out.println(this.name + " (이/가) 간식을 먹습니다");
	}
	
	public void sleep() {
		System.out.println(this.name + " (이/가) 잠을 잡니다");
		System.out.println("zzz...");
	}
	
	public void growl() {
		System.out.println("override");
	}
	
	public void evolve() {
		if (this.exp < 5000) {
			System.out.println("1단계 진화");
		}
		else if(this.exp  >= 5000 || this.exp < 10000) {
			System.out.println("2단계 진화");
		} else if (this.exp > 10000){
			System.out.println("3단계 진화");
		}		
	}
	
	//setter, getter
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getTrainer() {
		return trainer;
	}
	
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	
	public int getExp() {
		return exp;
	}
	
	// 경험치 음수 x
	public void setExp(int exp) {
		if (exp < 0) {
			this.exp = 0;
		} else {
			this.exp = exp;
		}
	}

}
