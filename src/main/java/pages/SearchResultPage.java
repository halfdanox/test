package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage  extends Menu {

	

	@FindBy(css="p")
	WebElement searchResult ;
		
	WebDriver driver; 
	
	public SearchResultPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
	public String getSearchResult(){
		 
		String Result_ = searchResult.getText().toString();
		
		Result_  = searchResult.getText();
		System.out.println(Result_);

		return Result_;
	}
}
