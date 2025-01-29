package com.sun.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.sun.comps.BlueDart;
import com.sun.comps.Courier;
import com.sun.comps.DHL;
import com.sun.comps.DTDC;
import com.sun.comps.Flipkart;

public class FlipkartFactory {
	private static Properties props;
	static {
		try {
			// load the properties file using stream
			InputStream is = new FileInputStream("src/main/java/com/sun/commons/info.properties");
			// creates properties class object
			props = new Properties();
			props.load(is);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// static factory method havinh logic to create Flipkart object having the given
	// courier object
	public static Flipkart getInstance() {
		// geit dependent class from the properties class obj
		String courierClassName = props.getProperty("courier.name");
		Courier courier = null;
		try {
//			laod the dependent class name
			Class c = Class.forName(courierClassName);
//			create the object for dependent class 
//			courier = (Courier) c.newInstance(); // deprecated
			Constructor<Courier> cons[] = c.getDeclaredConstructors();
			courier = cons[0].newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
//          create target class object		
		Flipkart fpkt = new Flipkart();
//		assign dependent class object to target class object
		fpkt.setCourier(courier);
		return fpkt;

	}

}
