package day11.ex.starCraft;

public class StarCraftUnit {
	// 필드
	protected String unitName; // 이름
	protected String race; // 종족
	protected int health; // 체력
	protected int armor; // 방어력
	protected int attackDamage; // 공격력
//	protected double attackSpeed; // 공격속도
//	protected double movementSpeed; // 이동속도
	protected String attackType; // 공격유형
	protected int attackRange; // 사정거리
	protected String unitType; // 유닛유형
	protected int costMineral; // 유닛생산 비용(미네랄)
	protected int costGas; // 유닛생산 비용(가스)
	protected int buildTime; // 유닛생산 시간

	// 생성자

	StarCraftUnit() {
		System.out.println("StracraftUnit 생성자 호출");
	}

	StarCraftUnit(String unitName, String race, int health, int armor, int attackDamage, String attackType,
			int attackRange, String unitType, int costMineral, int buildTime) {
		this.unitName = unitName;
		this.health = health;
		this.armor = armor;
		this.attackDamage = attackDamage;
		this.attackType = attackType;
		this.attackRange = attackRange;
		this.unitType = unitType;
		this.costMineral = costMineral;
		this.buildTime = buildTime;
	}

	StarCraftUnit(String unitName, String race, int health, int armor, int attackDamage, String attackType,
			int attackRange, String unitType, int costMineral, int costGas, int buildTime) {
		this.unitName = unitName;
		this.health = health;
		this.armor = armor;
		this.attackDamage = attackDamage;
		this.attackType = attackType;
		this.attackRange = attackRange;
		this.unitType = unitType;
		this.costMineral = costMineral;
		this.costGas = costGas;
		this.buildTime = buildTime;
	}

	// 메서드
	public void move() {
		System.out.println(this.unitName +" 이동");
	}

	public void stop() {
		System.out.println(this.unitName + " 정지");
	}

	public void attack() {
		System.out.println( this.unitName + " 공격");
	}

	public void patrol() {
		System.out.println(this.unitName + " 정찰");
	}

	public void hold() {
		System.out.println(this.unitName + " 	홀드");
	}

}
