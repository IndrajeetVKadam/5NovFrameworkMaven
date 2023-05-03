package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage 
{
	//variable declaration
	@FindBy(xpath="//a[text()='Sign in']") private WebElement SignIN;
	
	//initialization
	public PBLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickPBLoginPageSignInBtn()
	{
		SignIN.click();
	}

}
