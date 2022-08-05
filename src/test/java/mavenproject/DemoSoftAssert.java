package mavenproject;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssert {
	@Test
	public void m1() {
		SoftAssert sa = new SoftAssert();
		System.out.println("1");
		sa.assertEquals(10, 10);
		System.out.println("2");
		sa.assertEquals(15, 15);
		System.out.println("3");
		sa.assertEquals(15, 20);
		System.out.println("4");
		sa.assertEquals("cjc", "cjc");
		sa.assertAll();
	}

	@Test
	public void m2() {
		SoftAssert sa = new SoftAssert();
		System.out.println("5");
		sa.assertEquals(10, 10);
		System.out.println("6");
		sa.assertEquals(15, 15);
		System.out.println("7");
		sa.assertEquals(20, 20);
		System.out.println("8");
		sa.assertEquals("cjc", "cjc");
		sa.assertAll();

	}
}
