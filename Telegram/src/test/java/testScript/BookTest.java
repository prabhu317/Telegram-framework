package testScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.BooksPage;
import objectRepository.WelcomePage;

public class BookTest {
	@Test
	public void books_001() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcome=new WelcomePage(driver);
		BooksPage books=new BooksPage(driver);
		
		welcome.getBooksLink().click();
		if(books.getBooksTitle().getText().equals("Books")) 
			System.out.println("TEST CASE PASS");
		else
			System.out.println("TEST CASE FAIL");
		
	}
	

}
