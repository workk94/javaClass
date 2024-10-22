package day15.정렬;

public class 직접정렬하기 {

	public static void main(String[] args) {
		Score[] arr = new Score[3];
		
		arr[0] = new Score("aaa", 90, 71);
		arr[1] = new Score("bbb", 70, 99);
		arr[2] = new Score("ccc", 90, 89);
	
		for(Score score : arr) {
			System.out.println(score); // score.toString()
		}
		
		
		//객체배열 정렬하기 (선택정렬)
		
		for(int i = 0; i < arr.length -1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i].kor > arr[j].kor) {
					Score tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println("정렬 후 ==>");
		for(Score score : arr) {
			System.out.println(score); // score.toString()
		}
		
	}

}
