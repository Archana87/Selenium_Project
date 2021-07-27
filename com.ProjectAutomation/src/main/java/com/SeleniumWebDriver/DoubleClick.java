package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick {

	@Test
	public void doubleclick() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com");
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.id("email"));
		Actions a = new Actions(driver);
		a.sendKeys(element, "Archana").build().perform();
		Thread.sleep(1000);
		a.sendKeys(element, " Lingampally").doubleClick().build().perform();
		
	}
}
