package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3 {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	void demoTest(){
	softAssert.assertTrue(true);	
	softAssert.assertEquals("Welcome","welcome");
	softAssert.assertEquals("selenium", "selenium");
	System.out.println("Successfully passed");
	softAssert.assertAll();
	
	}
}
