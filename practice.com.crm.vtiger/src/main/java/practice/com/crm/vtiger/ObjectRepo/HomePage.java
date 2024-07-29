package practice.com.crm.vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practice.com.crm.vtiger.GenericUtilities.WebdriverUtility;

public class HomePage extends WebdriverUtility{

	@FindBy(className = "tabSelected") private WebElement email;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']") private WebElement element;
	
	@FindBy(linkText = "Sign Out") private WebElement sign;
	
	public HomePage(WebDriver dri) 
	{
		PageFactory.initElements(dri,this);
	}
	
	public void emialClick()
	{
		email.click();
	}
	
	public void signOut(WebDriver dri)
	{
		selectMoveElement(dri, element);
		sign.click();
	}
}
