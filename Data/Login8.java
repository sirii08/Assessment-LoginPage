package Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login8 {
	public static void main(String[] args) throws InterruptedException {
		{
			System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://sakshingp.github.io/assignment/login.html");
			Thread.sleep(2000);
			driver.findElement(By.id("username")).sendKeys("     ");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id ='password']")).sendKeys("     ");
			Thread.sleep(2000);
			driver.findElement(By.id("log-in")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//th[@class ='text-right']")).click();
			
		}

	}

}
