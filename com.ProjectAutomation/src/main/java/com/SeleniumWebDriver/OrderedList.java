package com.SeleniumWebDriver;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OrderedList {

	@Test
	public void orderlist() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Selectable.html");
		driver.findElement(By.xpath("//a[text()='Serialize ']")).click();
		Thread.sleep(3000);
		List<WebElement> element = driver.findElements(By.xpath("//ul[@class='SerializeFunc']/li"));
		int size = element.size();
		System.out.println("size of dropdown values :" + size);
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(element.get(0))
		    .click(element.get(2))
		    .click(element.get(4))
		    .click(element.get(6)).build().perform();
		
		
		
		
	}
}
