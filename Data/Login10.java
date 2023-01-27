package Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Login10 extends Login9 {
	@Test
	public void test1()
	{
		driver.findElement(By.id("username")).sendKeys("Man$%*692");
		driver.findElement(By.id("password")).sendKeys("Ceo8211!!@)");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		driver.findElement(By.xpath("//th[@id='amount']/../../following-sibling::tbody/tr/td[5]")).click();
		
		
	}

}
