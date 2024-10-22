package day12.jsk;

public class Main {
	public static void main(String[] args) {
		
		//업캐스팅
		Pokemon[] pokemonArr = new Pokemon[3];
		
		pokemonArr[0] = new Pickachu("지우");
		pokemonArr[1] = new Ggobugi("이슬이");
		pokemonArr[2] = new Pickachu("내꺼");
		
		//다운캐스팅
		Ggobugi ggobugi = (Ggobugi)pokemonArr[1];
		ggobugi.growl();
		ggobugi.setExp(8000);
		ggobugi.evolve();
		String statusAfter = ggobugi.getName();
		System.out.println(statusAfter);
		
		System.out.println();
		
		
		for(int i = 0; i < pokemonArr.length; i++) {
			if(pokemonArr[i] instanceof Pickachu && pokemonArr[i].getTrainer() == "내거") {
				System.out.println(pokemonArr[i].getTrainer());
				((Pickachu)pokemonArr[i]).thunder();
				break;
			}
			pokemonArr[i].eat();
			pokemonArr[i].sleep();
			pokemonArr[i].growl();
			
		}
//		myPickachu.setExp(10000);
//		myPickachu.getName();
		
	}
}
