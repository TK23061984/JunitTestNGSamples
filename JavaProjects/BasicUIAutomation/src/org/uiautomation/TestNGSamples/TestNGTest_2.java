package org.uiautomation.TestNGSamples;

import org.testng.annotations.Test;

public class TestNGTest_2 {
	@Test(groups ="windows")
	public void windowsTestA()
	{
		System.out.println("Executing test case windowsTestA in TestNGTest_2");
	}
	
	@Test(groups ="windows")
	public void windowsTestB()
	{
		System.out.println("Executing test case windowsTestB in TestNGTest_2");
	}
	
	@Test(groups ="linux")
	public void linuxTestC()
	{
		System.out.println("Executing test case linuxTestC in TestNGTest_2");
	}
	
	@Test(groups ="linux")
	public void linuxTestD()
	{
		System.out.println("Executing test case linuxTestD in TestNGTest_2");
	}
}
