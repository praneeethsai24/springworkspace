package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		// creating IOC container
		/*
		 * FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
		 * "src/com/nt/cfgs/applicationContext.xml");
		 */

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get target spring class object from the ioc container
//		Object obj = ctx.getBean("wmg");
		// String result=obj.generateWishMessage("raja"); // using super class ref we
		// can not call all direct methods of sub class, ** if needed "go for
		// typeCasting"
//		WishMessageGenerator generator = (WishMessageGenerator) obj;
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		// invoke b.method
		String result = generator.generateWishMessage("Geetha");
		System.out.println("Result:" + result);

		/*
		 * Object obj1 = ctx.getBean("wmg"); System.out.println(obj.hashCode());
		 * System.out.println(obj1.hashCode()); System.out.println("obj==obj1:" + (obj
		 * == obj1));
		 */
		// close ioc container
		ctx.close();

	}

}
