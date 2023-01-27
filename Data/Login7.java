package Data;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://sakshingp.github.io/assignment/login.html");
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("$%#$^");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("*@$%&!");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		driver.findElement(By.id("amount")).click();

	}

}
