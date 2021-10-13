package mavenSeleniumProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExectorrExample {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://google.com");
		
		//javascriptexecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hey nandoo wait')");
		Thread.sleep(4000);
		driver.quit();
				
		
	}

}
