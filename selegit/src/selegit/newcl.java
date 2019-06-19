package selegit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class newcl {
	
	public WebDriver driver;
	@Test
	public void driver() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banda\\git\\testProject-\\selegit\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

}
