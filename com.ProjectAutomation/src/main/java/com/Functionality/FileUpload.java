package com.Functionality;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class FileUpload {
@Test
public void uploadfile() throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://demo.automationtesting.in/FileUpload.html");
	Thread.sleep(5000);
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div[3]/input")).click();
	Thread.sleep(1000);
	String file = "C:\\Users\\LARCHANA\\Assignment on tesng Depend on Methods[09072021].txt";
	StringSelection select = new StringSelection(file);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	}

}
