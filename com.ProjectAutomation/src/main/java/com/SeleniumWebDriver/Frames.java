package com.SeleniumWebDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Frames {

	@Test
	public void Commands() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
	driver.findElement(By.linkText("Frame")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//frames
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		
	  //nested frame
		
   int size =driver.findElements(By.xpath("//*[@src='nested.html']")).size();
	      System.out.println(size);
		driver.switchTo().frame(1);
		int size1 = driver.findElements(By.id("frame2")).size();
		System.out.println(size1);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("Click1")).click();
		
		
	
		
		
		
		
		
		
		
		
	}
}
