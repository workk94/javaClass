package day12.상속_inheritance.춤추기;

public class HJY extends Student {

	public void 왁킹() {
		System.out.println("왁킹이란 춤을 아시나요");
	}
	
	
	@Override
	public void 춤추기() {
		//super.춤추기();
		
		System.out.println("왁킹이란 팔을 뻗는 텐션 처럼 주로 팔을 이용하는 춤입니다 ");
		
	}
}
