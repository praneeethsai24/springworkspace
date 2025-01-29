package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class DependencyLookUptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Cricketer cktr = ctx.getBean("cktr", Cricketer.class);
		cktr.bowling();
		cktr.wicketKeeping();
		cktr.batting();
	}

}
