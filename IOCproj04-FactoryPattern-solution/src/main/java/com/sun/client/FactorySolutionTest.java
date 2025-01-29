package com.sun.client;
import com.sun.comps.AadharDetails;
import com.sun.comps.Student;
import com.sun.factory.PersonFactory;
import com.sun.comps.Person;
import com.sun.comps.Employee;


public class FactorySolutionTest {

	public static void main(String[] args) {
		Person emp=PersonFactory.getInstance("emp");
		System.out.println(emp);
		
		Person stu=PersonFactory.getInstance("stu");
		System.out.println(stu);
		
		Person cust=PersonFactory.getInstance("cust");
		System.out.println(cust);
	}

}
