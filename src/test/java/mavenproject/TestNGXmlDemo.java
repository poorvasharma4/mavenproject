package mavenproject;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNGXmlDemo {
	WebDriver driver;
	@BeforeSuite
	public void openBrowser() {
		System.out.println("beforeSuit");
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_automation\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Parameters("url")
	@BeforeTest()
	public void enterUrl(String url) {
		driver.get(url);
	}
	
	  @BeforeClass public void maximize() { driver.manage().window().maximize(); }
	  
	  @BeforeMethod 
	  public void getCookies() { Set<Cookie> ck =
	  driver.manage().getCookies(); System.out.println(ck.size());
	  
	  }
	 
	
	@Parameters({"firstname","lastname","phone","email","address","city","state","postal","country","username","password","confpassword"})
	@Test
	public void register1(String fn, String ln, String pn, String us, String add, String cy, String sta, String cu,
			String pc, String id, String ps, String cp) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fn);
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys(ln);
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys(pn);
		driver.findElement(By.cssSelector("input[id='userName']")).sendKeys(us);
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys(add);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(cy);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(sta);
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys(pc);
		driver.findElement(By.name("country")).sendKeys(cu);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(id);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(ps);
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys(cp);
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		
	}
	
	
	  @Parameters("screenshot")
	  
	
	
	  @AfterMethod public void captureSc(String screenshot) throws IOException {
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFileToDirectory(src, new File(screenshot)); }
	 
	 
	 

	  @AfterClass
	  public void deleteCookies() {
		  System.out.println("Delete Cookies");
		  
	  }
	
	  @AfterTest
	  public void dbClose() {
		  System.out.println("DB Connection Close");
	  }
	
	  @AfterSuite
	  public void afterSuite() {
		  //driver.close();
		  System.out.println("Close Broswer");
	  }
}
