package practice.com.crm.vtiger.GenericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {

	public String dataFromPropertiesFile(String key) throws Throwable
	{
		FileInputStream f=new FileInputStream(Ipathconstant.propertyPath);
		Properties p=new Properties();
		p.load(f);
		String s=p.getProperty(key);
		return s;
	}
}
