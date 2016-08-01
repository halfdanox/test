package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage extends Menu {
	
	public static final int WAIT_SECOND = 25;
	 
	@FindBy(id="addToCart")
	WebElement addToCartButton;
	@FindBy(className="quantity")
	WebElement quantity;
	
	@FindBy(css="addToCartForm")
	List<WebElement> ProductInsideCart ;


	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	public String getProductQuantity(){
		WebDriverWait w  = new WebDriverWait(driver, WAIT_SECOND);
	    w.until(ExpectedConditions.presenceOfElementLocated(By.className("quantity")));
		return  quantity.getAttribute("value");
	}
}
