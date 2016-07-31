package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ProductPage extends Menu {

	
	
	
	@FindBy(id="addToCart")
	WebElement addToCartButton;
	@FindBy(id="quantity")
	WebElement quantityValue;
	@FindBy(xpath=".//*[@id='addToCartForm']/div/div/button[2]")
	WebElement IncreaseButton;
	@FindBy(className="show-campaigns")
	WebElement SeeCampaigns;
	@FindBy(css="recommended-products-title" )
	WebElement  RecommendProductTitle;
	@FindBy(css=".options-title.no-margin>b")
	WebElement OptionsTitle;
	@FindBy(className="productMessage")
	WebElement productmessage;
	@FindBy(css=".compare>a")
	WebElement compare;
	@FindBy(css=".productMessage")
	WebElement productwarningmessage;
	@FindBy(xpath=".//*[@id='pcwrapper']/div/div[1]/ul/li[1]/a/span[1]")
	WebElement removeproduct;


	public ProductPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void addToCart(){
		addToCartButton.click();
	
	}
	
	public void Increase(){
		IncreaseButton.click();
	
	}
	
	public void SeeCampagins(){
		SeeCampaigns.click();
	
	}
	public String getOptionsTitle(){
		
		return OptionsTitle.getText();
	}
	
public String getproductmessage(){
	
	return productmessage.getText();
}


public void ClickCompare(){
	compare.click();
	
}



public String getProductWarningMessage() {
	

return productwarningmessage.getText();
}
public void RemoveProduct(){
	removeproduct.click();
	
}


}
	
	
	

	

