package com.SeleniumWebDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class WindowHandle {

	@Test
	public void Windows() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElement(By.id("home")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> i = window.iterator();
		String w1 = i.next();
		String w2 = i.next();
		driver.switchTo().window(w2);
		String s = driver.getTitle();
		System.out.println("second window title :" + s);
		Thread.sleep(2000);
		driver.close();
		//2nd window
		Thread.sleep(5000);
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
		
		/*Set<String> window1 = driver.getWindowHandles();
		Iterator<String> i1 = window1.iterator();
		String w3 = i1.next();
		String w4 = i1.next();
		driver.switchTo().window(w3);
		String s1 = driver.getTitle();
		System.out.println("window title" + s1);*/
		
		
		
		
	}
}
