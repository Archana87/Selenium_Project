package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popups {
@Test

public void popup() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.leafground.com");
	driver.findElement(By.linkText("Alert")).click();
	driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
	Thread.sleep(1000);
		String s = driver.switchTo().alert().getText();
		System.out.println("Alert popup data:" + s);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		String s1 = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		System.out.println("confirm popup data:" + s1);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		String s2 = driver.switchTo().alert().getText();
		System.out.println("prompt popup data:" + s2);
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("HI");
		driver.switchTo().alert().accept();
		
		
		
		
}
}
