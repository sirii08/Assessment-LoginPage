package Data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login4 {
	@FindBy(id="username")
	private WebElement Untbox;
	@FindBy(id="password")
	private WebElement Pwdtbox;
	@FindBy(id="log-in")
	private WebElement Lgnbtn;
	@FindBy(id="amount")
	private WebElement Amt;
	public Login4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void UnData(String Un)
	{
		Untbox.sendKeys(Un);
	}
	public void PwdData(String Pwd)
	{
		Pwdtbox.sendKeys(Pwd);
	}
	public void Clicklogin()
	{
		Lgnbtn.click();
	}
	public void Clickamt()
	{
		Amt.click();
	}
}



