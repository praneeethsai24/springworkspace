package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		String msg = generator.generateWishmessage("Geetha");
		System.out.println("result is :: " + msg);
		ctx.close();
	}
}
