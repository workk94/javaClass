package day12.상속_inheritance.추상클래스;

//추상 클래스
//추상 메서드를 하나라도 가지면 추상클래스가 된다 
//객체를 생성할 수 없다
//자식을 통해서 객체를 생성한다(자식이 추상메서드를 재정의 하는 것을 강제한다)
public abstract class Animal {
	public void 먹는다() {
		System.out.println("먹는다");
	}
	
	public void 걷는다() {
		System.out.println("걷는다");
	}
	
	//추상메서드 : 선언부만 있는 메서드, 구현부가 없는 메서드임
	//부모가 약속만 가지고 있고 자식이 재정의해서 사용해야 되는 메서드임
	//설계(강제)
	public abstract void 싸운다();
}