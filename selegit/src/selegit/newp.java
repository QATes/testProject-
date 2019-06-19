package selegit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class newp extends newcl {
	
	@Test
	
	public void loginFunctionality() {
		
		driver.findElement(By.id("identifierId")).sendKeys("bharath9.nomula");
		driver.findElement(By.id("identifierNext")).sendKeys(Keys.ENTER);
		
	}
	@Test 
	public void password() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Loveumom@09");
		driver.findElement(By.id("passwordNext")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
	}
	@Test
	public void search() {
		
		WebElement source = driver.findElement(By.className("gb_We"));
		source.clear();
		source.sendKeys("pass");
		source.sendKeys(Keys.ENTER);
		
	}

}
