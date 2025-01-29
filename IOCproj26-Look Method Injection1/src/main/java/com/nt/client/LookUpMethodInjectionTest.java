package com.nt.client;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class LookUpMethodInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Cricketer cktr = ctx.getBean("cktr", Cricketer.class);
		System.out.println("proxy obj class name:" + cktr.getClass());
		System.out.println("proxy class super class name:" + cktr.getClass().getSuperclass());
		System.out.println("proxy obj class name:" + Arrays.toString(cktr.getClass().getDeclaredMethods()));
		cktr.bowling();
		cktr.wicketKeeping();
		cktr.batting(ctx);
		System.out.println("--------------------");
		cktr.batting(ctx);
	}

}
