package com.NewPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassonAsserts {
 

 @Before
 public void setup() {
	 System.out.println("Assert action performed");
 }
 @Test
	public void test() {
		//fail("Not yet implemented");
		int[] array = {22};
		int[] array1 = {22};
		
		assertArrayEquals(array, array1);
		System.out.println("Assertarrayequals statement is TRUE");
	}
 @After
 public void setup1() {
	 System.out.println("Assert action completed");
 }

}
