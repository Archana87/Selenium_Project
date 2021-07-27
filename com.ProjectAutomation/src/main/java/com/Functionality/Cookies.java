package com.Functionality;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;

import java.util.Date;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Cookies {
@SuppressWarnings({ "deprecation", "resource" })
@Test
public void Addcookies() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\Chromedriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	
	Cookie ck = new Cookie("cookies1", "123");
	driver.manage().addCookie(ck);
	Set<Cookie>cookies = driver.manage().getCookies();
	System.out.println("size of cookies " + cookies.size());
	for (Cookie cookie : cookies) {
		{
			System.out.println(cookie.getName()+":"+cookie.getValue()+":"+cookie.getExpiry()+":"+cookie.getPath()+":"+cookie.isSecure()+":"+cookie.getName());
	}
	}
}
		@Test
		public void deletecookies1() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\Chromedriver\\chromedriver.exe");
			WebDriver driver1 = new ChromeDriver();
			driver1.manage().window().maximize();
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver1.get("https://www.facebook.com/");
			Cookie c2 = new Cookie("cookies1", "123");
			driver1.manage().deleteCookie(c2);
			Set<Cookie>cookies = driver1.manage().getCookies();
			System.out.println("size of cookies " + cookies.size());
			for (Cookie cookie : cookies) {
				{
					System.out.println(cookie.getName()+":"+cookie.getValue()+":"+cookie.getExpiry()+":"+cookie.getPath()+":"+cookie.isSecure()+":"+cookie.getName());
			}
		}
		}
		
		@Test
		public void deleteallcookies() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LARCHANA\\Downloads\\Chromedriver\\chromedriver.exe");
			WebDriver driver1 = new ChromeDriver();
			driver1.manage().window().maximize();
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver1.get("https://www.facebook.com/");
			Cookie c2 = new Cookie("cookies1", "123");
			driver1.manage().deleteAllCookies();
			Set<Cookie>cookies = driver1.manage().getCookies();
			System.out.println("size of cookies " + cookies.size());
			for (Cookie cookie : cookies) {
				{
					System.out.println(cookie.getName()+":"+cookie.getValue()+":"+cookie.getExpiry()+":"+cookie.getPath()+":"+cookie.isSecure()+":"+cookie.getName());
			}
		}
	/*try {
	 * 
	FileReader fr = new FileReader(f);
	BufferedReader bf = new BufferedReader(fr);	
	String str;
		while ((str=bf.readLine())!=null) {
			StringTokenizer token = new StringTokenizer(str,";");
			while (token.hasMoreTokens()) {
				String name = token.nextToken();
				String value = token.nextToken();
				String domain = token.nextToken();
				String path = token.nextToken();
				Date expiry = null;
				String val;
				if (!(val=token.nextToken()).equals("null"))
				{
					expiry = new Date(val);
				}
				Boolean isSecure = new Boolean(token.nextToken()).booleanValue();
				Cookie c = new Cookie(name, value, domain, path, expiry, isSecure);
				System.out.println(c);
				driver.manage().addCookie(c);*/
		
	}


	

	/*driver.findElement(By.name("firstname")).sendKeys("Archana");
	driver.findElement(By.name("lastname")).sendKeys("Lingampalli");*/
	



	

}
