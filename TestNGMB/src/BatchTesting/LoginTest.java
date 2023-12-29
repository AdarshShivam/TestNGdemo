package BatchTesting;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void LoginByEmail() {
		System.out.println("login by email");
		}
	
	@Test
	public void LoginByFb() {
		System.out.println("login by fb");
	}
	
	@Test
	public void LoginByTwitter() {
		System.out.println("login by twitter");
	}
}
