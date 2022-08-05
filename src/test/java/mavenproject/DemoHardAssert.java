package mavenproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoHardAssert {

	@Test
	public void m1() {
		System.out.println("1");
		Assert.assertEquals(10, 10);
		System.out.println("2");
		Assert.assertEquals(15, 15);
		System.out.println("3");
		Assert.assertEquals(15, 20);
		System.out.println("4");
		Assert.assertEquals("cjc","cjc");
		
	}
	@Test
	public void m2() {
		System.out.println("5");
		Assert.assertEquals(10, 10);
		System.out.println("6");
		Assert.assertEquals(15, 15);
		System.out.println("7");
		Assert.assertEquals(20,20);
		System.out.println("8");
		Assert.assertEquals("cjc","cjc");
		
	}
	
}
