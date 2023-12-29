package BatchTesting;
import org.testng.annotations.Test;

public class SignUpTest {
	
	@Test
	public void SignUpByEmail() {
		System.out.println("Signup by email");
		}
	
	@Test
	public void SignUpByFb() {
		System.out.println("Signup by fb");
	}
	
	@Test
	public void SignUpByTwitter() {
		System.out.println("Signup by twitter");
	}
	
}
