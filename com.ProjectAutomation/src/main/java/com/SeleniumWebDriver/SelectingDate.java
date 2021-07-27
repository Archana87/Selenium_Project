package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectingDate {

	@Test
	public void datepicker() throws Throwable {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class='imgdp']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('datepicker1').value='07/07/2020'");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('datepicker2').value='07/07/2020'");
		Thread.sleep(2000);
		js.executeScript("scroll(0, 550)");
	}
}
