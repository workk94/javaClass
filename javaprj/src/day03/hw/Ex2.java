package day03.hw;

//2. 1~10까지 합 구하기  (for, while문 사용하기)

public class Ex2 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += 1;
		}
		System.out.println("for "+ sum);
		
		int i = 0;
		sum = 0;
		while(true) {
			sum +=1;
			i++;
			if(i >= 10) break;
		}
		System.out.println("while "+ sum);
	}

}
