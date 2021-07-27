package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {

	@Test
	public void draganddropAutomation() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/home.html");
		Actions action =new Actions(driver);
	driver.findElement(By.linkText("Droppable")).click();
	Thread.sleep(1000);
	WebElement d = driver.findElement(By.id("draggable"));
	WebElement d1 = driver.findElement(By.id("droppable"));
	action.dragAndDrop(d, d1).build().perform();
	System.out.println("Successfully target element dragged into source element");
	driver.navigate().back();
	
	//another element for drag and drop
	driver.findElement(By.linkText("Draggable")).click();
	Thread.sleep(1000);
	WebElement element = driver.findElement(By.id("draggable"));
	Thread.sleep(1000);
     action.dragAndDropBy(element, 50, 80).build().perform();
     System.out.println("Successfully target element moved to the given axis");
	}
		
		
		
	}

