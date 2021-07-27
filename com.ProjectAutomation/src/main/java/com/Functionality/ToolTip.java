package com.Functionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTip {
@Test
public void tooltips() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\Chromedriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.leafground.com");
	driver.findElement(By.linkText("Tool Tip")).click();
	
	WebElement element = driver.findElement(By.id("age"));
	String s = element.getAttribute("title");
	System.out.println(s);
	driver.close();
	
	

	
}
}
