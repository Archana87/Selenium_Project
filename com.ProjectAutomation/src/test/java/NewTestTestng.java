import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;

public class NewTestTestng {
	@Before
	 public void setup() {
		 System.out.println("Assert action performed");
	 }
	@Test
  //public void f() {
		/* String A = new String("archana");
	     String B = new String("archana");
		 String C = new String("Lingampalli");
	     String str = null;
	    int var1 = 22;
	    int var2 = 44;
	 int[] arr1 = {111};
	 int[] arr2 = {222};
	 
	 assertEquals(A, B);
		System.out.println("Assertequals statement is true");
		assertTrue(var1<var2);
		System.out.println("Asserttrue statement is true");
		assertFalse(var1==var2);
		System.out.println("Assertfalse statement is true");
		assertSame(A, B);
		System.out.println("Assertsame statement is true");
		assertNotSame(A, C);
		System.out.println("AssertNotSame statment is true");
		assertNull(str);
		System.out.println("Assertnull statement is true");
		assertNotNull(A);
		System.out.println("AssertNotNull statement is true");
		assertArrayEquals(arr1, arr1);
		System.out.println("AssertArrayEquals statement is true");
	}
	@After
	 public void setup1() {
		 System.out.println("Assert action completed");
	 }*/
		public void first() {
			System.out.println("first method");
		}
		@Test
		public void second() {
			System.out.println("second method");
		}
  }

