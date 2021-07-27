package com.Functionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Elements.AttributesUsingPF;

public class LoginUsingPF {

	@Test
	public void f() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		PageFactory.initElements(driver, AttributesUsingPF.class);
		
		AttributesUsingPF.firstname.sendKeys("Archana");
		AttributesUsingPF.lastname.sendKeys("Lingampally");
		AttributesUsingPF.mobilenum.sendKeys("7845111111");
		AttributesUsingPF.newpwd.sendKeys("Archana@87");
		//AttributesUsingPF.date.selectByValue("4");
		AttributesUsingPF.gender.click();
		
	}
}
