package day09;


public class PocketMonTest {

	public static void main(String[] args) {
		
		
		PocketMon poketmon1 = new PocketMon();
		PocketMon poketmon2 = new PocketMon();
		PocketMon poketmon3 = new PocketMon();
		
		poketmon1.input("피카츄", 25, "전기", 55, "100만볼트,전광석화,꼬리흔들기" );
		poketmon2.input("이상해씨", 1, "풀+독", 49, "몸통박치기,덩쿨채찍,수면가루");
		poketmon3.input("파이리", 4, "불꽃", 52, "불꽃세레,할퀴기");
		
		
		poketmon1.printInfo();
		poketmon2.printInfo();
		poketmon3.printInfo();
		
		
		poketmon1.pokEmotion();
		
		System.out.println();
		poketmon1.printLevel();

		System.out.println();
		poketmon1.battle(poketmon1, poketmon2);
		
		System.out.println();
		poketmon1.battle(poketmon2, poketmon1);
		
		System.out.println();
		poketmon1.level = 17;
		poketmon1.printLevel();
		
	}

}
