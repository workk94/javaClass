package day12.jsk;

public class Pickachu extends Pokemon {
	
	public Pickachu(String trainer){
		super(trainer);
		this.name = "피카츄";
	}
	
	public void thunder() {
		System.out.println("백만볼트 발사");
	}
	
	@Override
	public void growl() {
		System.out.println("피카피카");
	}
	
	@Override
	public void evolve() {
		if(this.exp > 10000) {
			this.setName("라이츄");
			System.out.println(this.name + "으로 진화합니다");
		}
	}
	
}
