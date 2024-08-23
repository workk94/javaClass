package day15.정렬;

public class 정렬하기_라이브러리직접2 {
	public static void main(String[] args) {
		Customer[] arr = new Customer[3];
		arr[0] = new Customer("aaa", 25);
		arr[1] = new Customer("bbb", 24);
		arr[2] = new Customer("ccc", 23);
		
		//매개변수에 인터페이스가 있다면
		//인터페이스를 구현한 객체를 제공해야 한다 
		
		//1.이름있는 클래스
		//2.익명클래스
		//3.람다식
		MyArrays.sort(arr, new MyComparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				// 오름차순 기준의 값이 크면 자리교환이 일어나게 된다
				Customer c1 = (Customer) o1; // 기준
				Customer c2 = (Customer) o2; // 비교대상
				
				//
				
				if(c1.age > c2.age) return 1;
				else return -1;
				
				//return c1.age - c2.age;
			}
			
		});
		
		//
		System.out.println("정렬후 ");
		
		for(Customer c : arr) {
			System.out.println(c.toString()); // c.toString();
		}
		
		
		
	}
}
