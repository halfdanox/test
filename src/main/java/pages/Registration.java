package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration extends Menu{

	public Registration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	@FindBy(id="email")
	WebElement Email;
	@FindBy(id="password")
	WebElement password;
	@FindBy(css=".btn.full.btn-login-submit")
	WebElement giris;
	

	public void Signin(){

	System.out.println("Sign in fonksiyonuna geldim");	
	WebDriverWait w  = new WebDriverWait(driver,15);

    w.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
	System.out.println("email  elementi mevcut");	
	Email.sendKeys("hbotomasyon@gmail.com");
    password.sendKeys("135791357913579");
    giris.click();	
	}
	}
	
	
	

