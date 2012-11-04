import junit.framework.Assert;

import org.testng.annotations.Test;

public class SimpleTest {

	// trigger test
	@Test
	public void alwaysTrue() {
		Assert.assertTrue(true);
	}
}
