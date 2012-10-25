package hm.edu;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class SimpleTests {

	@Test
	public void alwaysTrue() {
		Assert.assertEquals("foo", "foo");
	}
	
	@Test
	public void anotherTest() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void thirdTest() {
		Assert.assertTrue(true);
	}
}
