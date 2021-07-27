package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditModule {

@Test
public void newtest() throws Throwable {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.leafground.com");
	driver.findElement(By.linkText("Edit")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("email")).sendKeys("archana@gmail.com");
	System.out.println("email entered into textbox successfully");
	driver.findElement(By.cssSelector("input[value='Append ']")).clear();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[value='Append ']")).sendKeys("textnew");
	driver.findElement(By.name("username")).clear();
	Thread.sleep(1000);
	driver.findElement(By.name("username")).sendKeys("testleaf");
	driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("integration");
	driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
	}
}
