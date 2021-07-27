package com.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Attributes {

	@Test
	
	public static WebElement firstname(WebDriver driver) {
		return driver.findElement(By.name("firstname"));
	}
	public static WebElement lastname(WebDriver driver) {
		return driver.findElement(By.name("lastname"));
	}
	public static WebElement mobilenum(WebDriver driver) {
		return driver.findElement(By.name("reg_email__"));
	}
	public static WebElement newpwd(WebDriver driver) {
		return driver.findElement(By.name("reg_passwd__"));
	}
	public static Select date(WebDriver driver) {
		 Select s = new Select(driver.findElement(By.xpath("//select[@id='day']")));
	// s.selectByVisibleText("5");
		return s;
		
	
	}
}
