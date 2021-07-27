package com.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class AttributesUsingPF {

	
	@FindBy(name="firstname")
	public static WebElement firstname;
	
	@FindBy(name="lastname")
	public static WebElement lastname;
	@FindBy(name="reg_email__")
	public static WebElement mobilenum;
	@FindBy(name="reg_passwd__")
	public static WebElement newpwd;
	/*@FindBy(xpath="//select[@id='day']/option")
	public static Select date;*/
	@FindBy(name="sex")
	public static WebElement gender;
	
}
