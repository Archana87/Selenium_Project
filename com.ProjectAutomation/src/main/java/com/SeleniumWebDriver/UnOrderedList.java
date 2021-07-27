package com.SeleniumWebDriver;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnOrderedList {

	@Test
	public void unordered() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/AutoComplete.html");
		driver.findElement(By.xpath("//input[@id='searchbox']")).sendKeys("s");
		Thread.sleep(1000);
		List<WebElement> element = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		int size = element.size();
		System.out.println("Count of the values in div dropdown : " + size);
		Thread.sleep(2000);
		for (WebElement unordered : element) {
			if (unordered.getText().equalsIgnoreCase("Australia")) {
				unordered.click();
				break;
			}
		}
		
	}
}
