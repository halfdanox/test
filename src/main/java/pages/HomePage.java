package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends Menu {
	
	

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	

	@FindBy(css=".links-global>div > div > div >:nth-child(1)")
	WebElement Name;
	
	
	public String getHesabim(){
		 
		WebDriverWait w  = new WebDriverWait(driver,15);

	    w.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".links-global>div > div > div >:nth-child(1)")));
		String Result_ = Name.getText().toString();
		
		Result_  = Name.getText();
		System.out.println(Result_);

		return Result_;
	
	}
	
}
