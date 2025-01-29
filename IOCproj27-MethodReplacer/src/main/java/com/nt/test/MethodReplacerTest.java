package com.nt.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.BankService;

public class MethodReplacerTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		BankService bank = ctx.getBean("bank", BankService.class);
		System.out.println("proxy class obj class name::" + bank.getClass() + ".....super class"
				+ bank.getClass().getSuperclass());
		System.out.println("method list:::" + Arrays.toString(bank.getClass().getDeclaredMethods()));

		double InterstAmount = bank.calculateIntrestAmount(1000000, 0.1, 16);
		System.out.println("IntrestAmount:: " + InterstAmount);

		ctx.close();

	}

}
