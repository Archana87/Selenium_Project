package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitAndMaxMin {

	@Test
	public void waitmethods() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
      ele.sendKeys("archana@gmail.com");
		 System.out.println("Email given in email textbox" + ele);
		 Thread.sleep(2000);
		 //fluent wait
		 FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS);
		 fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Append ']")));
		
		 Thread.sleep(1000);
		 //minimizing the browser
		Dimension dim = new Dimension(350, 500);
		driver.manage().window().setSize(dim);
		Thread.sleep(2000);
		driver.close();
		
	}
	 
}
