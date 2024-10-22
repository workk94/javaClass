package day11.ex.starCraft;

public class Main {
	public static void main(String[] args) {
		Terran test = new Terran();
		Terran marine = new Terran("해병", 100, 0, 6, "normal", 4, "생체", 50, 24);
		
		marine.move();
		marine.patrol();
		
		
		int armor = marine.armor;
		System.out.println(armor);
		int attackDamage = marine.attackDamage;
		System.out.println(attackDamage);
	}
}
