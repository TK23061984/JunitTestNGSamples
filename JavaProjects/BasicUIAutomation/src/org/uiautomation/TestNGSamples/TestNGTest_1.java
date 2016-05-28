package org.uiautomation.TestNGSamples;

import org.testng.annotations.*;

public class TestNGTest_1 {
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("Executing beforeSuit in TestNGTest_1");
	}	
		
		@BeforeTest
		public void beforeTest()
		{
			System.out.println("Executing beforeTest in TestNGTest_1");
		}		
	
			@BeforeClass
			public void beforeClass()
			{
				System.out.println("Executing beforeClass in TestNGTest_1");
			}		
	
					@BeforeMethod
					public void beforeMethod()
					{
						System.out.println("Executing beforeMethod in TestNGTest_1");
					}		
	
						@Test
						public void TestA()
						{
							System.out.println("Executing test case TestA in TestNGTest_1");
						}
						
						@Test
						public void TestB()
						{
							System.out.println("Executing test case TestB in TestNGTest_1");
						}
	
					@AfterMethod
					public void afterMethod()
					{
						System.out.println("Executing afterMethod in TestNGTest_1");
					}
	
				@AfterClass
				public void afterClass()
				{
					System.out.println("Executing afterClass in TestNGTest_1");
				}
	
		@AfterTest
		public void afterTest()
		{
			System.out.println("Executing afterTest in TestNGTest_1");
		}
	
	@AfterSuite
	public void afterSuit()
	{
		System.out.println("Executing afterSuit in TestNGTest_1");
	}
}
