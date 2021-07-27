package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ButtonModule {
@Test
public void Button() {
 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("http://www.leafground.com/home.html");
	
	driver.findElement(By.linkText("Button")).click();
	driver.findElement(By.id("home")).click();
	driver.get("http://www.leafground.com/pages/Button.html");
	driver.findElement(By.id("position")).click();
	driver.findElement(By.id("color")).click();
	driver.findElement(By.id("size")).click();
	
}
}
