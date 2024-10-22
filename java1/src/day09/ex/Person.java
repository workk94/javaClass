package day09.ex;

public class Person {
	private int age;
	private String name;
	private boolean isMarried;
	private int numberOfChild;
	
	Person(int age, String name, boolean isMarried, int numberOfChild){
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.numberOfChild = numberOfChild;
	}
	
	public void PrintInfo(){
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.isMarried);
		System.out.println(this.numberOfChild);
	}
}
