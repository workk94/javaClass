package day10.객체배열;

public class LatteTest {
	public static void main(String[] args) {
        Latte l;
        l = new Latte();        
        l.input(1, 2, 1, 1);
        l.calcTotal();
        l.printInfo();
        
        Latte l2;
        l2 = new Latte();
        l2.input(2, 2, 4, 2);
        l2.calcTotal();
        l2.printInfo();
        
        
        //객체배열
        Latte[] arr = new Latte[2]; // 객체배열 선언 주의사항!!! 라떼 객체가 2개 만들어진것이 아니다!!! 
        // 각각의 객체의 주소를 저장하는
        // 참조형변수를 배열로 선언한 것이다 !! 오해하면 안된다.
        
        // 반복문으로 출력이 가능해짐
        arr[0] = new Latte(); // l
        arr[1] = new Latte(); // l2
        
        arr[0].input(2, 1, 0, 0);
        arr[1].input(1, 1, 1, 1);
        
        arr[0].printInfo();
        arr[1].printInfo();
        
        for(int i = 0; i < arr.length; i++) {
        	arr[i].calcTotal();
        	arr[i].printInfo();
        }
	}
}
