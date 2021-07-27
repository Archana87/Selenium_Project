package com.NewPackage;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class NewClassTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		String A = new String("archana");
		String B = new String("archana");
		String C = new String("Lingampalli");
		assertEquals(A, C);
		System.out.println("Both A and B strings are equal");
		//Calculator calc = new Calculator();
		
		//public void add1() {
			//assertEquals(10, calc.ada);
		}
	}


