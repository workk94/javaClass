package day12.jsk;

public class Ggobugi extends Pokemon{
	public Ggobugi(String trainer){
		super(trainer);
		this.name = "꼬부기";
		
	}
	
	public void waterPump(){
		System.out.println("물대포 발사");
	}
	@Override
	public void growl() {
		System.out.println("꼬북꼬북");
	}
	
	@Override
	public void evolve() {
		super.evolve();
		if(this.exp  >= 5000 || this.exp  < 10000) {
			this.setName("어니부기");
			System.out.println(this.name + "으로 진화합니다");
		} else if (this.exp  > 10000){
			this.setName("거북왕");
			System.out.println(this.name + "으로 진화합니다");
		}		
	}
}
