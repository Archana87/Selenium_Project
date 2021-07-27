package com.NewPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
public class DataProvider {
 Calculator test = new Calculator();
	
  @Test(dataProvider="dpaddition")
  public void addtest(int exp_value,int a,int b) {
	  Assert.assertEquals(test.add(a, b),exp_value);
	  System.out.println("Addition Completed");
  }
  
  @org.testng.annotations.DataProvider(name="dpaddition")
  public Object[][]getdata(){
	  return new Object[][] {{10,5,5},{50,20,30},{99,44,55}};
	  
  }
  
}
