package com.sun.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sun.sbeans.*;

public class strategyDp_FactoryDp_test {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/main/java/com/sun/cfgs/applicationContext.xml");
		Flipkart fpkt = (Flipkart) ctx.getBean("fpkt");
		String getMsg = fpkt.shopping(new String[] { "shirt", "pant", "tops", "sneakers" },
				new double[] { 1000.0, 120.0, 140.24, 199.99 });
		System.out.println(getMsg);
		ctx.close();
	}
}
