package Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login6 {
	public static void main(String[] args) throws InterruptedException {
		{
			System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://sakshingp.github.io/assignment/login.html");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Enter your username']")).sendKeys("8732902");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@class ='form-control'])[2]")).sendKeys("33905814");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Log In']")).click();
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.xpath("//th[@class ='text-right']"));
			ele.click();
			boolean b = ele.isDisplayed();
			if(b)
			{
				System.out.println("Values is Sorted");
			}
			else
			{
				System.out.println("Values is not Sorted");
			}
			
		}

	}

}
