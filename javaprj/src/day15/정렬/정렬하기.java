package day15.정렬;

public class 정렬하기 {
	public static void main(String[] args) {
		int[] arr = {10, 5, 8, 11, 7};
		
		//오름차순
		
		//기준
		for(int i = 0; i < arr.length -1 ; i++) {
			//대상
			//자신의 오른쪽이랑 비교하니까 +1
			for(int j = i +1; j < arr.length ; j++) {
				if(arr[i] > arr[j]) {
					// 앞에 있는게 더 크면 뒤에 있는걸 앞으로 땡겨줌(작은게 앞으로옴)
					int tmp; 
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println("정렬 후");
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}
