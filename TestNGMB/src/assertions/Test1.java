package assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	void demoTest() {
		Assert.assertTrue(true);
		Assert.assertEquals("welcome","welcome");
		Assert.assertEquals("selenium", "selenium");;
		System.out.println("Successfully passed");
	}
}
