package com.sun.client;

import com.sun.sbeans.Mahindra;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StrategyPatternTest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/main/java/com/sun/cfgs/applicationContext.xml");
		Mahindra ma = (Mahindra) ctx.getBean("mah");
		String getMsg = ma.booking(new double[] { 10000.00, 2000.00, 3000000.00 },
				new String[] { "red", "black", "gold", "white" });
		System.out.println(getMsg);
	}

}
