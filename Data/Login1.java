package Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login1 {

	public static void main(String[] args) throws InterruptedException {
		{
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://sakshingp.github.io/assignment/login.html");
			Thread.sleep(2000);
			driver.findElement(By.id("username")).sendKeys("siri");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("siri");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Log In']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("amount")).click();
			
		}

	}

}
