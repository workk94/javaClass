package day5.실습;

import java.lang.reflect.Field;

public class Food {

	String name;

	@MaxCalorie()
	int calorie;

	public Food() {
		// TODO Auto-generated constructor stub
	}

	public Food(String name, int calorie) {
		super();
		this.name = name;
		this.calorie = calorie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", calorie=" + calorie + "]";
	}

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		Food f1 = new Food("제육덮밥", 800);
		Food f2 = new Food("햄버거세트", 1200);
		verifyCalorie(f1);
		verifyCalorie(f2);
		
		System.out.println(f1.toString());

	}

	private static void verifyCalorie(Object obj) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// obj의 클래스 정보를 받아온다
		
		Class clazz = obj.getClass();
		
		// obj에 있는 필드 정보를 가져온다 
		Field[] fields = clazz.getDeclaredFields();
		
		for(Field field : fields) {
			MaxCalorie annotation = field.getAnnotation(MaxCalorie.class);
			
			if(annotation != null) {
				Object value = field.get(obj);
				
				if(value != null && value instanceof Integer) {
					int expectedValue = annotation.value();
					int fieldValue = (int) value;
					
					if(fieldValue >= 1000) {
						System.out.println("다이어트 식품이 아닙니다");
					} else {
						System.out.println("다이어트 식품입니다");
					}
					
				}
				
			}
			
		}

	}

}
