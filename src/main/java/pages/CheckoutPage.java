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
	
	 
	//WebDriver driver; 
	@FindBy(id="addToCart")
	WebElement addToCartButton;
	@FindBy(className="quantity")
	WebElement quantity;
	
	@FindBy(css="addToCartForm")
	List<WebElement> ProductInsideCart ;
	


	//public CheckoutPage(WebDriver driver) {
		//super(driver);
	//	PageFactory.initElements(driver, this);
	//}


	public CheckoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public String getProductQuantity(){
		if(driver == null)
			System.out.println("driver is null");
		WebDriverWait w  = new WebDriverWait(driver,25);
	    w.until(ExpectedConditions.presenceOfElementLocated(By.className("quantity")));
		return  quantity.getAttribute("value");
	}
}
