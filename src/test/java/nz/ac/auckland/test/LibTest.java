package nz.ac.auckland.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibTest {

	@Test
	public void testMax() {
		assertEquals(nz.ac.auckland.Lib.max(30, 30, 30), 30);
	}
	@Test
	public void testMaxA() {
		assertEquals(nz.ac.auckland.Lib.max(30, 20, 10), 30);
	}
	@Test
	public void testMaxB() {
		assertEquals(nz.ac.auckland.Lib.max(10, 30, 20), 30);
	}
	@Test
	public void testMaxC() {
		assertEquals(nz.ac.auckland.Lib.max(10, 20, 30), 30);
	}

	@Test
	public void testMin() {
		assertEquals(nz.ac.auckland.Lib.min(30, 30, 30), 30);
	}
	@Test
	public void testMinA() {
		assertEquals(nz.ac.auckland.Lib.min(10, 20, 30), 10);
	}
	@Test
	public void testMinB() {
		assertEquals(nz.ac.auckland.Lib.min(30, 10, 20), 10);
	}
	@Test
	public void testMinC() {
		assertEquals(nz.ac.auckland.Lib.min(30, 20, 10), 10);
	}
	@Test
	public void testMinD() {
		assertEquals(nz.ac.auckland.Lib.min(-30, -20, -10), -30);
	}
	
	@Test
	public void testAbsP() {
		assertEquals(nz.ac.auckland.Lib.abs(10), 10);
	}
	
	@Test
	public void testAbsN() {
		assertEquals(nz.ac.auckland.Lib.abs(-10), 10);
	}


}
