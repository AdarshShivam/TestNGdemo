package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test2 {

	SoftAssert softAssert1 = new SoftAssert();
	SoftAssert softAssert2 = new SoftAssert();
//	Two unique objects are created because if 1 object is created and used in both and out of 2 methods, 
//	1 fails then the other will also fail by default
	
	@Test
	void demotest1() {
		softAssert1.assertEquals("welcome", "Wel");
		softAssert1.assertAll();
	}
	@Test
	void demotest2() {
		softAssert2.assertEquals("selenium", "selenium");
		softAssert2.assertAll();
	}
}
