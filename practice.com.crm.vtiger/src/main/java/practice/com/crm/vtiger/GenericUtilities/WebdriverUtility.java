package practice.com.crm.vtiger.GenericUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {

	public void maximize(WebDriver dri)
	{
		dri.manage().window().maximize();
	}
	
	public void minimize(WebDriver dri)
	{
		dri.manage().window().minimize();
	}
	
	public void implicitWait(WebDriver dri)
	{
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(Ipathconstant.implicitWait));
	}
	
	public void explicitWait(WebDriver dri,String title)
	{
		WebDriverWait d=new WebDriverWait(dri,Duration.ofSeconds(Ipathconstant.explicitWait));
		d.until(ExpectedConditions.titleContains(title));
	}
	
	public void selectMoveElement(WebDriver dri,WebElement target)
	{
		Actions a=new Actions(dri);
		a.moveToElement(target).perform();
	}
}
