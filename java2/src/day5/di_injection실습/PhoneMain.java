package day5.di_injection실습;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PhoneMain {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Properties p = new Properties();
		p.load(new FileReader("src/day5/di_injection실습/config.txt"));
		// 리턴값 String 
		String vlaue = p.getProperty("Battery");
		
		// 
		Class clazz = Class.forName(vlaue);
		Battery battery = (Battery)clazz.newInstance();
		
		//Battery battery = new SMBattery();
		//Battery battery = new LGBattery();
		Phone phone = new Phone(battery);
		phone.powerOn();
	}
}
