package Tehtava2;

import java.io.FileInputStream;
import java.util.Properties;

public class MainBonus {

	public static void main(String[] args) {
		Class c = null;
		AbstractFactory f = null;
		
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("src/Tehtava2/FactoryFilu"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			c = Class.forName(properties.getProperty("factory"));
			f = (AbstractFactory) c.newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Person jasper = new Person();
		jasper.pue(f);

	}

}
