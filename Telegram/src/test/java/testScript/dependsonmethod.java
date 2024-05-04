package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dependsonmethod {
	@Test(invocationCount = 2,threadPoolSize = 3,enabled = false)
	public void register() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Register");
		driver.quit();
		
	
	}
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Login");
		driver.quit();
	}
	public void addtocart() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Addtocart");
		driver.quit();
	}
}
