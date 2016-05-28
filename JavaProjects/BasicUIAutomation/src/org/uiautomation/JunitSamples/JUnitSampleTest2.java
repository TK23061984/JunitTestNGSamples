package org.uiautomation.JunitSamples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitSampleTest2 {

	@Test
	public void test1() {
		System.out.println("Executing test1 in JUnitTestFile2 !");
	}

	@Test
	public void test2() {
		System.out.println("Executing test2 in JUnitTestFile2 !");
	}
	
	@Test(expected = IllegalArgumentException.class)
	  public void testExceptionIsThrown() {
	    MyClass tester = new MyClass();
	     tester.multiply(1000, 5);
	  }
	
	@Test
	  public void testMultiply() {
	    MyClass tester = new MyClass();
	    assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
	  }

}
