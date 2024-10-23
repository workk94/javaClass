package day2.연습.함수형인터페이스만들기;


interface ChangeCalculator{	
	int[]  get( int amt);
}




public class Sample {

	public static void main(String[] args) {
		 
		
		//1. 함수형 인터페이스 만들기  
		//2. 인터페이스를 구현하기  - 3가지방법 1)이름있는클래스 2) 익명클래스  3) 람다식
		ChangeCalculator 	c= ( amt )->{ 
			
			int[] arr= new int[3];
			arr[0]= 8;
			arr[1]=7;
			arr[2]=4; 
			
			
			return arr;
		};
		
		
		int[] result  =c.get(1000);
		
		
		
		
		ChangeCalculator c2 = new ChangeCalculator() {

			@Override
			public int[] get(int amt) {
				 
				int[] arr= new int[3];
				arr[0]= 8;
				arr[1]=7;
				arr[2]=4; 
				
				
				return arr;
			}};
	 
		
		
			
			int[] rnt2 =c2.get(5000);
		
		
			
			
	}

}
