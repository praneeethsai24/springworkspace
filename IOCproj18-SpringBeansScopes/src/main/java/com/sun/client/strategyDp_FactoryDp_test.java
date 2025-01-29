package com.sun.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sun.sbeans.*;
import com.sun.ston.Printer;

public class strategyDp_FactoryDp_test {

	public static void main(String[] args) {
		/*
		 * FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
		 * "src/main/java/com/sun/cfgs/applicationContext.xml");
		 */
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/sun/cfgs/applicationContext.xml");

		Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
		Flipkart fpkt1 = ctx.getBean("fpkt", Flipkart.class);
		String getMsg = fpkt.shopping(new String[] { "shirt", "pant", "tops", "sneakers" },
				new double[] { 1000.0, 120.0, 140.24, 199.99 });
		System.out.println(getMsg);
		System.out.println(fpkt.hashCode() + " " + fpkt1.hashCode());
		System.out.println("fpkt==fpkt1?" + (fpkt == fpkt1));
		System.out.println("--------------------------");
		Printer o1 = ctx.getBean("p1", Printer.class);
		Printer o2 = ctx.getBean("p1", Printer.class);

		System.out.println(o1.hashCode() + " " + o2.hashCode());
		System.out.println("o1==o2?" + (o1 == o2));
		ctx.close();
	}
}
