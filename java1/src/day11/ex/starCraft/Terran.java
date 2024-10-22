package day11.ex.starCraft;

public class Terran extends StarCraftUnit{
	Terran(){
		System.out.println("테란생성자 호출");
	}
	
	Terran(String unitName, int health, int armor, int attackDamage, String attackType,
			int attackRange, String unitType, int costMineral, int buildTime){
		super(unitName, "Terran", health, armor, attackDamage, attackType, attackRange, unitType, costMineral, buildTime);
	}
	Terran(String unitName, int health, int armor, int attackDamage, String attackType,
			int attackRange, String unitType, int costMineral, int costGas, int buildTime){
		super(unitName, "Terran", health, armor, attackDamage, attackType, attackRange, unitType, costMineral, costGas, buildTime);
	}
}
