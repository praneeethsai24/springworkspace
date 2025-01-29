package com.sun.factory;

import com.sun.comps.Person;
import com.sun.comps.AadharDetails;
import com.sun.comps.Student;
import com.sun.comps.Customer;
import com.sun.comps.Employee;

public class PersonFactory {
	public static Person getInstance(String persontype) {
		Person per = null;
		if (persontype.equalsIgnoreCase("emp")) {
			AadharDetails details = new AadharDetails(123456789L, 16, 12345678900L);
			per= new Employee("geetha", "gorre", details, 16, "Associate Engineer");
		} else if (persontype.equalsIgnoreCase("stu")) {
			AadharDetails details2 = new AadharDetails(1234567898765L, 24, 987654321L);
			per = new Student("sunny", "kadiri", details2, 24, "student");
		} else if (persontype.equalsIgnoreCase("cust")) {
			AadharDetails details3 = new AadharDetails(123456799999L, 25, 999999999L);
			per = new Customer("raja", "hyd", details3, 1234.345d, "ghn");
		} else {
			throw new IllegalArgumentException("invalid personType");
		}
		return per;
	}
}
