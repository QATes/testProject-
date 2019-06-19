package selegit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class newp extends newcl {
	
	@Test
	
	public void loginFunctionality() {
		
		driver.findElement(By.id("identifierId")).sendKeys("bharath9.nomula");
		driver.findElement(By.id("identifierNext")).sendKeys(Keys.ENTER);
		
	}

}
