package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class IntrestReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("IntrestReplacer.reimplement()");
		double pamt = (double) args[0];
		double time = (double) args[1];
		double rate = (double) args[2];
		return (pamt * time * rate) / 100.0;
	}

}
