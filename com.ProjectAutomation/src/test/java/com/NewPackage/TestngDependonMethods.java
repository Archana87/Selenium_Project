package com.NewPackage;

import org.testng.annotations.Test;

public class TestngDependonMethods {
  @Test(dependsOnMethods = "sub1")
  public void add1() {
	  System.out.println("Addition");

  }
  @Test
  public void sub1() {
	  System.out.println("subtraction");
  }
}
