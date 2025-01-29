package com.nt.client;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);
				ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
						"com/nt/cfgs/applicationContext.xml");) {
			System.out.println("Enter language code::");
			String lang = sc.next();
			System.out.println("Enter Country code::");
			String country = sc.next();
			@SuppressWarnings("deprecation")
			Locale locale = new Locale(lang, country);

			String msg1 = ctx.getMessage("wish.msg", new Object[] {}, locale);
			String msg2 = ctx.getMessage("bye.msg", new Object[] {}, locale);
			System.out.println(msg1 + "  " + msg2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
