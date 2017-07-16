package edu.junit.Test;

import junit.framework.TestCase;

public class JunitTest extends TestCase {
	
	public void testCalculateFees(){
		Student student = new Student();
		student.setGender("male");
		student.setName("Kaddu");
		student.setRoll_no(1);
		
		float fee = student.CalculateFees(10000,10);
		assertEquals(Float.valueOf(10000),fee);
	
	
	}
	public void testCalculateFees1(){
		Student student = new Student();
		student.setGender("Female");
		student.setName("Kaddu");
		student.setRoll_no(1);
		
		float fee = student.CalculateFees(10000,10);
		assertEquals(Float.valueOf(5500),fee);
	
	
	}
	@Override
	protected void setUp() throws Exception {
		System.out.println("start Junit Test");
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		System.out.println("end Junit Test");
	}

}
