package mavenproject;

import org.testng.annotations.Test;

public class PriorityDemo {
@Test(priority=1)
public void add()

{
	System.out.println("addition");
}
@Test(priority=-2)
public void sub()
{
	System.out.println("subtraction");
}
@Test(priority=-1)
public void multi()
{
	System.out.println("multiplication");
}
@Test(priority=-3)
public void div()
{
	System.out.println("division");
}
		
	}


