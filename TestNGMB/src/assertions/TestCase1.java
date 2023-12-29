package assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test
	public void logintest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh\\Desktop\\Webdriver APIs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://newtours.demoaut.com");
		
		WebElement usernametxt = driver.findElement(By.name("username"));
		WebElement passwordtxt = driver.findElement(By.name("password"));
		
		Assert.assertTrue(usernametxt.isDisplayed());
		Assert.assertFalse(passwordtxt.isDisplayed());
		
		driver.quit();
	}
}
