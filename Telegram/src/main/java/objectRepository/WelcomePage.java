package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register")
	private WebElement RegisterLink;
	
	@FindBy(linkText = "Log in")
	private WebElement LoginLink;
	
	@FindBy (xpath = "//span[.='Shopping cart']")
	private WebElement CartLink;
	
	@FindBy(partialLinkText = "Books")
	private WebElement BooksLink;
	
	@FindBy(partialLinkText = "Computers")
	private WebElement ComputersLink;
	
	@FindBy(partialLinkText = "Electronics")
	private WebElement ElectronicsLink;

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getCartLink() {
		return CartLink;
	}

	public WebElement getBooksLink() {
		return BooksLink;
	}

	public WebElement getComputersLink() {
		return ComputersLink;
	}

	public WebElement getElectronicsLink() {
		return ElectronicsLink;
	}

}
