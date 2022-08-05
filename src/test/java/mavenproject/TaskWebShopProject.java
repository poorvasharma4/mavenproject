package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TaskWebShopProject {
	WebDriver driver;
	@BeforeSuite
	public void openBrowser() {
		System.out.println("beforeSuit");
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_automation\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Parameters("url")
	@BeforeTest
	public void url(String url)
	{
		driver.get(url);
	}
	@Parameters({"female","fname"})
	@Test
	public void Register(String female,String fn)
	{
		driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("fn");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("ln");
	}
}
