package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource("com/nt/commons/info.properties")
public abstract class Cricketer {
	@Value("${cktr.id}")
	private Integer id;
	@Value("${cktr.name}")
	private String name;
	@Value("${cktr.jersyNo}")
	private Integer jersyNo;
	/*
	 * @Autowired private ApplicationContext ctx;
	 */

	public Cricketer() {
		System.out.println("Cricket:: 0-param Constructor" + this.getClass());
	}

	public void bowling() {
		System.out.println(name + " Cricketer.bowling()");
	}

	public void wicketKeeping() {
		System.out.println("Cricketer.wicketKeeping()");
	}

	@Lookup
	public abstract CricketBat getCricketBat(); // this method is implemented by
												// the ioc container in the inMemory proxy class
												// having dependecy lookup

	public void batting(ApplicationContext ctx) {
		System.out.println(name + " Cricketer.batting()");
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// CricketBat bat = ctx.getBean("bat",CricketBat.class);
//		CricketBat bat = ctx.getBean(CricketBat.class);
		CricketBat bat = getCricketBat();
		int runs = bat.scoreRuns();
		System.out.println(name + " cricketer is batting and scoring:: " + runs + " runs");
	}

}
