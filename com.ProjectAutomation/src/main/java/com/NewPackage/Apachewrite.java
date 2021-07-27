package com.NewPackage;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.Test;

public class Apachewrite {

@Test
public void write() throws IOException {
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//WebDriver driver= new ChromeDriver();
	//driver.manage().window().maximize();
String file1 = ("C:\\Users\\LARCHANA\\Documents\\write.xls");
File f = new File(file1);
FileOutputStream output = new FileOutputStream(f);

XSSFWorkbook workbook = new XSSFWorkbook();

XSSFSheet s= workbook.createSheet("selenium");
 Row r = s.createRow(5);
 Cell c = r.createCell(10);
 c.setCellType(CellType.STRING);
 c.setCellValue("Archana");
 workbook.write(output);
}
}
