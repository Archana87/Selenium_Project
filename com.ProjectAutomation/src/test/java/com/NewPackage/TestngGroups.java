package com.NewPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngGroups {
  @Test(groups="one")
  public void first() {
	  System.out.println("Smoke Testing");
  }
  @Test(groups="two")
  public void second() {
	  System.out.println("Functional Testing");
  }
  @Test(groups="one")
  public void third() {
	  System.out.println("Integration Testing");
  }
  @Test(groups="two")
  public void fourth() {
	  System.out.println("System Testing");
  
  Reporter.log("All testing types based on grouptype executed",true);
  }
}
