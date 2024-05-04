package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement BooksTitle;
	
	@FindBy(id = "products-orderby")
	private WebElement ProductDropdown;
	
	@FindBy(linkText = "Computing and Internet")
	private WebElement ComputingBook;
	
	@FindBy(linkText = "Copy of Computing and Internet EX")
	private WebElement InternetEX;
	
	@FindBy(linkText = "Fiction")
	private WebElement FictionBook;
	
	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement AddToCartLink;

	public WebElement getBooksTitle() {
		return BooksTitle;
	}

	public WebElement getProductDropdown() {
		return ProductDropdown;
	}

	public WebElement getComputingBook() {
		return ComputingBook;
	}

	public WebElement getInternetEX() {
		return InternetEX;
	}

	public WebElement getFictionBook() {
		return FictionBook;
	}

	public WebElement getAddToCartLink() {
		return AddToCartLink;
	}
	
	

}
