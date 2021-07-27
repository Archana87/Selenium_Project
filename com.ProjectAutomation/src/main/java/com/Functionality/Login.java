package com.Functionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Elements.Attributes;


public class Login {

	@Test
	public void f() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(5000);
		Attributes.firstname(driver).sendKeys("Archana");
		Attributes.lastname(driver).sendKeys("Lingampalli");
		Attributes.mobilenum(driver).sendKeys("9874456321");
		Attributes.newpwd(driver).sendKeys("Archana@87");
		//Attributes.date(driver).selectByValue("5");
		
		
	}
}
