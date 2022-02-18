package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.Base_page;

public class InstaPom extends Base_page
{

	@FindBy(name="username")
	private WebElement unbox;
	
	@FindBy(name="password")
	private WebElement pwdbox;
	
	@FindBy(xpath="//div[.='Log In']")
	private WebElement lgnbtn;
	
	public InstaPom(WebDriver driver) 
	{
		super(driver);
	}
	
	public void enterUn(String un)
	{
		unbox.sendKeys(un);
	}
	
	public void enterPwd(String pwd)
	{
		pwdbox.sendKeys(pwd);
	}
	
	public void login()
	{
		lgnbtn.click();
	}
	
	

}
