package day09;

public class PocketMon {
	private String pokName; // 이름
	private int pokId; // 포켓몬 번호
	private String type; // 타입
	private static int healthPoint = 1000; // 체력
	private int attackPoint; // 공격력
	private String[] skills; // 스킬
	int level = 1; // 레벨
	
	
	// 포켓몬 정보 입력  
	public void input(String pokName, int pokId, String type, int attackPoint, String skill) {
		this.pokName = pokName;
		this.pokId = pokId;
		this.type = type;
		this.attackPoint = attackPoint;
		this.skills = inputSkill(skill);
	}
	
	
//	PocketMon(String pokName, int pokId, String type, int attackPoint){
//			this.pokName = pokName;
//			this.pokId = pokId;
//			this.type = type;
//			this.attackPoint = attackPoint;
//		}
	
	
	// 포켓몬 정보 출력
	public void printInfo(PocketMon this) {
		System.out.println("포켓몬 이름 : "+ pokName);
		System.out.println("도감번호 : " + pokId);
		System.out.println("타입 : " + type);
		System.out.println("레벨 : " + level);
		System.out.println("체력 : " + healthPoint);
		System.out.println("공격력 : " + attackPoint);
		System.out.println("<<보유 스킬>>");
		showSkill(this.skills);
		System.out.println();
	}
	
	// 현재 진화상태
	public void printLevel() {
		if(level < 16) {
			System.out.println(this.pokName + " 진화 1단계");
		} else if (level >= 16 && level < 36) {
			System.out.println(this.pokName +  " 진화 2단계");
		} else if(level >= 36) {
			System.out.println( this.pokName + " 최종 진화");
		}
	}
	
	public void pokEmotion() {
		int rand = (int) (Math.random() * 10) + 1; // 1 ~ 10
		
		if(rand < 4) {
			System.out.println(this.pokName + "의 기분이 좋지 않습니다");
			System.out.println("도망치세요!!!");
		} else if( rand >= 4 && rand < 7) {
			System.out.println(this.pokName + "의 기분이 그럭저럭해 보입니다");
			System.out.println("산책이 필요해 보입니다");
		} else if(rand >=7) {
			System.out.println(this.pokName + "의 기분이 좋아보입니다");
			System.out.println("애교를 부립니다");
		}
	}
	
	
	public void battle(PocketMon attacker, PocketMon defender) {
		int rand = (int) (Math.random() * 3) + 1;
		if(attacker.attackPoint > defender.attackPoint) {
			System.out.println(attacker.pokName + " 이/가 쎕니다");
			for(int i = 1; i < rand; i++) {
				System.out.println("맞았습니다");
				defender.healthPoint = defender.healthPoint - attacker.attackPoint;
				System.out.println("남은체력은 : " + defender.healthPoint);
				
			}
		} else {
			System.out.println(attacker.pokName + " 이/가 약합니다");
			System.out.println("포켓몬이 기절했습니다");
			System.out.println("더 이상 싸울 수 없습니다");
		}
	}  
	
	public static String[] inputSkill(String skill) {
		String[] result;
		result = skill.split(",");
		return result;
	}
	
	
	public void showSkill(String[] skills) {
		for(int i = 0; i < skills.length; i++) {
			System.out.println(skills[i]);
		}
	}
}
