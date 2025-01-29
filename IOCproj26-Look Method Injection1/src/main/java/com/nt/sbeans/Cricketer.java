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
public interface Cricketer {
	@Value("${cktr.id}")
	Integer id = 0;
	@Value("${cktr.name}")
	String name = null;
	@Value("${cktr.jersyNo}")
	Integer jersyNo = 0;
	/*
	 * @Autowired private ApplicationContext ctx;
	 */

	/*
	 * public Cricketer() { System.out.println("Cricket:: 0-param Constructor" +
	 * this.getClass()); }
	 */
	default void bowling() {
		System.out.println(name + " Cricketer.bowling()");
	}

	default void wicketKeeping() {
		System.out.println("Cricketer.wicketKeeping()");
	}

	@Lookup
	public abstract CricketBat getCricketBat(); // this method is implemented by
												// the ioc container in the inMemory proxy class
												// having dependecy lookup

	default void batting(ApplicationContext ctx) {
		System.out.println(name + " Cricketer.batting()");
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// CricketBat bat = ctx.getBean("bat",CricketBat.class);
//		CricketBat bat = ctx.getBean(CricketBat.class);
		CricketBat bat = getCricketBat();
		int runs = bat.scoreRuns();
		System.out.println(name + " cricketer is batting and scoring:: " + runs + " runs");
	}

}
