package day12.상속_inheritance.춤추기;

public class Main {
	
	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		students[0] = new JSK();
		students[1] = new Jsk2();
		students[2] = new CMG();
		students[3] = new HJY();
		students[4] = new jws();
		students[5] = new kdh();
		students[6] = new KSJ();
		students[7] = new Paulbaek();
		students[8] = new SSB();
		students[9] = new YJM();
		
		//Student 상속받은 자식객체들을 Student 배열로 다루면서 일괄적으로 명령을 줄 수 있다.
		
		for(int i = 0; i <students.length; i++) {
			students[i].춤추기();
		}
	}
}
