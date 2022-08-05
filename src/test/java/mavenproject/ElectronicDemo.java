package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElectronicDemo {

	WebDriver driver;

	@BeforeSuite
	public void openBrowser() {
		System.out.println("beforeSuit");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar  files\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeTest()
	public void enterUrl() {
		driver.get("http://demowebshop.tricentis.com/register");

	}

	@BeforeClass
	public void maximize() {
		driver.manage().window().maximize();
	}
	@Test 
	void buttonClick()
	{
		
		WebElement s=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a"));
		s.click();
		
	}
}
