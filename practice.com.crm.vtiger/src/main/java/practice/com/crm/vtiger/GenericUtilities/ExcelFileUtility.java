package practice.com.crm.vtiger.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {

	public String dataFetchFromExcelFile(String sheetname,int rownum,int cellnum) throws Throwable
	{
		FileInputStream f=new FileInputStream(Ipathconstant.excelPath);
		Workbook w=WorkbookFactory.create(f);
		String s=w.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
		return s;
	}
	public void dataStoreFromExcelFile(String sheetname,int rownum,int cellnum,String data) throws Throwable
	{
		FileInputStream f=new FileInputStream(Ipathconstant.excelPath);
		Workbook w=WorkbookFactory.create(f);
		w.createSheet(sheetname).createRow(rownum).createCell(cellnum).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(Ipathconstant.excelPath);
		w.write(fos);
	}
}
