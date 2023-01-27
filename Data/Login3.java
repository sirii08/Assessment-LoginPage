package Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Login3 extends Login2 {
	@Test
	public void test1()
	{
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("hhs8l5");
		driver.findElement(By.id("password")).sendKeys("6263879");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		driver.findElement(By.xpath("//th[@id='amount']/../../following-sibling::tbody/tr/td[5]")).click();
		
		
	}

}
