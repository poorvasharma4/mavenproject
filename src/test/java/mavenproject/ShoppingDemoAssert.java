package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ShoppingDemoAssert {

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
	public void register() {
		driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("poorva");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("sharma");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("sharmapoorva4@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("poorva@123");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("poorva");
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		
		  String curl=driver.getCurrentUrl(); 
		  SoftAssert sa=new SoftAssert(); 
		  String url="http://demowebshop.tricentis.com/registerresult/1";
		  sa.assertEquals(curl,url);		 
		  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")).click();
		  sa.assertAll();
	}

}
