package com.sun.client;

import com.sun.comps.*;
import com.sun.factory.*;

public class strategyDp_FactoryDp_test {

	public static void main(String[] args) {

		Flipkart fpkt = FlipkartFactory.getInstance("dtdc");

		String getMsg = fpkt.shopping(new String[] { "shirt", "pant", "tops", "sneakers" },
				new double[] { 1000.0, 120.0, 140.24, 199.99 });
		System.out.println(getMsg);

	}

}
