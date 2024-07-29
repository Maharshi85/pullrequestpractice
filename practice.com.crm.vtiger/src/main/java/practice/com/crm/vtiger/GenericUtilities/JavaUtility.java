package practice.com.crm.vtiger.GenericUtilities;

import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public int randomNumber()
	{
		Random r=new Random();
		return r.nextInt(1000);
	}
	
	public String date()
	{
		Date d=new Date();
		return d.toString();
	}
	
	public String modifyDate()
	{
		Date d=new Date();
		String s[]=d.toString().split(" ");
		String date=s[2];
		String mon=s[1];
		String time=s[3].replace(':', '_');
		String yr=s[5];
		return time+" "+date+" "+mon+" "+yr;
	}
}
