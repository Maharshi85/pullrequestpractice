package practice.com.crm.vtiger.UserDropdownTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practice.com.crm.vtiger.GenericUtilities.FileUtility;
import practice.com.crm.vtiger.GenericUtilities.WebdriverUtility;
import practice.com.crm.vtiger.ObjectRepo.HomePage;
import practice.com.crm.vtiger.ObjectRepo.LoginPage;

public class UserDropdownTest {

	public static void main(String[] args) throws Throwable {
		WebDriver dri=new ChromeDriver();
		FileUtility f=new FileUtility();
		WebdriverUtility w=new WebdriverUtility();
		w.maximize(dri);
		dri.get(f.dataFromPropertiesFile("url"));
		
		LoginPage l=new LoginPage(dri);
		l.loginPage(f.dataFromPropertiesFile("username"),f.dataFromPropertiesFile("password"));
		
		HomePage h=new HomePage(dri);
		h.signOut(dri);
	}
}
