package discoverDollors.discoverDollor_pages;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {
	public String getcelldata(String excelpath,String sheet,int row,int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook w = WorkbookFactory.create(fis);
		String getcell = w.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return getcell;
		
	}
	
	public void setcelldata(String sheet,int row,int cell,String val ,String excelpath) throws Throwable 
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook w = WorkbookFactory.create(fis);
	    w.getSheet(sheet).getRow(row).getCell(cell).setCellValue(val);
		FileOutputStream fos = new FileOutputStream(excelpath);
	    w.write(fos);
		w.close();
	}
	
	public int getRowcount(String sheet,String ecelpath) throws Throwable
	{
		FileInputStream fis = new FileInputStream(ecelpath);
		Workbook w = WorkbookFactory.create(fis);
		int rowcount = w.getSheet(sheet).getLastRowNum();
		return rowcount;
	}
	public String getPropValue(String propPath,String key)throws Throwable
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties p=new Properties();
		p.load(fis);
		String propValue=p.getProperty(key,"Incorrect Key");
		return propValue;
		
	}

}
