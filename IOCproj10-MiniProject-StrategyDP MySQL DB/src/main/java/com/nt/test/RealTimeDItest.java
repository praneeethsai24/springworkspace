package com.nt.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.CustomerOperationsController;
import com.nt.model.Customer;

public class RealTimeDItest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name:");
		String cname = sc.next();
		System.out.println("Enter Customer address:");
		String cadd = sc.next();
		System.out.println("Enter Customer BillAmount:");
		Double billamt = sc.nextDouble();
		System.out.println("Enter Customer Discount:");
		Double discount = sc.nextDouble();

		Customer cust = new Customer();
		cust.setCname(cname);
		cust.setAdds(cadd);
		cust.setBillamount(billamt);
		cust.setDiscount(discount);

		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nt/cfgs/applicationContext.xml");) {
			CustomerOperationsController controller = ctx.getBean("custController", CustomerOperationsController.class);

			String msg = controller.processCustomer(cust);
			System.out.println(msg);
		} catch (SQLException se) {
			if (se.getErrorCode() == 12899) {
				System.out.println("problem with Coloumn Size.");
			} else {
				System.out.println("one or more Db problems");
			}
		} catch (Exception e) {
			System.out.println("internal Problem:----Try again::" + e.getMessage());
			e.printStackTrace();
		}
	}

}
