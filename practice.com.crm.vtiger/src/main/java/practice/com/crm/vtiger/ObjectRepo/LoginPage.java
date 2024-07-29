package practice.com.crm.vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name = "user_name") private WebElement uname;
	
	@FindBy(name = "user_password") private WebElement pwd;
	
	@FindBy(id = "submitButton") private WebElement click;
	
	public LoginPage(WebDriver dri)
	{
		PageFactory.initElements(dri,this);
	}
	
	public void loginPage(String name,String pass)
	{
		uname.sendKeys(name);
		pwd.sendKeys(pass);
		click.click();
	}
}
