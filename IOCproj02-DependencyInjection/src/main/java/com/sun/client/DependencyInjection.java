package com.sun.client;

import com.sun.sbeans.*;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DependencyInjection {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/main/java/com/sun/cfgs/applicationContext.xml");
		Object obj = ctx.getBean("sf");

		SeasonFinder finder = (SeasonFinder) obj;

		String result = finder.FindOutSeason("geetha");
		System.out.println(result);
		ctx.close();
	}

}
