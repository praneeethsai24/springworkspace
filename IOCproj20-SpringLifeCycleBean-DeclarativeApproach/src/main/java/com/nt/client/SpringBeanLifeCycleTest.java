package com.nt.client;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VoterInfo;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nt/cfgs/applicationContext.xml")) {
			VoterInfo info = ctx.getBean("voter", VoterInfo.class);
			String result = info.VoterEligibilty();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
