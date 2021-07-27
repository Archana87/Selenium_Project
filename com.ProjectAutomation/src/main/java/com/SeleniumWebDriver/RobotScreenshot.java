package com.SeleniumWebDriver;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobotScreenshot {

	@Test
	public void screenshotusingrobot() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		
		//taking screnshot
		Robot r = new Robot();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(screen);
		BufferedImage source = r.createScreenCapture(rect);
		File Destination = new File("C:\\Users\\LARCHANA\\Desktop\\Screenshots\\screen1.jpg");
		ImageIO.write(source, "jpg", Destination);
		
	}
}
