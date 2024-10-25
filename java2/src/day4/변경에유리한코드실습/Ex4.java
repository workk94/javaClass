package day4.변경에유리한코드실습;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Ex4 {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, IOException {
		
		
		Animal animal = getAnimal();
		Animal animal2 = getAnimal();
		Animal animal3 = getAnimal();
		
		
		animal.bark();
		animal2.bark();
		animal3.bark();
	}
	
	
	private static Animal getAnimal() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//외부설정파일을 사용해서 동적으로 객체를 생성하는 코드로 변환
		//Animal animal = new Cat();
		
		Properties p = new Properties();
		
		p.load(new FileReader("src/day4/변경에유리한코드실습/config.txt"));
		String className = (String) p.get("Animal");
		//day4.변경에유리한코드실습.Cat
		Class clazz = Class.forName(className);
		
		//	Animal animal  =  (Animal) clazz.getDeclaredConstructor( ).newInstance();
		Animal animal  = (Animal) clazz.newInstance();
		
		return animal;
		
	}
}
