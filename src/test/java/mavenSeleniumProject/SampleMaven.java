package mavenSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleMaven {

	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
	username.sendKeys("Admin");
	Thread.sleep(2000);
	WebElement password=driver.findElement(By.cssSelector("#txtPassword"));
	password.sendKeys("admin123");
	Thread.sleep(2000);
	WebElement login=driver.findElement(By.cssSelector("input[class='button']"));
	login.click();
	Thread.sleep(5000);
	driver.close();
	}

}
