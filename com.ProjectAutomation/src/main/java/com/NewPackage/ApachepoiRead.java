package com.NewPackage;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.collections4.functors.WhileClosure;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

public class ApachepoiRead {
@Test
public void write() throws IOException, Exception{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\chromedriver_win32\\chromedriver.exe");
//	WebDriver driver= new ChromeDriver();
	//driver.manage().window().maximize();


String file1 = ("C:\\Users\\LARCHANA\\Documents\\ReadApache.xls");
FileInputStream fis = new FileInputStream(file1);

HSSFWorkbook w = new HSSFWorkbook(fis);
HSSFSheet sheet = w.getSheet("Sheet1");
Iterator<Row> iterator = sheet.rowIterator();

while (iterator.hasNext()) {
	
	Row r = iterator.next();
	for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) 
		{
			Cell cell = r.getCell(i);
			System.out.println("cellnum"+i+ cell);
		}
	}

}

	/*driver.findElement(By.name("firstname")).sendKeys(cell);
	driver.findElement(By.name("lastname")).sendKeys(cell1);*/
	
	

}
