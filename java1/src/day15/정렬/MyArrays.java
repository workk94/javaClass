package day15.정렬;

//객체배열을 정렬해주는 라이브러리 만들기 

public class MyArrays {

	public static void sort(Object[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				// i번째 j번째의 비교
				// 결정할 수 없는 정렬의 기준을 인터페이스로 제공한다.
				// MyComparable -> int compareTo( Object 비교객체 ) // 반환값이 양수면 자리를 바꾸겠다.

				MyComparable obj = (MyComparable) arr[i];

				// if( arr[i] arr[j ])
				if (obj.compareTo(arr[j]) > 0) { // 양수이면 자리를 바꾸겠다 . 오름차순

					//
					Object temp;

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}

	}
	
	public static void sort(Object[] arr, MyComparator c) {
		for (int i = 0; i < arr.length - 1; i++) {
			//
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) { 
					Object temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
	}

}
