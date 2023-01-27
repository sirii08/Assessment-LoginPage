package Data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login5 {
	@Test
	public void Data1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		Thread.sleep(2000);
	    Login4 l = new Login4(driver);
	    l.UnData("ghjauiwjl");
	    l.PwdData("gashqyqioinn");
	    l.Clicklogin();
	    l.Clickamt();
		
	}
	

}
