package com.Functionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class tooltip1 {
@Test

public void newtooltip() throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\Chromedriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.leafground.com");
	Thread.sleep(5000);
	driver.findElement(By.linkText("Tool Tip")).click();
	
	//WebDriverWait wait= new WebDriverWait(driver, 20);
	//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("age"))));
	WebElement element = driver.findElement(By.id("age"));
	element.click();
	element.sendKeys("Archana");
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	WebElement tooltip = driver.findElement(By.tagName("title"));
	Thread.sleep(1000);
	String text = tooltip.getText();
	System.out.println(text);
	/*if (text.equalsIgnoreCase("Enter your Name")) {
		System.out.println("pass");
	}else {
		System.out.println("fail");
	}*/
	
}
}
