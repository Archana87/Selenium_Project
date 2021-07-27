package com.NewPackage;

import org.testng.annotations.Test;

public class TestngPriority {
  @Test
  public void f_method() {
	  System.out.println("F method");
  }
  @Test(priority=2)
  public void c_method() {
	  System.out.println("C method");
  }
  @Test
  public void a_method() {
	  System.out.println("A method");
  }
}
