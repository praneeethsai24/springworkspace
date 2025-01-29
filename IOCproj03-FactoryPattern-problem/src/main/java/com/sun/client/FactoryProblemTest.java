package com.sun.client;
import com.sun.comps.AadharDetails;
import com.sun.comps.Student;
import com.sun.comps.Person;
import com.sun.comps.Employee;


public class FactoryProblemTest {

	public static void main(String[] args) {
		AadharDetails details=new AadharDetails(123456789L, 24, 1234567890L);
		Person st=new Student("geetha","adoni",details,16,"java");
		System.out.println(st);
		
		System.out.println("----------------------------------------");
		
		AadharDetails details1=new AadharDetails(1234567890L, 25, 123456789000L);
		Person emp=new Employee("sunny","kadiri",details,24,"spring");
		System.out.println(emp);
		
	}

}
