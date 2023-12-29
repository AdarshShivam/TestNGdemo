package listeners;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	void loginByEmail() {
		System.out.println("Login by email");
		Assert.assertEquals("adarsh", "adarsh");
	}
	
	@Test
	void loginByFb() {
		System.out.println("Login by fb");
		Assert.assertEquals("adarsh", "shivam");
	}
}
