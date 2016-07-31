package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menu {


	
	WebDriver driver;
	
	
	
	
	@FindBy(id="productSearch")
	WebElement SearchArea;
	@FindBy(id="buttonProductSearch")
	WebElement Ara ; 
	@FindBy(id="login")
	WebElement Login ; 
	

	public Menu(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void searchText(String searchStr){
		SearchArea.sendKeys(searchStr);
		SearchArea.sendKeys(Keys.ENTER);
	}
	
	
	public void Log_in() throws Throwable
	{
		System.out.println("fonksiyona geldi");

				
		WebElement Navigasyon2 = driver.findElement(By.id("myAccount"));
	
		Actions  builder = new Actions(driver);
		builder.moveToElement(Navigasyon2).build().perform();
		WebDriverWait wait  = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(Login));
		Login.click();
		
		
		
		
	}
	
	
	

}
