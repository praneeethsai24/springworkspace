package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.PersonalInfo;

public class ValueAnnotationTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		PersonalInfo info = ctx.getBean("pInfo", PersonalInfo.class);
		System.out.println(info);
		
		ctx.close();
	}

}
